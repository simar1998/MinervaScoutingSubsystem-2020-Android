package com.example.minervascoutingsubsystemandroid.structure.models;

/**
 * @author Simar Pal Kalsi
 * Live Long And Prosper -----> Simt'pal
 **/
public class Actions {


    int id;

    int time;

    String action;

    String location;

    int eventZone;

    int scoreAttempt;

    int scoreSuccess;

    boolean auto;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public int getScoreAttempt() {
        return scoreAttempt;
    }

    public void setScoreAttempt(int scoreAttempt) {
        this.scoreAttempt = scoreAttempt;
    }

    public int getScoreSuccess() {
        return scoreSuccess;
    }

    public void setScoreSuccess(int scoreSuccess) {
        this.scoreSuccess = scoreSuccess;
    }
    public int getEventZone() {
        return eventZone;
    }

    public void setEventZone(int eventZone) {
        this.eventZone = eventZone;
    }



}
