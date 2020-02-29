package com.example.minervascoutingsubsystemandroid.communications;

import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;

import com.example.minervascoutingsubsystemandroid.CONST;
import com.example.minervascoutingsubsystemandroid.MainActivity;
import com.example.minervascoutingsubsystemandroid.structure.models.MatchSubmit;
import com.example.minervascoutingsubsystemandroid.structure.models.MatchSubmitManager;
import com.example.minervascoutingsubsystemandroid.structure.models.MatchSubmitWrapper;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TestNetworkConnectionThread implements Runnable {

    boolean connectionStatus;
    boolean attemptToSubmitOnConnection;
    Handler handler;

    public TestNetworkConnectionThread(boolean attemptToSubmitOnConnection, Handler handler) {
        this.attemptToSubmitOnConnection = attemptToSubmitOnConnection;
        this.handler = handler;
    }

    @Override
    public void run() {
        try {

            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            Request request = new Request.Builder()
                    .url("http://scouting.runnymederobotics.com/minervascouting2020/api/test/get")
                    .method("GET", null)
                    .build();
            try {
                Response response = client.newCall(request).execute();
                if (response.body().equals("GET REQUEST SUCCESSFUL")) ;
                {
                    System.out.println("NETWORK STATUS FALSE;");
                    connectionStatus = true;
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("NETWORK STATUS TRUE;");
                connectionStatus = false;
            }

            if (attemptToSubmitOnConnection) {
                MatchSubmitWrapper matchSubmitWrapper = MatchSubmitManager.getMatchSubmitsFromPref();
                for (final MatchSubmit matchSubmit : matchSubmitWrapper.getMatchSubmits()) {
                    if (!matchSubmit.isSubmitted()) {
                        String submissionStr = MainActivity.readFromFile(matchSubmit.getMatchFileName());

                        final OkHttpClient postClient = new OkHttpClient().newBuilder()
                                .build();
                        MediaType mediaType = MediaType.parse("text/plain");
                        RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                                .addFormDataPart("json", submissionStr)
                                .build();
                        System.out.println(CONST.postURI + "/minervascouting2020/api/upload/submittedInfoWrapperJSON");
                        final Request postRequest = new Request.Builder()
                                .url(CONST.postURI + "/minervascouting2020/api/upload/submittedInfoWrapperJSON")
                                .method("POST", body)
                                .build();
                        AsyncTask.execute(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    Response response = postClient.newCall(postRequest).execute();
                                    if (response.isSuccessful()) {
                                        Log.i("STATUS","SUBMITTED MATCH");
                                        MatchSubmitManager.changeMatchSubmitStatus(matchSubmit.getMatchFileName(), true);
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        });

                    }

                }
            }
            handler.postDelayed(this,120000);
        }catch (Exception e){
            handler.postDelayed(this,120000);
        }


    }
}
