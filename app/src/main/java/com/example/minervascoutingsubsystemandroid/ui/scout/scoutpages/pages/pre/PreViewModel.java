package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.pre;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;

import com.example.minervascoutingsubsystemandroid.structure.models.Pre;
import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;

public class PreViewModel extends ViewModel {


    OnFragmentChangeListener onFragmentChangeListener;
    Pre pre = new Pre();
    Fragment fragment = new Fragment();
    public PreViewModel(Fragment fragment, OnFragmentChangeListener onFragmentChangeListner) {

        this.fragment = fragment;
        this.onFragmentChangeListener = onFragmentChangeListner;
    }


}
