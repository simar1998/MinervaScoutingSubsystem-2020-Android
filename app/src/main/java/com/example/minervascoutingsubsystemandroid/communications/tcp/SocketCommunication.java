package com.example.minervascoutingsubsystemandroid.communications.tcp;

import com.example.minervascoutingsubsystemandroid.CONST;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SocketCommunication implements Runnable{

    SocketStatus socketStatus;
    InetAddress serverAddress;
    Thread socketThread;

    public SocketCommunication(boolean run) {
        try {
            serverAddress = InetAddress.getByName(CONST.TCP_SERVER_IP);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        socketThread = new Thread(this);
        if (run){
            socketThread.start();
            socketStatus = SocketStatus.ATTEMPTING;
        }
    }



    @Override
    public void run() {

    }





}
