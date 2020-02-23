package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.actions;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.minervascoutingsubsystemandroid.R;
import com.example.minervascoutingsubsystemandroid.ui.FragmentManager;
import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;

import java.util.ArrayList;
import java.util.Arrays;

public class ActionsFragment extends Fragment implements FragmentManager {


    Button preTabBtn;
    Button actionTabBtn;
    Button postTabBtn;

    TextView debugTxtView;
    ActionsViewModel actionsViewModel;

    OnFragmentChangeListener fragmentListener;

    ImageView fieldImg;

    ImageView yellowImg;
    ImageView zone2Img;

    Button zone3Btn;
    Button zone4Btn;




    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        actionsViewModel = ViewModelProviders.of(this).get(ActionsViewModel.class);
        final View view = inflater.inflate(R.layout.fragment_scout_action, container, false);
        //fragmentListener.onFragmentChange(1);

        preTabBtn = ( Button) view.findViewById(R.id.pre_action_btn2);
        actionTabBtn = ( Button) view.findViewById(R.id.action_action_btn2);
        postTabBtn = ( Button) view.findViewById(R.id.post_action_btn2);

        debugTxtView = (TextView)view.findViewById(R.id.debug_action_txtView);

                fieldImg = (ImageView) view.findViewById(R.id.field_actions_imgView);

        zone3Btn = (Button) view.findViewById(R.id.zone3_btn);
        zone4Btn = ( Button) view.findViewById(R.id.zone4_btn);
        final int yellowImgLoc[] = new int[2];

        final ArrayList<Button> zoneBtns = new ArrayList<>(Arrays.asList(zone3Btn,zone4Btn));

        ArrayList<ImageView> zoneImageViews = new ArrayList<>(Arrays.asList(yellowImg,zone2Img));

        for ( int i = 0 ; i < zoneBtns.size(); i ++){
            final int copyOfI = i;
            zoneBtns.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    getCoordinateXY(zoneBtns.get(copyOfI));

                }

                public  void getCoordinateXY(Button btn ){
                    //Button btn = (Button) view.findViewById(btnID);
                    int locOfBtn[] = new  int[2];
                    btn.getLocationOnScreen(locOfBtn);
                    int btnXLoc = locOfBtn[0];
                    int btnYLoc = locOfBtn[1];
                    String btnName = view.getResources().getResourceEntryName(view.getId());
                    try {
                        debugTxtView.setText ("X Of"+ btnName + ": " + btnXLoc +" \n Y of " + btnName + " :" + btnYLoc);
                    }
                    catch (Exception e){

                    }



                }
            });
        }

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


        yellowImg.setVisibility(View.INVISIBLE);
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

        yellowImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yellowImg.getLocationOnScreen(yellowImgLoc);
                int yellowXLoc = yellowImgLoc[0];
                int yellowYLoc = yellowImgLoc[1];

                debugTxtView.setText("X Of yellowImg = " + yellowXLoc + " \n Y of yellowImg = " + yellowYLoc);
            }
        });


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
}
