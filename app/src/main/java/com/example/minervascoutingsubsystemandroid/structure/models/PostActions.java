package com.example.minervascoutingsubsystemandroid.structure.models;


/**
 * @author Simar Pal Kalsi, Hark Khurana
 * Live Long And Prosper -----> Simt'pal
 **/
public class PostActions {

    int id;

    int hangStart;

    int hangEnd;

    int hangLoc;

    int balanceTime;

    boolean gotBuddyd;

    boolean buddydBot;

    boolean barBalanced;

    boolean isParked;

    String comment;

    public Boolean getWasBotDefended() {
        return wasBotDefended;
    }

    public void setWasBotDefended(Boolean wasBotDefended) {
        this.wasBotDefended = wasBotDefended;
    }

    Boolean wasBotDefended;


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

    public boolean isGotBuddyd() {
        return gotBuddyd;
    }

    public void setGotBuddyd(boolean gotBuddyd) {
        this.gotBuddyd = gotBuddyd;
    }

    public boolean isBuddydBot() {
        return buddydBot;
    }

    public void setBuddydBot(boolean buddydBot) {
        this.buddydBot = buddydBot;
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

    public boolean isBarBalanced() {
        return barBalanced;
    }

    public void setBarBalanced(boolean barBalanced) {
        this.barBalanced = barBalanced;
    }
}
