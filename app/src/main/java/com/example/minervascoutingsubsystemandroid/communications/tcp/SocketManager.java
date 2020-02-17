package com.example.minervascoutingsubsystemandroid.communications.tcp;

import android.util.Base64;
import com.example.minervascoutingsubsystemandroid.communications.command.CommandExecutorService;
import com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * @author Simarpal Kalsi
 * Live Long and Prosper
 */
public class SocketManager {

    private static SocketCommunication socketCommunication;

    public static void initSocketComms(){
//        if (NetworkCrawlerSubroutine.tcpSocketIP.equals("")){
//            System.out.println("Please run network sniff first");
//        }
        socketCommunication = new SocketCommunication(true);
    }

    public static void socketMessageInterpreter(String socketMessage){
        byte[] messageByte = Base64.decode(socketMessage,Base64.DEFAULT);
        TcpCommunication.CommandMessage commandMessage = null;
        try {
            commandMessage = TcpCommunication.CommandMessage.parseFrom(messageByte);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        assert commandMessage != null;
        CommandExecutorService.executeIncomingCommand(commandMessage);
    }

    public static void dispatchLogMessage(TcpCommunication.LogMessage logMessage){
        socketCommunication.setTempLogMessage(logMessage);
    }

}
