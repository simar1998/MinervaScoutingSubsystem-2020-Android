package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.initInfo;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;

import com.example.minervascoutingsubsystemandroid.structure.models.SubmittedGame;
import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;
import com.example.minervascoutingsubsystemandroid.ui.scout.ScoutFragment;

import java.util.ArrayList;

public class InitInfoViewModel extends ViewModel {


    OnFragmentChangeListener fragmentChangeListener;
    public SubmittedGame submittedGame = new SubmittedGame();
    Fragment fragment;

    /**
     * Constructor passes the fragment object and the OnFragmentChangeListener object
     * @param fragment
     * @param onFragmentChangeListener
     */
    public InitInfoViewModel(Fragment fragment, OnFragmentChangeListener onFragmentChangeListener) {
        this.fragment = fragment;
        this.fragmentChangeListener = onFragmentChangeListener;
    }


    /**
     * Sets the on Click listener to get the team nuimber info and set the alliance char
     * @param buttons
     * @param teamNumEditTxt
     */
    public void setOnClickTeamNumsOnClick(final ArrayList<Button> buttons, final EditText teamNumEditTxt) {
        for (View view : buttons) {
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    teamNumEditTxt.setText(((Button)view).getText());
                    submittedGame.setAlliance((buttons.indexOf(view) > 2) ? 'r' : 'b');
                }
            });
        }
    }

    /**
     * Scout Info button listener will construct the Submit InitInfo Object and change the fragment when initiated
     * @param button
     * @param scoutNameEditTxt
     * @param matchNumEditTxt
     * @param teamNumEditTxt
     * @param checkBox
     */
  public void scoutInfoClickListener(Button button, final EditText scoutNameEditTxt, final EditText matchNumEditTxt, final EditText teamNumEditTxt, final CheckBox checkBox){
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String scoutName = scoutNameEditTxt.getText().toString();
              String matchNum = matchNumEditTxt.getText().toString();
              String teamNum = teamNumEditTxt.getText().toString();
              if( (scoutName.matches("")))
              {
                  Toast.makeText(fragment.getContext(), "You have not entered the scout name", Toast.LENGTH_SHORT).show();
              }
              else if((matchNum.matches("")))
              {
                  Toast.makeText(fragment.getContext(),"Please enter a match number", Toast.LENGTH_SHORT).show();
              }
              else if ((teamNum.matches("")))
              {
                  Toast.makeText(fragment.getContext(),"Please enter a team number", Toast.LENGTH_SHORT).show();
              }
              else {
                  sendInfoTpSubmittedMatch(checkBox,scoutName,matchNum,teamNum);
                  ScoutFragment.submittedInfoWrapper.setSubmittedGame(submittedGame);
                  fragmentChangeListener.onFragmentChange(2);
              }
          }
      });
  }

    /**
     * Constructs the submittedGame object
     * @param matchReplayChkBox
     * @param scoutName
     * @param matchNum
     * @param teamNum
     */
    private void sendInfoTpSubmittedMatch(CheckBox matchReplayChkBox, String scoutName, String matchNum, String teamNum){


        submittedGame.setMatchNum(Integer.parseInt(matchNum));
        if(matchReplayChkBox.isChecked()){
            submittedGame.setNumReplayed(1);
        }
        else{
            submittedGame.setNumReplayed(0);
        }

        submittedGame.setScoutName(scoutName);


        try {
            submittedGame.setTeamNum(Integer.parseInt(teamNum));
        }catch (Exception e){
            submittedGame.setTeamNum(-1);
        }
    }

}
