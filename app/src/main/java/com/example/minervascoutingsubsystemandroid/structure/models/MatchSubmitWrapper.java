package com.example.minervascoutingsubsystemandroid.structure.models;

import com.example.minervascoutingsubsystemandroid.MainActivity;
import com.example.minervascoutingsubsystemandroid.structure.schedule.Match;
import com.google.gson.Gson;

import java.util.ArrayList;


public class MatchSubmitWrapper {
    ArrayList<MatchSubmit> matchSubmits = new ArrayList<>();



    public ArrayList<MatchSubmit> getMatchSubmits() {
        return matchSubmits;
    }

    public void setMatchSubmits(ArrayList<MatchSubmit> matchSubmits) {
        this.matchSubmits = matchSubmits;
    }

    public void addMatchSubmit(MatchSubmit matchSubmit){
        this.matchSubmits.add(matchSubmit);
    }



}
