package com.example.minervascoutingsubsystemandroid;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;
import com.example.minervascoutingsubsystemandroid.ui.PagesEnum;
import com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.actions.ActionsFragment;
import com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.initInfo.InitInfoFragment;
import com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.post.PostFragment;
import com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.pre.PreFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import static com.example.minervascoutingsubsystemandroid.communications.tcp.SocketManager.initSocketComms;

public class MainActivity extends AppCompatActivity implements OnFragmentChangeListener {

    private AppBarConfiguration mAppBarConfiguration;

    public static MainActivity mainActivity;

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
    }
}
