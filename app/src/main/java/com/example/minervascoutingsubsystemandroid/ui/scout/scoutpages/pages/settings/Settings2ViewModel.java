package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.minervascoutingsubsystemandroid.CONST;
import com.example.minervascoutingsubsystemandroid.MainActivity;
import com.example.minervascoutingsubsystemandroid.structure.schedule.Match;
import com.example.minervascoutingsubsystemandroid.structure.schedule.MatchLists;
import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static android.content.Context.MODE_PRIVATE;
import static com.example.minervascoutingsubsystemandroid.CONST.MY_PREFS_NAME;

public class Settings2ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    Fragment fragment;
    OnFragmentChangeListener fragmentChangeListener;

    public Settings2ViewModel(Fragment fragment, OnFragmentChangeListener fragmentChangeListener) {
        this.fragment = fragment;
        mText = new MutableLiveData<>();
        mText.setValue("This is settings fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public void setLastStoredInfo(final EditText scoutTeam, final EditText eventEditText, EditText postIPEditText){
        try {
            SharedPreferences prefs = MainActivity.mainActivity.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
            String eventCode = prefs.getString("eventCode", "No name defined");//"No name defined" is the default value.
            String teamNum = prefs.getString("teamNum", "0"); //0 is the default value.
            String postIP = prefs.getString("postIP", "https://scouting.runnymederobotics.com"); //0 is the default value.
            scoutTeam.setText(teamNum);
            eventEditText.setText(eventCode);
            postIPEditText.setText(postIP);
            CONST.postURI = postIP;
            CONST.scoutTeam = Integer.parseInt(scoutTeam.getText().toString());
            CONST.eventName = eventCode;

        }
        catch (Exception e){
            e.printStackTrace();
            //scoutTeam.setText("");
            //eventEditText.setText("");
        }

    }

    public void applyOnClickListener(Button button, final EditText scoutTeam, final EditText eventEditText, final EditText postIP, final OnFragmentChangeListener fragmentChangeListener){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AsyncTask.execute(new Runnable() {
                    @Override
                    public void run() {

                SharedPreferences.Editor editor = MainActivity.mainActivity.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
                try {
                    editor.putString("teamNum", scoutTeam.getText().toString());
                    editor.putString("eventCode", eventEditText.getText().toString());
                    editor.putString("postIP",postIP.getText().toString());
                    editor.apply();
                    CONST.postURI = postIP.getText().toString();
                    CONST.scoutTeam = Integer.parseInt(scoutTeam.getText().toString());
                    CONST.eventName = eventEditText.getText().toString();
                }catch (Exception e){
                    fragmentChangeListener.onFragmentChange(1);
                    e.printStackTrace();
                    return;
                }

                OkHttpClient client = new OkHttpClient().newBuilder()
                        .build();
                        System.out.println(eventEditText.getText().toString());
                Request request = new Request.Builder()
                        .url("https://www.thebluealliance.com/api/v3/event/"+eventEditText.getText().toString()+"/matches?X-TBA-Auth-Key=m38Xr7LtgoyyzBp8OdbH872fZGpjmRHt3xy3tvJXKq9OzeLnPTwXK6aQp8pRlSUi")
                        .method("GET", null)
                        .build();
                try {
                    Response response = client.newCall(request).execute();
                    File file = new File(MainActivity.mainActivity.getFilesDir(),"minerva");
                    if(!file.exists()){
                        file.mkdir();
                    }
                    try{
                        String str = response.body().string();
                        writeToFile(str,"matchlist.json",fragment.getContext());
                        JSONArray obj = new JSONArray(str);
                        ArrayList<Match> matches = new ArrayList<>();
                        for (int i = 0 ; i < obj.length(); i++){
                            JSONObject jsonObject = new JSONObject(obj.get(i).toString());
                            JSONObject alliances = new JSONObject(jsonObject.get("alliances").toString());
                            JSONObject red = new JSONObject(alliances.getJSONObject("red").toString());
                            JSONObject blue = new JSONObject(alliances.getJSONObject("blue").toString());
                            JSONArray redArray = new JSONArray(red.get("team_keys").toString());
                            JSONArray blueArray = new JSONArray(blue.get("team_keys").toString());
                            matches.add(new Match(redArray.get(0),redArray.get(1),redArray.get(2),blueArray.get(0),blueArray.get(1),blueArray.get(2),jsonObject.get("match_number").toString()));
                        }
                        MainActivity.matchLists = new MatchLists(matches);
                        fragmentChangeListener.onFragmentChange(1);

                    }catch (Exception e){
                        e.printStackTrace();
                        fragmentChangeListener.onFragmentChange(1);

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    fragmentChangeListener.onFragmentChange(1);
                }

            }
        });

            }
        });



    }

    public static void writeToFile(String data, String fileName, Context context) throws IOException {
        File root = Environment.getExternalStorageDirectory();

        File outDir = new File(root.getAbsolutePath() + File.separator + "Scouting_App_2020");
        Writer writer;
        boolean success = true;
        if (!outDir.exists()) {
            success = outDir.mkdirs();
        }
        if (success) {
            File outPutFile = new File(outDir, fileName);
            writer = new PrintWriter(new FileWriter(outPutFile));
            writer.write(data);
            writer.close();
            writer.flush();
        } else {
            Log.e("Error","Folder not created properly");
        }
    }


}