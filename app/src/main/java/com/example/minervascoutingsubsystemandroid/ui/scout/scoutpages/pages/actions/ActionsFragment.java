package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.actions;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.minervascoutingsubsystemandroid.R;
import com.example.minervascoutingsubsystemandroid.structure.models.Actions;
import com.example.minervascoutingsubsystemandroid.structure.models.MatchTimerManager;
import com.example.minervascoutingsubsystemandroid.ui.FragmentManager;
import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;
import com.example.minervascoutingsubsystemandroid.ui.scout.ScoutFragment;

import java.util.ArrayList;
import java.util.Arrays;

public class ActionsFragment extends Fragment implements FragmentManager {

ActionsViewModel actionsViewModel;
    ArrayList<Actions> actionsList;
    Actions actions;

    Button preTabBtn;
    Button actionTabBtn;
    Button postTabBtn;

    TextView debugTxtView;

    Activity activity;


    OnFragmentChangeListener fragmentListener;

    ImageView fieldImg;

    ImageView yellowImg;
    ImageView zone2Img;

    ArrayList<ButtonWrapper> zoneButtons = new ArrayList<>();
    ArrayList<ButtonWrapper> optionsButtons = new ArrayList<>();

    Button startBtn;


    SeekBar shootAttemptSeekbar;
    TextView shootAttemptTxtView;
    TextView shootStaticAttemptTxtView;

    SeekBar shootSuccessSeekbar;
    TextView shootSuccessTxtView;
    TextView shootStaticSuccessTxtView;


    Button shootSubmitBtn;
    Button shootCancelBtn;

    int selectedZone;

    //ViewGroup optionBtnLayout;
    ViewGroup optionBtnLayout;

    OnFragmentChangeListener onFragmentChangeListener;

int temp1, temp2;

    ArrayList<ButtonWrapper> buttonWrappers = new ArrayList<>();

    public View onCreateView(@NonNull final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        actionsViewModel = new ActionsViewModel(this,onFragmentChangeListener);

        final View view = inflater.inflate(R.layout.fragment_scout_action, container, false);

        createButtonWrappers(view);
        //fragmentListener.onFragmentChange(1);

        actionsList = new ArrayList<>();


        preTabBtn = ( Button) view.findViewById(R.id.pre_action_btn2);
        actionTabBtn = ( Button) view.findViewById(R.id.action_action_btn2);
        postTabBtn = ( Button) view.findViewById(R.id.post_action_btn2);

        debugTxtView = (TextView)view.findViewById(R.id.debug_action_txtView);

        fieldImg = (ImageView) view.findViewById(R.id.field_actions_imgView);




        startBtn = (Button) view.findViewById(R.id.start_btn);



        shootAttemptSeekbar = (SeekBar) view.findViewById(R.id.shoot_attempt_seekBar);
        shootAttemptTxtView = (TextView) view.findViewById(R.id.shoot_attempt_txtView);
        shootStaticAttemptTxtView = (TextView) view.findViewById(R.id.shoot_static_attempt_txtView);

        shootSuccessSeekbar = (SeekBar) view.findViewById(R.id.shoot_success_seekBar);
        shootSuccessTxtView = (TextView) view.findViewById(R.id.shoot_success_txtView);
        shootStaticSuccessTxtView = (TextView) view.findViewById(R.id.shoot_static_success_txtView);

        shootSubmitBtn = ( Button) view.findViewById(R.id.shoot_submit_btn);
        shootCancelBtn = (Button) view.findViewById(R.id.shoot_cancel_btn);


        //optionBtnLayout = (ConstraintLayout) view.findViewById(R.id.action_options_tableLayout);
        final int yellowImgLoc[] = new int[2];

         final int timeCounter  = -1;

         actions = new Actions();

         final ArrayList<Actions> actionsList = new ArrayList<>();

        ArrayList<ImageView> zoneImageViews = new ArrayList<>(Arrays.asList(yellowImg,zone2Img));

        final ArrayList<SeekBar> shootOptionSeekBars = new ArrayList<>(Arrays.asList(shootAttemptSeekbar,shootSuccessSeekbar));
        final  ArrayList<TextView> shootOptionTextViews = new ArrayList<>(Arrays.asList(shootAttemptTxtView,shootStaticAttemptTxtView,shootSuccessTxtView,shootStaticSuccessTxtView));
        final  ArrayList<Button> shootOptionBtns = new ArrayList<>(Arrays.asList(shootSubmitBtn,shootCancelBtn));

        //selectedZone = -1;

        preTabBtn.setVisibility(View.INVISIBLE);
        actionTabBtn.setVisibility(View.INVISIBLE);


        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MatchTimerManager.getIsActive()){
                    MatchTimerManager.stopMatchTimer();
                }
                MatchTimerManager.startMatchTimer();
                startBtn.setVisibility(View.GONE);

            }
        });



        decideBtnsVisibility(optionsButtons,false);
        decideShootOptionsVisibility(shootOptionSeekBars,shootOptionTextViews,shootOptionBtns,false);

        /**
         * Cycles through all zone buttons as a onClick listener
         *
         */
       for (final ButtonWrapper buttonWrapper : zoneButtons){

            buttonWrapper.getButton().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    selectedZone = buttonWrapper.getZoneNum();
                    buttonWrapper.getButton().setEnabled(false);
                    //selectedZone = buttonWrapper.getZoneNum();
                    postTabBtn.setVisibility(View.INVISIBLE);
                    for (ButtonWrapper buttonWrapper1 : zoneButtons){
                        if(buttonWrapper1.getZoneNum() != buttonWrapper.getZoneNum()){
                            buttonWrapper1.getButton().setVisibility(View.INVISIBLE);
                        }
                        else{
                            for(ButtonWrapper options : optionsButtons){
                                options.getButton().setVisibility(View.VISIBLE);
                            }
                        }
                    }
                }

                public  int[] getCoordinateXY(Button btn ){
                    //Button btn = (Button) view.findViewById(btnID);
                    int locOfBtn[] = new  int[2];
                    btn.getLocationOnScreen(locOfBtn);
                    int btnXLoc = locOfBtn[0];
                    int btnYLoc = locOfBtn[1];
                    String btnName = view.getResources().getResourceEntryName(btn.getId());
                    try {
                        debugTxtView.setText ("X Of"+ btnName + ": " + btnXLoc +" \n Y of " + btnName + " :" + btnYLoc);
                    }
                    catch (Exception e){

                    }

                        return locOfBtn;

                }



            });
        }

        getOptionsButtonWrapper("intake_btn").getButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    actionsList.add(generateNormalAction("intake", selectedZone));
                    debugTxtView.setText(getActionDebugText(actionsList.get(actionsList.size() - 1)));
                    decideBtnsVisibility(zoneButtons, true);
                    decideBtnsVisibility(optionsButtons, false);
                    postTabBtn.setVisibility(View.VISIBLE);
                    decideBtnEnabled(zoneButtons, true);
                }catch (Exception e){

                }


            }
        });

        getOptionsButtonWrapper("shoot_btn").getButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                decideShootOptionsVisibility(shootOptionSeekBars,shootOptionTextViews,shootOptionBtns,true);
                //debugTxtView.setText(getActionDebugText(actionsList.get(actionsList.size()-1)));
            decideBtnsVisibility(optionsButtons,false);
                postTabBtn.setVisibility(View.VISIBLE);

            }
        });



        getOptionsButtonWrapper("drop_btn").getButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    actionsList.add(generateNormalAction("drop",selectedZone));
                    debugTxtView.setText(getActionDebugText(actionsList.get(actionsList.size()-1)));
                    decideBtnsVisibility(zoneButtons,true);
                    decideBtnsVisibility(optionsButtons,false);
                    postTabBtn.setVisibility(View.VISIBLE);
                    decideBtnEnabled(zoneButtons, true);
                }catch (Exception e){

                }

            }

        });

        getOptionsButtonWrapper("feed_btn").getButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionsList.add(generateNormalAction("feed",selectedZone));
                debugTxtView.setText(getActionDebugText(actionsList.get(actionsList.size()-1)));
                decideBtnsVisibility(zoneButtons,true);
                decideBtnsVisibility(optionsButtons,false);
                postTabBtn.setVisibility(View.VISIBLE);
                decideBtnEnabled(zoneButtons, true);
            }
        });

        getOptionsButtonWrapper("cancel_btn").getButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decideBtnsVisibility(zoneButtons,true);
                decideBtnsVisibility(optionsButtons,false);
                postTabBtn.setVisibility(View.VISIBLE);
                decideBtnEnabled(zoneButtons, true);

            }
        });



        shootSubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int attemptedBalls = shootAttemptValueConverter(shootAttemptSeekbar.getProgress());
                int scoredBalls = shootSuccessValueConverter(shootSuccessSeekbar.getProgress());
                if(attemptedBalls >= scoredBalls){
                    actionsList.add(generateShootAction("shoot", selectedZone,attemptedBalls,scoredBalls));
                    debugTxtView.setText(getActionDebugText(actionsList.get(actionsList.size()-1)));
                    shootAttemptSeekbar.setProgress(0);
                    shootSuccessSeekbar.setProgress(0);
                    decideShootOptionsVisibility(shootOptionSeekBars,shootOptionTextViews,shootOptionBtns,false);
                    decideBtnsVisibility(optionsButtons,false);
                    decideBtnsVisibility(zoneButtons,true);
                    postTabBtn.setVisibility(View.VISIBLE);
                    decideBtnEnabled(zoneButtons, true);
                }
                else {
                    Toast.makeText(getContext(), "There cannot be more balls scored than attempted", Toast.LENGTH_SHORT).show();
                }


            }
        });

        shootCancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shootAttemptSeekbar.setProgress(0);
                shootSuccessSeekbar.setProgress(0);
                decideShootOptionsVisibility(shootOptionSeekBars,shootOptionTextViews,shootOptionBtns,false);
                decideBtnsVisibility(optionsButtons, true);
                postTabBtn.setVisibility(View.VISIBLE);
                decideBtnEnabled(zoneButtons, true);
            }
        });


        shootAttemptSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {

               int ballsRecord = -1;
                if (progress <20)
                    ballsRecord = 1;
                else if (progress <40)
                    ballsRecord = 2;
                else if (progress <60)
                    ballsRecord=3;
                else if (progress<80)
                    ballsRecord=4;
                else
                    ballsRecord=5;


               try {
                   shootAttemptTxtView.setText(ballsRecord +"");
               }
               catch (Exception e){

               }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




        shootSuccessSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                int ballsRecord = -1;
                if (progress/16.7 <1)
                    ballsRecord = 0;
                else if (progress/16.7 <2)
                    ballsRecord = 1;
                else if (progress/16.7 <3)
                    ballsRecord=2;
                else if (progress/16.7<4)
                    ballsRecord=3;
                else if (progress/16.7 < 5)
                    ballsRecord=4;
                else
                    ballsRecord = 5;
                try {
                    shootSuccessTxtView.setText(ballsRecord+"");
                }
                catch (Exception e){

                }


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        postTabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScoutFragment.submittedInfoWrapper.setActions(actionsList);
                fragmentListener.onFragmentChange(4);
            }
        });

        return view;
    }


    public String getActionDebugText(Actions actions){
        return actions.getAction().toString() + " time: " + actions.getTime() +"\n zone:" + actions.getLocation();
    }
    public int shootAttemptValueConverter(int progress){
        int ballsRecord = -1;
        if (progress <20)
            ballsRecord = 1;
        else if (progress <40)
            ballsRecord = 2;
        else if (progress <60)
            ballsRecord=3;
        else if (progress<80)
            ballsRecord=4;
        else
            ballsRecord=5;

        return ballsRecord;
    }


    public int shootSuccessValueConverter(int progress){
        int ballsRecord = -1;
        if (progress <20)
            ballsRecord = 1;
        else if (progress <40)
            ballsRecord = 2;
        else if (progress <60)
            ballsRecord=3;
        else if (progress<80)
            ballsRecord=4;
        else
            ballsRecord=5;

        return ballsRecord;
    }



    public void decideBtnsVisibility(ArrayList<ButtonWrapper> btns, boolean makeVisible){
        for (int i = 0; i < btns.size();i++){
            if(makeVisible)
            btns.get(i).getButton().setVisibility(View.VISIBLE);
            else
                btns.get(i).getButton().setVisibility(View.INVISIBLE);
        }
    }

    public void decideBtnEnabled(ArrayList<ButtonWrapper> btns, boolean makeEnabled){
        for (int i = 0 ; i < btns.size(); i ++){
            if (makeEnabled)
            btns.get(i).getButton().setEnabled(true);
            else
                btns.get(i).getButton().setEnabled(true);
        }
    }

    public void decideShootOptionsVisibility(ArrayList<SeekBar> seekBars, ArrayList<TextView> txtViews, ArrayList<Button> btns, boolean makeVisible){
        decideSeekBarVisibility(seekBars,makeVisible);
        decideTextViewVisibility(txtViews,makeVisible);

        for (int i = 0; i < btns.size();i++){
            if(makeVisible)
                btns.get(i).setVisibility(View.VISIBLE);
            else
                btns.get(i).setVisibility(View.INVISIBLE);
        }
    }



    public  void decideSeekBarVisibility(ArrayList<SeekBar> views, boolean makeVisible){

        for (int i = 0; i < views.size();i++){
            if (makeVisible)
                views.get(i).setVisibility(View.VISIBLE);
            else
                views.get(i).setVisibility(View.INVISIBLE);
        }
    }
    public  void decideTextViewVisibility(ArrayList<TextView> txtViews, boolean makeVisible){
        for (int i = 0; i < txtViews.size();i++){
            if (makeVisible)
                txtViews.get(i).setVisibility(View.VISIBLE);
            else
                txtViews.get(i).setVisibility(View.INVISIBLE);
        }
    }


    public Actions generateNormalAction(String action, int zone){
        Actions matchAction = new Actions();
        String actionString;

        if(action!= "shoot"){
            actionString = action;

            matchAction.setAction(actionString);
            matchAction.setTime(MatchTimerManager.getCounter());
            matchAction.setLocation(zone+"");
            if(MatchTimerManager.getCounter() >15){
                matchAction.setAuto(true);
            }
            else {
                matchAction.setAuto(false );
            }
        }

        return matchAction;
    }

    public  Actions generateShootAction(String action, int zone, int attempts, int success){
        Actions matchAction = new Actions();
        String actionString;
        Log.d("ACTION", "taking action as SHOOT");
        if(action == "shoot"){
            actionString = action;

            matchAction.setAction(actionString+ "_" + attempts + "_" + success);
            matchAction.setTime(MatchTimerManager.getCounter());
            matchAction.setLocation(zone+"");
            if(MatchTimerManager.getCounter() >15){
                matchAction.setAuto(true);
            }
            else {
                matchAction.setAuto(false);
            }
        }

        return matchAction;
    }


    public void resetZoneClickability(ArrayList<Button> btns){

        for (int i = 0; i < btns.size();i++){
            btns.get(i).setEnabled(true);
        }
    }


    public void createButtonWrappers(View view){

        int tempButtonId;
        for (int i = 1 ; i < 25; i++){
            tempButtonId = view.getResources().getIdentifier("zone"+i+"_btn","id",activity.getPackageName());
            zoneButtons.add(new ButtonWrapper(i,tempButtonId,view));
        }

        String[] optionButtonsName = {"intake_btn","shoot_btn","drop_btn","feed_btn","cancel_btn"};
        for (String optionStr : optionButtonsName){
            tempButtonId = view.getResources().getIdentifier(optionStr,"id",activity.getPackageName());
            optionsButtons.add(new ButtonWrapper(optionStr,tempButtonId,view));
        }


    }


    public class ButtonWrapper{

        int zoneNum;
        String optionName;
        int buttonId;
        Button button;

        public ButtonWrapper(int zoneNum, int buttonId, View view){
           this.zoneNum = zoneNum;
           this.buttonId = buttonId;
           this.button = view.findViewById(buttonId);
        }

        public ButtonWrapper(String optionName, int buttonId,View view) {
            this.optionName = optionName;
            this.buttonId = buttonId;
            this.button = view.findViewById(buttonId);
        }

        public int getZoneNum() {
            return zoneNum;
        }

        public void setZoneNum(int zoneNum) {
            this.zoneNum = zoneNum;
        }

        public int getButtonId() {
            return buttonId;
        }

        public void setButtonId(int buttonId) {
            this.buttonId = buttonId;
        }

        public Button getButton() {
            return button;
        }

        public void setButton(Button button) {
            this.button = button;
        }

        public String getOptionName() {
            return optionName;
        }

        public void setOptionName(String optionName) {
            this.optionName = optionName;
        }

    }

    public  ButtonWrapper getOptionsButtonWrapper(String optionsName){
        for (ButtonWrapper buttonWrapper : optionsButtons){
            if (buttonWrapper.getOptionName().equals(optionsName)){
                return buttonWrapper;
            }
        }
        return null;
    }

    @Override
    public void onAttach(Activity activity) {
        this.activity = activity;
        super.onAttach(activity);
        try {
            fragmentListener = (OnFragmentChangeListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        fragmentListener = null;
    }

}
