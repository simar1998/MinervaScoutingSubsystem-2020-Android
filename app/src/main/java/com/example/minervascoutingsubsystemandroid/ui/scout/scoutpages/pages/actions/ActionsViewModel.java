package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.actions;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;

import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;

public class ActionsViewModel extends ViewModel {

    OnFragmentChangeListener fragmentChangeListener;
    Fragment fragment;

    public ActionsViewModel(Fragment fragment, OnFragmentChangeListener onFragmentChangeListener) {
        this.fragment = fragment;
        this.fragmentChangeListener = onFragmentChangeListener;
    }


}
