package com.example.minervascoutingsubsystemandroid.ui.scout;

import android.view.View;
import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScoutViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ScoutViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is scouting fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public void setOnlickListenerForButton(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mText.setValue("Hahaha bumbaclot!!");
            }
        });

    }
}