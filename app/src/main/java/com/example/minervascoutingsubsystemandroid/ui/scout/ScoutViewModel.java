package com.example.minervascoutingsubsystemandroid.ui.scout;

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
}