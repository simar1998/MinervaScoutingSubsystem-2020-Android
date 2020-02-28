package com.example.minervascoutingsubsystemandroid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.minervascoutingsubsystemandroid.structure.schedule.Match;
import com.example.minervascoutingsubsystemandroid.structure.schedule.MatchLists;
import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;
import com.example.minervascoutingsubsystemandroid.ui.PagesEnum;
import com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.actions.ActionsFragment;
import com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.initInfo.InitInfoFragment;
import com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.post.PostFragment;
import com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.pre.PreFragment;
import com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.settings.Settings2Fragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static com.example.minervascoutingsubsystemandroid.CONST.MY_PREFS_NAME;
import static com.example.minervascoutingsubsystemandroid.communications.tcp.SocketManager.initSocketComms;

public class MainActivity extends AppCompatActivity implements OnFragmentChangeListener {

    private AppBarConfiguration mAppBarConfiguration;

    public static MainActivity mainActivity;

    public static MatchLists matchLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        NetworkCrawlerSubroutine networkSniffTask = new NetworkCrawlerSubroutine(this);
//        networkSniffTask.execute();
        initSocketComms();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery,
                R.id.nav_tools, R.id.nav_tcp, R.id.nav_data)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        mainActivity = this;

        JSONArray obj = null;
        try {
            obj = new JSONArray(readFromFile(this.getApplicationContext(),"matchList.json"));
            ArrayList<Match> matches = new ArrayList<>();
            for (int i = 0 ; i < obj.length(); i++){
                JSONObject jsonObject = new JSONObject(obj.get(i).toString());
                JSONObject alliances = new JSONObject(jsonObject.get("alliances").toString());
                JSONObject red = new JSONObject(alliances.getJSONObject("red").toString());
                JSONObject blue = new JSONObject(alliances.getJSONObject("blue").toString());
                JSONArray redArray = new JSONArray(red.get("team_keys").toString());
                JSONArray blueArray = new JSONArray(blue.get("team_keys").toString());
                System.out.println(redArray.get(0));
                matches.add(new Match(redArray.get(0),redArray.get(1),redArray.get(2),blueArray.get(0),blueArray.get(1),blueArray.get(2),jsonObject.get("match_number").toString()));
            }
            MainActivity.matchLists = new MatchLists(matches);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        setLastStoredInfo();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }



    @Override
    public void onFragmentChange(int n) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (n == 1) {
            InitInfoFragment initInfoFragment = new InitInfoFragment();
            ft.replace(R.id.fragment_container, initInfoFragment);
            ft.commit();
    }
        else if (n == 2) {
            PreFragment preFragment = new PreFragment();
            ft.replace(R.id.fragment_container, preFragment);
            ft.commit();
        }
        else if (n == 3) {
            ActionsFragment actionsFragment = new ActionsFragment();
            ft.replace(R.id.fragment_container, actionsFragment);
            ft.commit();
        }
        else if (n == 4) {
            PostFragment postFragment = new PostFragment();
            ft.replace(R.id.fragment_container, postFragment);
            ft.commit();
        }
        else if (n == 5){
            Settings2Fragment settings2Fragment = new Settings2Fragment();
            ft.replace(R.id.fragment_container,settings2Fragment);
            ft.commit();
        }
    }

    public static String readFromFile(Context context, String fileName){
        String line = null;

        try {
            FileInputStream fileInputStream = new FileInputStream (new File(Environment.getExternalStorageDirectory().getAbsolutePath() +File.separator+ "Scouting_App_2020" +File.separator+fileName));
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder stringBuilder = new StringBuilder();

            while ( (line = bufferedReader.readLine()) != null )
            {
                stringBuilder.append(line + System.getProperty("line.separator"));
            }
            fileInputStream.close();
            line = stringBuilder.toString();

            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            Log.d("LOG", ex.getMessage());
        }
        catch(IOException ex) {
            Log.d("LOG", ex.getMessage());
        }
        return line;
    }

    public void setLastStoredInfo(){
        try {
            SharedPreferences prefs = MainActivity.mainActivity.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
            String eventCode = prefs.getString("eventCode", "No name defined");//"No name defined" is the default value.
            String teamNum = prefs.getString("teamNum", "0"); //0 is the default value.
            String postIP = prefs.getString("postIP", "https://scouting.runnymederobotics.com"); //0 is the default value.
            CONST.postURI = postIP;
            CONST.scoutTeam = Integer.parseInt(teamNum);
            CONST.eventName = eventCode;
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
