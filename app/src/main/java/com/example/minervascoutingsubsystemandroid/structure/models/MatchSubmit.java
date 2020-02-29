package com.example.minervascoutingsubsystemandroid.structure.models;

public class MatchSubmit {

    String matchFileName;
    boolean isSubmitted;

    public MatchSubmit(String matchFileName, boolean isSubmitted) {
        this.matchFileName = matchFileName;
        this.isSubmitted = isSubmitted;
    }

    public String getMatchFileName() {
        return matchFileName;
    }

    public void setMatchFileName(String matchFileName) {
        this.matchFileName = matchFileName;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }
}
