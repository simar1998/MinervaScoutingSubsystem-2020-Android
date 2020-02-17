package com.example.minervascoutingsubsystemandroid.communications.tcp;

import android.util.Base64;

import com.example.minervascoutingsubsystemandroid.CONST;
import com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 * @author Simarpal Kalsi
 * Live Long and Prosper
 */
public class SocketCommunication implements Runnable{

    SocketStatus socketStatus = SocketStatus.DISCONNECTED;
    Thread socketThread;
    Socket socket;
    String tempString;
    private PrintWriter socketBufferOut;
    private BufferedReader socketBufferIn;
    private TcpCommunication.LogMessage tempLogMessage;

    public SocketCommunication(boolean run) {

        socketThread = new Thread(this);
        if (run){
            socketThread.start();
            socketStatus = SocketStatus.ATTEMPTING;
        }
    }

    @Override
    public void run() {

        if (socketStatus == SocketStatus.DIABLED){
            throw new RuntimeException("Socket communication module is disabled");
        }

        if (socketStatus == SocketStatus.ATTEMPTING){
            try {
                socket = new Socket("192.168.99.1",1310);

                if (socket.isConnected()){
                    socketStatus = SocketStatus.CONNECTED;
                }

                //sends the message to the server
                socketBufferOut = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

                //receives the message which the server sends back
                socketBufferIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                while (socketStatus == SocketStatus.CONNECTED){

                    tempString = socketBufferIn.readLine();

                    if (tempString != null ){

                        if (tempString.equals("EXIT")){
                            socketStatus = SocketStatus.DISCONNECTED;
                            socket.close();
                            break;
                        }

                        if (tempLogMessage != null){
                            socketBufferOut.write(Base64.encodeToString(tempLogMessage.toByteArray(),Base64.DEFAULT));
                            tempLogMessage = null;
                        }

                        SocketManager.socketMessageInterpreter(tempString);
                    }

                }



            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }

    public TcpCommunication.LogMessage getTempLogMessage() {
        return tempLogMessage;
    }

    public void setTempLogMessage(TcpCommunication.LogMessage tempLogMessage) {
        if (this.tempLogMessage != null){
            throw new RuntimeException("Log message val not null therefore can not change TODO implement buffering system");
        }
        this.tempLogMessage = tempLogMessage;
    }
}
