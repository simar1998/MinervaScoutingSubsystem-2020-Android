package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.actions;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.minervascoutingsubsystemandroid.R;
import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;

public class ActionsFragment extends Fragment {

    ActionsViewModel actionsViewModel;

    OnFragmentChangeListener fragmentListener;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        actionsViewModel = ViewModelProviders.of(this).get(ActionsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_schedule, container, false);
        //fragmentListener.onFragmentChange(1);
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
