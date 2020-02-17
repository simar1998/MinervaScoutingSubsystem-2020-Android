package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.initInfo;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.lifecycle.ViewModel;


import com.example.minervascoutingsubsystemandroid.structure.models.SubmittedGame;

import java.util.ArrayList;

public class InitInfoViewModel extends ViewModel {


    private int team;


    public InitInfoViewModel() {
    }


    public void setOnClickTeamNumsOnClick(ArrayList<View> views) {
        for (View view : views) {
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SubmittedGame submittedGame = new SubmittedGame();


                }
            });
        }
    }

    public int buttonListner(final Button btn){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return team;
    }
}
