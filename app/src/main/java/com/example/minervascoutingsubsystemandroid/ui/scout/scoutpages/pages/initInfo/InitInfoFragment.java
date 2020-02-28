package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.initInfo;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.minervascoutingsubsystemandroid.MainActivity;
import com.example.minervascoutingsubsystemandroid.R;
import com.example.minervascoutingsubsystemandroid.structure.schedule.Match;
import com.example.minervascoutingsubsystemandroid.ui.FragmentManager;
import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;
import com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.actions.ActionsFragment;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * TODD: Add actions fro fragment switching buttons (pre, aciton, post)
 */
public class InitInfoFragment  extends Fragment implements FragmentManager {

    OnFragmentChangeListener fragmentListener;

    EditText scoutNameEditTxt;
    EditText matchNumEditTxt;

    Button red1Btn;
    Button red2Btn;
    Button red3Btn;
    Button b1ue1Btn;
    Button blue2Btn;
    Button blue3Btn;
    Activity activity;

    EditText teamNumEditTxt;

    CheckBox matchReplayChkBox;

    Button submitInitScreenBtn;
    InitInfoViewModel initInfoViewModel;

    Button settingsButton;

    ArrayList<ButtonWrapper> redWrapper = new ArrayList<>();
    ArrayList<ButtonWrapper> blueWrapper = new ArrayList<>();


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_scout_initinfo,container,false);

        initInfoViewModel = new InitInfoViewModel(this, fragmentListener);
        settingsButton = (Button) view.findViewById(R.id.settingsBtn);

        scoutNameEditTxt = (EditText) view.findViewById(R.id.scout_name_editText);
        matchNumEditTxt = (EditText) view.findViewById(R.id.match_num_editText);

        red1Btn = (Button) view.findViewById(R.id.red1_btn);
        red2Btn = (Button) view.findViewById(R.id.red2_btn);
        red3Btn = (Button) view.findViewById(R.id.red3_btn);

        b1ue1Btn = (Button) view.findViewById(R.id.blue1_btn);
        blue2Btn = (Button) view.findViewById(R.id.blue2_btn);
        blue3Btn = (Button) view.findViewById(R.id.blue3_btn);

        submitInitScreenBtn = (Button) view.findViewById(R.id.start_init_btn);

        matchReplayChkBox = (CheckBox) view.findViewById(R.id.replayedMatch_chkBox);
        teamNumEditTxt = (EditText) view.findViewById(R.id.teamNum_editTxt);

        final ArrayList<Button> allianceButtons = new ArrayList<>(Arrays.asList(red1Btn,red2Btn,red3Btn,b1ue1Btn,blue2Btn,blue3Btn));

        initInfoViewModel.setOnClickTeamNumsOnClick(allianceButtons,teamNumEditTxt);
        initInfoViewModel.scoutInfoClickListener(submitInitScreenBtn,scoutNameEditTxt,matchNumEditTxt,teamNumEditTxt,matchReplayChkBox);

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentListener.onFragmentChange(5);
            }
        });

        matchNumEditTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    //generateButtonWrapper(view);

                    int matchNum = Integer.parseInt(matchNumEditTxt.getText().toString());
                    Match matchTemp;
                    for (Match match : MainActivity.matchLists.getMatchArrayList()){
                        if (match.getMatchNum() == matchNum){
                            System.out.println(match.getR1());
                           for (int i = 0 ; i < allianceButtons.size() ; i++){
                               allianceButtons.get(i).setText(match.getTeam(i+1)+"");
                           }
                           break;
                        }

                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        return view;
    }

    public void generateButtonWrapper(View view){
        redWrapper = new ArrayList<>();
        blueWrapper = new ArrayList<>();
        for (int i = 1; i < 4; i++){
            System.out.println("red"+i+"_btn");
            redWrapper.add(new ButtonWrapper(view.getResources().getIdentifier("red"+i+"_btn","id",activity.getPackageName()),matchNumEditTxt.getText().toString(),view,i));
        }
        for (int i = 1; i < 4; i++){
            System.out.println("blue"+i+"_btn");
            blueWrapper.add(new ButtonWrapper(view.getResources().getIdentifier("blue"+i+"_btn","id",activity.getPackageName()),matchNumEditTxt.getText().toString(),view,i));
        }
    }

    @Override
    public void onAttach(Activity activity) {
        this.activity = activity;
        super.onAttach(activity);
        try {
            fragmentListener = (OnFragmentChangeListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        fragmentListener = null;
    }


    public class ButtonWrapper{

        int buttonId;
        Button button;
        int matchNum;
        String buttonName;
        int pos;

        public ButtonWrapper(int buttonId, String matchNum, View view, int pos) {
            this.buttonId = buttonId;
            this.matchNum = Integer.parseInt(matchNum);
            this.buttonName = buttonName;
            this.button = (Button) view.findViewById(buttonId);
            button.setText(pos+"");
            this.pos = pos;
        }

        public int getButtonId() {
            return buttonId;
        }

        public void setButtonId(int buttonId) {
            this.buttonId = buttonId;
        }

        public Button getButton() {
            return button;
        }

        public void setButton(Button button) {
            this.button = button;
        }

        public int getMatchNum() {
            return matchNum;
        }

        public void setMatchNum(int matchNum) {
            this.matchNum = matchNum;
        }

        public String getButtonName() {
            return buttonName;
        }

        public void setButtonName(String buttonName) {
            this.buttonName = buttonName;
        }

        public int getPos() {
            return pos;
        }

        public void setPos(int pos) {
            this.pos = pos;
        }
    }

}
