package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.initInfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.minervascoutingsubsystemandroid.R;

import java.util.ArrayList;


public class InitInfoFragment  extends Fragment {

    EditText scoutNameEditTxt;
    EditText matchNumEditTxt;

    Button red1Btn;
    Button red2Btn;
    Button red3Btn;
    Button b1ueBtn;
    Button blue2Btn;
    Button blue3Btn;

    ArrayList<View> buttonArrayList = new ArrayList<>();


    EditText teamNumEditTxt;

    CheckBox matchReplayChkBox;

    Button submitInitScreenBtn;
    InitInfoViewModel initInfoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        buttonArrayList.add(red1Btn);


        initInfoViewModel = ViewModelProviders.of(this).get(InitInfoViewModel.class);
        initInfoViewModel.setOnClickTeamNumsOnClick(buttonArrayList);
        View root = inflater.inflate(R.layout.fragment_schedule, container, false);

        return root;
    }
}
