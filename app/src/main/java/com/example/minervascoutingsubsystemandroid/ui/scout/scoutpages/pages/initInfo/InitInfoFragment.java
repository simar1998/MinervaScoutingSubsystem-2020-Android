package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.initInfo;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.minervascoutingsubsystemandroid.R;
import com.example.minervascoutingsubsystemandroid.ui.FragmentManager;
import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;

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

    EditText teamNumEditTxt;

    CheckBox matchReplayChkBox;

    Button submitInitScreenBtn;
    InitInfoViewModel initInfoViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scout_initinfo,container,false);

        initInfoViewModel = new InitInfoViewModel(this, fragmentListener);

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

        return view;
    }

    @Override
    public void onAttach(Activity activity) {
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

}
