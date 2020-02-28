package com.example.minervascoutingsubsystemandroid.structure.models;

import java.util.Date;

/**
 * @author Simar Pal Kalsi
 * Live Long And Prosper -----> Simt'pal
 **/
public class SubmittedGame {

    int id;

    int teamNum;

    int matchNum;

    int scoutTeamNum;

    String scoutName;

    String scoutUUID;

    char alliance;

    int pos;

    String event;

    Date timeStamp;

    int numReplayed = 0;

    String submissionUUID;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeamNum() {
        return teamNum;
    }

    public void setTeamNum(int teamNum) {
        this.teamNum = teamNum;
    }

    public int getMatchNum() {
        return matchNum;
    }

    public void setMatchNum(int matchNum) {
        this.matchNum = matchNum;
    }

    public char getAlliance() {
        return alliance;
    }

    public void setAlliance(char alliance) {
        this.alliance = alliance;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getNumReplayed() {
        return numReplayed;
    }

    public void setNumReplayed(int numReplayed) {
        this.numReplayed = numReplayed;
    }

    public int getScoutTeamNum() {
        return scoutTeamNum;
    }

    public void setScoutTeamNum(int scoutTeamNum) {
        this.scoutTeamNum = scoutTeamNum;
    }

    public String getScoutName() {
        return scoutName;
    }

    public void setScoutName(String scoutName) {
        this.scoutName = scoutName;
    }

    public String getScoutUUID() {
        return scoutUUID;
    }

    public void setScoutUUID(String scoutUUID) {
        this.scoutUUID = scoutUUID;
    }


}
