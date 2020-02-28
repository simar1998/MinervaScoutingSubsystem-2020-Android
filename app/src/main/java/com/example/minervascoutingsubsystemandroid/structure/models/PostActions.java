package com.example.minervascoutingsubsystemandroid.structure.models;


/**
 * @author Simar Pal Kalsi, Hark Khurana
 * Live Long And Prosper -----> Simt'pal
 **/
public class PostActions {

    int id;

    int id2;

    int hangStart = 0;

    int hangEnd = 0;

    int hangLoc;

    int balanceTime = 0;

    boolean gotClimbAssistance;

    boolean buddyBot;

    boolean isBalanced;

    String comment;

    boolean wasBotDefended;

    boolean isParked;


    public Boolean getWasBotDefended() {
        return wasBotDefended;
    }

    public void setWasBotDefended(Boolean wasBotDefended) {
        this.wasBotDefended = wasBotDefended;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHangStart() {
        return hangStart;
    }

    public void setHangStart(int hangStart) {
        this.hangStart = hangStart;
    }

    public int getHangEnd() {
        return hangEnd;
    }

    public void setHangEnd(int hangEnd) {
        this.hangEnd = hangEnd;
    }

    public int getHangLoc() {
        return hangLoc;
    }

    public void setHangLoc(int hangLoc) {
        this.hangLoc = hangLoc;
    }

    public int getBalanceTime() {
        return balanceTime;
    }

    public void setBalanceTime(int balanceTime) {
        this.balanceTime = balanceTime;
    }

    public boolean isGotClimbAssistance() {
        return gotClimbAssistance;
    }

    public void setGotClimbAssistance(boolean gotClimbAssistance) {
        this.gotClimbAssistance = gotClimbAssistance;
    }

    public boolean isBuddyBot() {
        return buddyBot;
    }

    public void setBuddyBot(boolean buddyBot) {
        this.buddyBot = buddyBot;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isParked() {
        return isParked;
    }

    public void setParked(boolean parked) {
        isParked = parked;
    }

    public boolean isBalanced() {
        return isBalanced;
    }

    public void setBalanced(boolean balanced) {
        this.isBalanced = balanced;
    }
}
