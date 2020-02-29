package com.example.minervascoutingsubsystemandroid.structure.models;

import com.example.minervascoutingsubsystemandroid.MainActivity;
import com.google.gson.Gson;

public class MatchSubmitManager {

    public static void addMatchSubmitToPref(MatchSubmit match){
        MatchSubmitWrapper matchSubmitWrapper;
        try {
            matchSubmitWrapper = (new Gson()).fromJson(MainActivity.getPrefrences("matchSubmit"),MatchSubmitWrapper.class);
            if (matchSubmitWrapper == null){
                matchSubmitWrapper = new MatchSubmitWrapper();
            }
        }
        catch (Exception e){
            e.printStackTrace();
            matchSubmitWrapper = new MatchSubmitWrapper();
        }
        System.out.println((new Gson().toJson(matchSubmitWrapper)));
        matchSubmitWrapper.getMatchSubmits().add(match);
        MainActivity.insertPrefrences("matchSubmit",(new Gson()).toJson(matchSubmitWrapper));
    }

    public static void changeMatchSubmitStatus(String fileName,boolean status){
        MatchSubmitWrapper matchSubmitWrapper;
        try {
            matchSubmitWrapper = (new Gson()).fromJson(MainActivity.getPrefrences("matchSubmit"),MatchSubmitWrapper.class);
        }
        catch (Exception e){
            e.printStackTrace();
            matchSubmitWrapper = new MatchSubmitWrapper();
        }
        for (MatchSubmit matchSubmit : matchSubmitWrapper.getMatchSubmits()){
            if (matchSubmit.getMatchFileName().equals(fileName)){
                matchSubmit.setSubmitted(status);
                break;
            }
        }
        MainActivity.insertPrefrences("matchSubmit",(new Gson()).toJson(matchSubmitWrapper));
    }

    public static MatchSubmitWrapper getMatchSubmitsFromPref(){
        MatchSubmitWrapper matchSubmitWrapper = null;
        try {
            matchSubmitWrapper = (new Gson()).fromJson(MainActivity.getPrefrences("matchSubmit"),MatchSubmitWrapper.class);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        assert matchSubmitWrapper != null;
        return matchSubmitWrapper;
    }
}
