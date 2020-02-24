package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.actions;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.minervascoutingsubsystemandroid.R;
import com.example.minervascoutingsubsystemandroid.structure.models.Actions;
import com.example.minervascoutingsubsystemandroid.structure.models.MatchTimerManager;
import com.example.minervascoutingsubsystemandroid.ui.FragmentManager;
import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;
import com.example.minervascoutingsubsystemandroid.ui.scout.ScoutFragment;

import java.util.ArrayList;
import java.util.Arrays;

public class ActionsFragment extends Fragment implements FragmentManager {


    ArrayList<Actions> actionsList;
    Actions actions;

    Button preTabBtn;
    Button actionTabBtn;
    Button postTabBtn;

    TextView debugTxtView;
    ActionsViewModel actionsViewModel;

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

    //ViewGroup optionBtnLayout;
    ViewGroup optionBtnLayout;

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

        //optionBtnLayout = (ConstraintLayout) view.findViewById(R.id.action_options_tableLayout);
        final int yellowImgLoc[] = new int[2];

         final int timeCounter  = -1;

         actions = new Actions();


        final ArrayList<Button> zoneBtns = new ArrayList<>(Arrays.asList(
                zone1Btn, zone2Btn,zone3Btn,zone4Btn,zone5Btn,zone6Btn,zone7Btn,zone8Btn,zone9Btn,
                zone10Btn,zone11Btn,zone12Btn,zone13Btn,zone14Btn,zone15Btn,zone16Btn,zone17Btn,
                zone18Btn,zone19Btn,zone20Btn,zone21Btn,zone22Btn,zone23Btn,zone24Btn
                ));

        final ArrayList<Button> optionBtns = new ArrayList<>(Arrays.asList(intakeBtn,shootBtn,dropBtn,feedBtn,cancelBtn));

        ArrayList<ImageView> zoneImageViews = new ArrayList<>(Arrays.asList(yellowImg,zone2Img));






        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MatchTimerManager.startMatchTimer();

            }
        });




        /**
         * Cycles through all zone buttons as a onClick listener
         *
         * KNOWN ISSUE:
         * When zone 21 is clicked, none of the optionButtons can be clicked because its under zone 21
         */
        for ( int i = 0 ; i < zoneBtns.size(); i ++){
            final int copyOfI = i;

            int tempTimeCounter = -1;
            zoneBtns.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MatchTimerManager.getCounter();
                    zoneBtns.get(copyOfI).setEnabled(false);


                    for (Button button : optionBtns){
                        if (temp1 != 0 && temp2 != 0){
                            TranslateAnimation animation = new TranslateAnimation(0, button.getX() - temp1, 0, button.getY() - temp2);
                            animation.setDuration(10000); // duartion in ms

                            intakeBtn.startAnimation(animation);
                        }
                    }
//Testing if zone 21 btn is hit or the actions menu
                    if (copyOfI == 20){
                        Log.d("CREATION","IM HITTING ZONE 21");
                    }
                    //Get teh coordinates of zone button clicked
                    int[] zoneBtnLoc= getCoordinateXY(zoneBtns.get(copyOfI));


                    for (int j =0;j<zoneBtns.size();j++)
                    {
                        if(copyOfI !=j){
                            zoneBtns.get(j).setVisibility(View.INVISIBLE);
                        }
                        else{
                            TableLayout.LayoutParams btnGroupPos = new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                            btnGroupPos.leftMargin = zoneBtnLoc[0];
                            btnGroupPos.topMargin = zoneBtnLoc[1];
                            System.out.println("TEST 1");
                            try {
                                //intakeBtn.setLayoutParams(btnGroupPos);

                                TranslateAnimation animation = new TranslateAnimation(0, 200, 0, 200);
                                animation.setDuration(10000); // duartion in ms
                                animation.setFillAfter(false);
                                intakeBtn.startAnimation(animation);
                                intakeBtn.setVisibility(View.VISIBLE);
                                temp1 = 0;
                                temp2 = 0;
                                Actions actions = new Actions();
                                actions.setAction("asdadadasd");
                                ScoutFragment.submittedInfoWrapper.addAction(actions);
                            }catch (Exception e){
                                e.printStackTrace();
                            }
                            System.out.println("TEST 2");
                           // optionBtnLayout.setLayoutParams(btnGroupPos);

                            //optionBtnLayout.setTranslationX(zoneBtnLoc[0]);s
                            //optionBtnLayout.setTranslationY(zoneBtnLoc[1]);
                            debugTxtView.setText("Location of intake btn is " + intakeBtn.getX() + ", " + intakeBtn.getY()
                            +"\n Location of zone clicked is" + zoneBtns.get(copyOfI).getX() + ", " + zoneBtns.get(copyOfI).getY());


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
                Actions action = new Actions();

            }
        });


        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    for (int m = 0; m< optionBtns.size(); m++){
                        optionBtns.get(m).setVisibility(View.INVISIBLE);
                    }
                    for(int i = 0; i < zoneBtns.size(); i++){
                        zoneBtns.get(i).setVisibility(View.VISIBLE);
                    }

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
                        debugTxtView.setText ("X Of"+ btnName + ": " + btnXLoc +" \n Y of " + btnName + " :" + btnYLoc);
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


//        yellowImg.setVisibility(View.INVISIBLE);
//        fieldImg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                yellowImg.getLocationOnScreen(yellowImgLoc);
//                int yellowXLoc = yellowImgLoc[0];
//                int yellowYLoc = yellowImgLoc[1];
//                debugTxtView.setText("X Of yellowImg = " + yellowXLoc + " \n Y of yellowImg = " + yellowYLoc);
//            }
//        });
        //view.findViewById(R.id.yellow_imgView).setVisibility(View.VISIBLE);




//        public  String getCoordinateXY(int btnID){
//            Button btn = (Button) view.findViewById(btnID);
//            int locOfBtn[] = new  int[2];
//            btn.getLocationOnScreen(locOfBtn);
//            int btnXLoc = locOfBtn[0];
//            int btnYLoc = locOfBtn[1];
//            String btnDisplayText = btn.getText().toString();
//            return ("X Of"+ btnDisplayText + ": " + btnXLoc +" \n Y of " + btnDisplayText + " :" + btnYLoc);
//
//        }

        return view;
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



}
