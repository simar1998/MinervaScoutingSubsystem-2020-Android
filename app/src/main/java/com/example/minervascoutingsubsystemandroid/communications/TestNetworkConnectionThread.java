package com.example.minervascoutingsubsystemandroid.communications;

import com.example.minervascoutingsubsystemandroid.CONST;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TestNetworkConnectionThread implements Runnable {

    boolean connectionStatus;

    public TestNetworkConnectionThread() {
        this.connectionStatus = connectionStatus;
    }

    @Override
    public void run() {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("http://scouting.runnymederobotics.com/minervascouting2020/api/test/get")
                .method("GET", null)
                .build();
        try {
            Response response = client.newCall(request).execute();
            if (response.body().equals("GET REQUEST SUCCESSFUL"));{
                connectionStatus = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
            connectionStatus = false;
        }
    }
}
