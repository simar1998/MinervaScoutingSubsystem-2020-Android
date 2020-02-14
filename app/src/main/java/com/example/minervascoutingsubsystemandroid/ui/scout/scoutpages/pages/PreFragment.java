package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.minervascoutingsubsystemandroid.R;

public class PreFragment extends Fragment {

    PreViewModel preViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        preViewModel = ViewModelProviders.of(this).get(PreViewModel.class);
        View root = inflater.inflate(R.layout.fragment_schedule, container, false);

        return root;
    }
}
