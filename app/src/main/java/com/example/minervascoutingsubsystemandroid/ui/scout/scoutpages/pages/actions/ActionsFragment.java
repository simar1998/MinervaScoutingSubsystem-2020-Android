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

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.minervascoutingsubsystemandroid.R;
import com.example.minervascoutingsubsystemandroid.structure.models.Actions;
import com.example.minervascoutingsubsystemandroid.structure.models.MatchTimerManager;
import com.example.minervascoutingsubsystemandroid.ui.FragmentManager;
import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;

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


    OnFragmentChangeListener fragmentListener;

    ImageView fieldImg;

    ImageView yellowImg;
    ImageView zone2Img;

    Button startBtn;


    Button zone1Btn;
    Button zone2Btn;
    Button zone3Btn;
    Button zone4Btn;
    Button zone5Btn;
    Button zone6Btn;
    Button zone7Btn;
    Button zone8Btn;
    Button zone9Btn;
    Button zone10Btn;
    Button zone11Btn;
    Button zone12Btn;
    Button zone13Btn;
    Button zone14Btn;
    Button zone15Btn;
    Button zone16Btn;
    Button zone17Btn;
    Button zone18Btn;
    Button zone19Btn;
    Button zone20Btn;
    Button zone21Btn;
    Button zone22Btn;
    Button zone23Btn;
    Button zone24Btn;


    Button intakeBtn;
    Button shootBtn;
    Button dropBtn;
    Button feedBtn;
    Button cancelBtn;



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


        actionsViewModel = ViewModelProviders.of(this).get(ActionsViewModel.class);
        final View view = inflater.inflate(R.layout.fragment_scout_action, container, false);
        //fragmentListener.onFragmentChange(1);

        actionsList = new ArrayList<>();


        preTabBtn = ( Button) view.findViewById(R.id.pre_action_btn2);
        actionTabBtn = ( Button) view.findViewById(R.id.action_action_btn2);
        postTabBtn = ( Button) view.findViewById(R.id.post_action_btn2);

        debugTxtView = (TextView)view.findViewById(R.id.debug_action_txtView);

        fieldImg = (ImageView) view.findViewById(R.id.field_actions_imgView);


        intakeBtn = (Button) view.findViewById(R.id.intake_btn);
        shootBtn = (Button) view.findViewById(R.id.shoot_btn);
        dropBtn = (Button) view.findViewById(R.id.drop_btn);
        feedBtn = (Button) view.findViewById(R.id.feed_btn);
        cancelBtn = (Button) view.findViewById(R.id.cancel_btn);


        startBtn = (Button) view.findViewById(R.id.start_btn);



        zone1Btn = (Button) view.findViewById(R.id.zone1_btn);
        zone2Btn = (Button) view.findViewById(R.id.zone2_btn);
        zone3Btn = (Button) view.findViewById(R.id.zone3_btn);
        zone4Btn = ( Button) view.findViewById(R.id.zone4_btn);
        zone5Btn = (Button) view.findViewById(R.id.zone5_btn);
        zone6Btn = (Button) view.findViewById(R.id.zone6_btn);
        zone7Btn = (Button) view.findViewById(R.id.zone7_btn);
        zone8Btn = (Button) view.findViewById(R.id.zone8_btn);
        zone9Btn = (Button) view.findViewById(R.id.zone9_btn);
        zone10Btn = (Button) view.findViewById(R.id.zone10_btn);
        zone11Btn = (Button) view.findViewById(R.id.zone11_btn);
        zone12Btn = (Button) view.findViewById(R.id.zone12_btn);
        zone13Btn = (Button) view.findViewById(R.id.zone13_btn);
        zone14Btn = (Button) view.findViewById(R.id.zone14_btn);
        zone15Btn = (Button) view.findViewById(R.id.zone15_btn);
        zone16Btn = (Button) view.findViewById(R.id.zone16_btn);
        zone17Btn = (Button) view.findViewById(R.id.zone17_btn);
        zone18Btn = (Button) view.findViewById(R.id.zone18_btn);
        zone19Btn = (Button) view.findViewById(R.id.zone19_btn);
        zone20Btn = (Button) view.findViewById(R.id.zone20_btn);
        zone21Btn = (Button) view.findViewById(R.id.zone21_btn);
        zone22Btn = (Button) view.findViewById(R.id.zone22_btn);
        zone23Btn = (Button) view.findViewById(R.id.zone23_btn);
        zone24Btn = (Button) view.findViewById(R.id.zone24_btn);


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
        final ArrayList<Button> zoneBtns = new ArrayList<>(Arrays.asList(
                zone1Btn, zone2Btn,zone3Btn,zone4Btn,zone5Btn,zone6Btn,zone7Btn,zone8Btn,zone9Btn,
                zone10Btn,zone11Btn,zone12Btn,zone13Btn,zone14Btn,zone15Btn,zone16Btn,zone17Btn,
                zone18Btn,zone19Btn,zone20Btn,zone21Btn,zone22Btn,zone23Btn,zone24Btn
                ));

        final ArrayList<Button> optionBtns = new ArrayList<>(Arrays.asList(intakeBtn,shootBtn,dropBtn,feedBtn,cancelBtn));

        ArrayList<ImageView> zoneImageViews = new ArrayList<>(Arrays.asList(yellowImg,zone2Img));

        final ArrayList<SeekBar> shootOptionSeekBars = new ArrayList<>(Arrays.asList(shootAttemptSeekbar,shootSuccessSeekbar));
        final  ArrayList<TextView> shootOptionTextViews = new ArrayList<>(Arrays.asList(shootAttemptTxtView,shootStaticAttemptTxtView,shootSuccessTxtView,shootStaticSuccessTxtView));
        final  ArrayList<Button> shootOptionBtns = new ArrayList<>(Arrays.asList(shootSubmitBtn,shootCancelBtn));

        selectedZone = -1;




        preTabBtn.setVisibility(View.INVISIBLE);
        actionTabBtn.setVisibility(View.INVISIBLE);


        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MatchTimerManager.startMatchTimer();
                startBtn.setVisibility(View.GONE);

            }
        });



        decideBtnsVisibility(optionBtns,false);
        decideShootOptionsVisibility(shootOptionSeekBars,shootOptionTextViews,shootOptionBtns,false);

        /**
         * Cycles through all zone buttons as a onClick listener
         *
         * KNOWN ISSUE(FIXED):
         * When zone 21 is clicked, none of the optionButtons can be clicked because its under zone 21
         */
        for ( int i = 0 ; i < zoneBtns.size(); i ++){
            final int copyOfI = i;

            int tempTimeCounter = -1;
            zoneBtns.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    zoneBtns.get(copyOfI).setEnabled(false);
                    selectedZone = copyOfI+1;


//                    for (Button button : optionBtns){
//                        if (temp1 != 0 && temp2 != 0){
//                            TranslateAnimation animation = new TranslateAnimation(0, button.getX() - temp1, 0, button.getY() - temp2);
//                            animation.setDuration(10000); // duartion in ms
//
//                            intakeBtn.startAnimation(animation);
//                        }
//                    }
//Testing if zone 21 btn is hit or the actions menu
//                    if (copyOfI == 20){
//                        Log.d("CREATION","IM HITTING ZONE 21");
//                    }
                    //Get teh coordinates of zone button clicked
                    int[] zoneBtnLoc= getCoordinateXY(zoneBtns.get(copyOfI));


                    for (int j =0;j<zoneBtns.size();j++){
                        if(copyOfI !=j){
                            zoneBtns.get(j).setVisibility(View.INVISIBLE);

                        }
                        else{

                            System.out.println("TEST 2");

                            for(int m = 0; m< optionBtns.size(); m++){

                                optionBtns.get(m).setVisibility(View.VISIBLE);

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












        intakeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionsList.add(generateNormalAction("intake",selectedZone));
                debugTxtView.setText(getActionDebugText(actionsList.get(actionsList.size()-1)));
                decideBtnsVisibility(zoneBtns,true);
                decideBtnsVisibility(optionBtns,false);
                zoneBtns.get(selectedZone-1).setEnabled(true);
                selectedZone = -1;


            }
        });

        shootBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                decideShootOptionsVisibility(shootOptionSeekBars,shootOptionTextViews,shootOptionBtns,true);
                //debugTxtView.setText(getActionDebugText(actionsList.get(actionsList.size()-1)));
            decideBtnsVisibility(optionBtns,false);
            }
        });



        dropBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionsList.add(generateNormalAction("drop",selectedZone));
                debugTxtView.setText(getActionDebugText(actionsList.get(actionsList.size()-1)));
                decideBtnsVisibility(zoneBtns,true);
                decideBtnsVisibility(optionBtns,false);
                zoneBtns.get(selectedZone-1).setEnabled(true);
                selectedZone = -1;
            }

        });

        feedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionsList.add(generateNormalAction("feed",selectedZone));
                debugTxtView.setText(getActionDebugText(actionsList.get(actionsList.size()-1)));
                decideBtnsVisibility(zoneBtns,true);
                decideBtnsVisibility(optionBtns,false);
                zoneBtns.get(selectedZone-1).setEnabled(true);
                selectedZone = -1;
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zoneBtns.get(selectedZone-1).setEnabled(true);
                decideBtnsVisibility(zoneBtns,true);
                decideBtnsVisibility(optionBtns,false);
                selectedZone = -1;
            }
        });



        shootSubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int attemptedBalls = shootAttemptValueConverter(shootAttemptSeekbar.getProgress());
                int scoredBalls = shootSuccessValueConverter(shootSuccessSeekbar.getProgress());
                actionsList.add(generateShootAction("shoot", selectedZone,attemptedBalls,scoredBalls));
                debugTxtView.setText(getActionDebugText(actionsList.get(actionsList.size()-1)));
                shootAttemptSeekbar.setProgress(0);
                shootSuccessSeekbar.setProgress(0);
                zoneBtns.get(selectedZone-1).setEnabled(true);
                selectedZone = -1;
                decideShootOptionsVisibility(shootOptionSeekBars,shootOptionTextViews,shootOptionBtns,false);
                decideBtnsVisibility(optionBtns,false);
                decideBtnsVisibility(zoneBtns,true);
            }
        });

        shootCancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shootAttemptSeekbar.setProgress(0);
                shootSuccessSeekbar.setProgress(0);
                decideShootOptionsVisibility(shootOptionSeekBars,shootOptionTextViews,shootOptionBtns,false);
                decideBtnsVisibility(optionBtns, true);
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



        for ( int i = 0 ; i < zoneImageViews.size(); i ++){

            final int copyOfI = i;
            //zoneBtns.get(i).setBackgroundColor(Color.TRANSPARENT);

            int zoneBackColor = getContext().getResources().getIdentifier("zone_btn", "drawable", "");

            zoneBtns.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    getCoordinateXY(zoneBtns.get(copyOfI).getId());

                }

                public  void getCoordinateXY(int btnID ){
                    Button btn = (Button) view.findViewById(btnID);
                    int locOfBtn[] = new  int[2];
                    btn.getLocationOnScreen(locOfBtn);
                    int btnXLoc = locOfBtn[0];
                    int btnYLoc = locOfBtn[1];
                    String btnName = view.getResources().getResourceEntryName(btn.getId()).toString();
                    try {
                       // debugTxtView.setText ("X Of"+ btnName + ": " + btnXLoc +" \n Y of " + btnName + " :" + btnYLoc);
                    }
                    catch (Exception e){

                    }



                }
            });
        }




        preTabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentListener.onFragmentChange(2);
            }
        });

        postTabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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



    public void decideBtnsVisibility(ArrayList<Button> btns, boolean makeVisible){
        for (int i = 0; i < btns.size();i++){
            if(makeVisible)
            btns.get(i).setVisibility(View.VISIBLE);
            else
                btns.get(i).setVisibility(View.INVISIBLE);
        }
    }

    public void decideShootOptionsVisibility(ArrayList<SeekBar> seekBars, ArrayList<TextView> txtViews, ArrayList<Button> btns, boolean makeVisible){
        decideSeekBarVisibility(seekBars,makeVisible);
        decideTextViewVisibility(txtViews,makeVisible);
        decideBtnsVisibility(btns,makeVisible);
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



    private class ButtonWrapper{

        int zoneNum;
        int buttonId;

        Button button;

        public ButtonWrapper(int zoneNum, int buttonId, View view){
           this.zoneNum = zoneNum;
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
    }



    @Override
    public void onAttach(Activity activity) {
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
