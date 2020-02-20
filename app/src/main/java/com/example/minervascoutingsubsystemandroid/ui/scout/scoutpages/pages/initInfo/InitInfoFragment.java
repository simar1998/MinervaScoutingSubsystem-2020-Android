package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.initInfo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.minervascoutingsubsystemandroid.R;
import com.example.minervascoutingsubsystemandroid.structure.models.SubmittedGame;
import com.example.minervascoutingsubsystemandroid.structure.schedule.Match;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * TODD: Add actions fro fragment switching buttons (pre, aciton, post)
 */
public class InitInfoFragment  extends Fragment {

    private int layout;


    EditText scoutNameEditTxt;
    EditText matchNumEditTxt;

    Button red1Btn;
    Button red2Btn;
    Button red3Btn;
    Button b1ue1Btn;
    Button blue2Btn;
    Button blue3Btn;





    EditText teamNumEditTxt;

    CheckBox matchReplayChkBox;

    Button submitInitScreenBtn;
    InitInfoViewModel initInfoViewModel;


    String alliance = null;

    SubmittedGame submittedGame = new SubmittedGame();
    @SuppressLint("ValidFragment")
    public  InitInfoFragment(int layout){
        this.layout = layout;
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scout_initinfo,container,false);




        scoutNameEditTxt = (EditText) view.findViewById(R.id.scout_name_editText);
        matchNumEditTxt = (EditText) view.findViewById(R.id.match_num_editText);

        red1Btn = (Button) view.findViewById(R.id.red1_btn);
        red2Btn = (Button) view.findViewById(R.id.red2_btn);
        red3Btn = (Button) view.findViewById(R.id.red3_btn);

        b1ue1Btn = (Button) view.findViewById(R.id.blue1_btn);
        blue2Btn = (Button) view.findViewById(R.id.blue2_btn);
        blue3Btn = (Button) view.findViewById(R.id.blue3_btn);

        matchReplayChkBox = (CheckBox) view.findViewById(R.id.replayedMatch_chkBox);
        teamNumEditTxt = (EditText) view.findViewById(R.id.teamNum_editTxt);



        final ArrayList<Button> allianceButtons = new ArrayList<Button>(Arrays.asList(red1Btn,red2Btn,red3Btn,b1ue1Btn,blue2Btn,blue3Btn));

        matchNumEditTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            /**
             * TODO: update teams on the alliance buttons once match # is entered
             */
            public void afterTextChanged(Editable editable) {

                Match match = new Match();
            }
        });

       for(int i = 0; i < allianceButtons.size(); i++){
            final int copyOfI = i;
           allianceButtons.get(i).setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   teamNumEditTxt.setText(allianceButtons.get(copyOfI).getText());
                   alliance = allianceButtons.get(copyOfI).getText().toString();
               }
           });

       }

       submitInitScreenBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String scoutName = scoutNameEditTxt.getText().toString();
               String matchNum = matchNumEditTxt.getText().toString();
               String teamNum = teamNumEditTxt.getText().toString();
               if( !(scoutName.matches("")))
               {
                   Toast.makeText(getContext(), "You have not entered the scout name", Toast.LENGTH_SHORT).show();
               }
               else if(!(matchNum.matches("")))
               {
                   Toast.makeText(getContext(),"Please enter a match number", Toast.LENGTH_SHORT).show();
               }
               else if (!(teamNum.matches("")))
               {
                   Toast.makeText(getContext(),"Please enter a team number", Toast.LENGTH_SHORT).show();
               }
               else {


                        sendInfoTpSubmittedMatch(scoutName,matchNum,teamNum);
               }
           }
       });



//        initInfoViewModel = ViewModelProviders.of(this).get(InitInfoViewModel.class);
//        //initInfoViewModel.setOnClickTeamNumsOnClick(buttonArrayList);
//        View root = inflater.inflate(R.layout.fragment_schedule, container, false);
//
//
//        return root;

        return view;
    }
    public void sendInfoTpSubmittedMatch(String scoutName, String matchNum, String teamNum){

        //alliance
        if(alliance != null){
            submittedGame.setAlliance(alliance.charAt(0));
        }

        //match num
        submittedGame.setMatch(Integer.parseInt(matchNum));

        //replayed int
        if(matchReplayChkBox.isChecked()){
            submittedGame.setNumReplayed(1);
        }
        else{
            submittedGame.setNumReplayed(0);
        }

        //scout name
        submittedGame.setScoutName(scoutName);

        //team num
        submittedGame.setTeamNum(Integer.parseInt(teamNum));


    }

}
