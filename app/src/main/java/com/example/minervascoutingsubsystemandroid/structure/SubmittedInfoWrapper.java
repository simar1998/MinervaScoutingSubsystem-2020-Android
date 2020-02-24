package com.example.minervascoutingsubsystemandroid.structure;

import com.example.minervascoutingsubsystemandroid.structure.models.Actions;
import com.example.minervascoutingsubsystemandroid.structure.models.PostActions;
import com.example.minervascoutingsubsystemandroid.structure.models.Pre;
import com.example.minervascoutingsubsystemandroid.structure.models.SubmittedGame;

import java.util.ArrayList;

/**
 * @author Simar Pal Kalsi
 * Live Long And Prosper -----> Simt'pal
 **/
public class SubmittedInfoWrapper {



    SubmittedGame submittedGame;

    Pre pre;

    PostActions postActions;

    ArrayList<Actions> actions;



    public SubmittedGame getSubmittedGame() {
        return submittedGame;
    }

    public void setSubmittedGame(SubmittedGame submittedGame) {
        this.submittedGame = submittedGame;
    }

    public Pre getPre() {
        return pre;
    }

    public void setPre(Pre pre) {
        this.pre = pre;
    }

    public PostActions getPostActions() {
        return postActions;
    }

    public void setPostActions(PostActions postActions) {
        this.postActions = postActions;
    }

    public ArrayList<Actions> getActions() {
        return actions;
    }

    public void setActions(ArrayList<Actions> actions) {
        this.actions = actions;
    }

    public void addAction(Actions action){
        actions.add(action);
    }

}
