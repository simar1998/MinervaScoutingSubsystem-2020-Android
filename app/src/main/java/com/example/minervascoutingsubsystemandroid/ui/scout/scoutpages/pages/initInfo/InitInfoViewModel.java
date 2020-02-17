package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.initInfo;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.lifecycle.ViewModel;


import com.example.minervascoutingsubsystemandroid.structure.models.SubmittedGame;

public class InitInfoViewModel extends ViewModel {

    EditText scoutNameEditTxt;
    EditText matchNumEditTxt;

    Button red1Btn;
    Button red2Btn;
    Button red3Btn;
    Button b1ueBtn;
    Button blue2Btn;
    Button blue3Btn;

    EditText teamNumEditTxt;

    CheckBox matchReplayChkBox;

    Button submitInitScreenBtn;

    private int team;


    public InitInfoViewModel() {
    }


    public void setOnClickTeamNumsOnClick(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SubmittedGame  submittedGame = new SubmittedGame();





            }
        });
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
