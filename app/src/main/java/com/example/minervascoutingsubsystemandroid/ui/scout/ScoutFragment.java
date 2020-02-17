package com.example.minervascoutingsubsystemandroid.ui.scout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.minervascoutingsubsystemandroid.R;

public class ScoutFragment extends Fragment {

    private ScoutViewModel scoutViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        scoutViewModel = ViewModelProviders.of(this).get(ScoutViewModel.class);

        View root = inflater.inflate(R.layout.fragment_scout, container, false);

        final TextView textView = root.findViewById(R.id.startPos_txtView);
        scoutViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });




//        final Button button = root.findViewById(R.id.button);
//        scoutViewModel.setOnlickListenerForButton(button);






        return root;
    }
}