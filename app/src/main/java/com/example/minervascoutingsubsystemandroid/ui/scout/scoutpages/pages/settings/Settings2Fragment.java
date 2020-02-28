package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.settings;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.minervascoutingsubsystemandroid.R;
import com.example.minervascoutingsubsystemandroid.ui.FragmentManager;
import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;

public class Settings2Fragment extends Fragment implements FragmentManager {

    private Settings2ViewModel settingsViewModel;

    public  OnFragmentChangeListener fragmentListener;

    Button saveSettingsButton;

    EditText scoutTeamNum;
    EditText eventCode;
    EditText postIPEditText;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_settings2, container, false);

        settingsViewModel = new Settings2ViewModel(this, fragmentListener);

        saveSettingsButton = (Button) root.findViewById(R.id.saveSettingsBtn);
        scoutTeamNum = (EditText) root.findViewById(R.id.scoutTeamNameEditText);
        eventCode = (EditText) root.findViewById(R.id.eventNameEditText);
        postIPEditText = (EditText) root.findViewById(R.id.postIPAdressEditText);

        settingsViewModel.applyOnClickListener(saveSettingsButton, scoutTeamNum,eventCode,postIPEditText, fragmentListener);
        settingsViewModel.setLastStoredInfo(scoutTeamNum,eventCode,postIPEditText);

        return root;
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