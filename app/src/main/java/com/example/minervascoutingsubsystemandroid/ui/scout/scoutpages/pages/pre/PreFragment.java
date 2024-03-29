package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.pre;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.minervascoutingsubsystemandroid.R;
import com.example.minervascoutingsubsystemandroid.structure.models.Pre;
import com.example.minervascoutingsubsystemandroid.ui.FragmentManager;
import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;
import com.example.minervascoutingsubsystemandroid.ui.scout.ScoutFragment;

public class PreFragment extends Fragment implements FragmentManager {

    PreViewModel preViewModel;

    OnFragmentChangeListener fragmentListener;

    private Button preTabBtn;
    private Button actionTabBtn;
    private Button postTabBtn;

    SeekBar bluePosSeekbar;
    ProgressBar bluePosProgressBar;
    TextView bluePosDescriptionTxtView;

    SeekBar redPosSeekbar;
    ProgressBar redPosProgressBar;
    TextView redPosDescriptionTxtView;

    TextView teamNumInfoTextView;


    RadioButton preLoaded0;
    RadioButton preLoaded1;
    RadioButton preLoaded2;
    RadioButton preLoaded3;


    String startPos;

    private Button submitPre;
    /**
     * TODO - add actions for pre,action, and post tab buttons
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final Pre pre = new Pre();


//        preViewModel = ViewModelProviders.of(this).get(PreViewModel.class);
        View view = inflater.inflate(R.layout.fragment_scout_pre_action, container, false);


        preTabBtn = (Button) view.findViewById(R.id.pre_pre_btn);
        actionTabBtn = (Button) view.findViewById(R.id.actions_pre_btn);
        postTabBtn = (Button) view.findViewById(R.id.post_pre_btn);


        redPosSeekbar = (SeekBar) view.findViewById(R.id.start_pos_blue_seekbar);
        redPosProgressBar = (ProgressBar) view.findViewById(R.id.start_pos_progressbr);
        redPosDescriptionTxtView = (TextView) view.findViewById(R.id.robot_pos_blue_txtView);

        bluePosSeekbar = (SeekBar) view.findViewById(R.id.start_pos_blue_seekbar);
        bluePosProgressBar = (ProgressBar) view.findViewById(R.id.start_pos_progressbr);
        bluePosDescriptionTxtView = (TextView) view.findViewById(R.id.robot_pos_blue_txtView);

        preLoaded0 = (RadioButton) view.findViewById(R.id.preLoadedBalls0_radioBtn);
        preLoaded1 = (RadioButton) view.findViewById(R.id.preLoadedBalls1_radioBtn);
        preLoaded2 = (RadioButton) view.findViewById(R.id.preLoadedBalls2_radioBtn);
        preLoaded3 = (RadioButton) view.findViewById(R.id.preLoadedBalls3_radioBtn);

        submitPre = (Button) view.findViewById(R.id.submit_pre_btn);


        teamNumInfoTextView = (TextView) view.findViewById(R.id.teamNumInfor_pre_txtView);
        startPos = "NULL";

        SeekBar botSeupSeekBar;
        final ProgressBar botSetupProgressBar;
        final TextView botStartPosDescription;


        preTabBtn.setVisibility(View.INVISIBLE);
        actionTabBtn.setVisibility(View.INVISIBLE);
        postTabBtn.setVisibility(View.INVISIBLE);



        redPosDescriptionTxtView.setVisibility(View.INVISIBLE);
        redPosProgressBar.setVisibility(View.INVISIBLE);
        redPosSeekbar.setVisibility(View.INVISIBLE);



        bluePosDescriptionTxtView.setVisibility(View.INVISIBLE);
        bluePosProgressBar.setVisibility(View.INVISIBLE);
        bluePosSeekbar.setVisibility(View.INVISIBLE);


//comment this when uncommenting the if statements below
//        botSetupProgressBar = bluePosProgressBar;
//        botSeupSeekBar = bluePosSeekbar;
//        botStartPosDescription = bluePosDescriptionTxtView;

        char alliance =  ScoutFragment.submittedInfoWrapper.getSubmittedGame().getAlliance();

        if(alliance == 'r'){
            botSeupSeekBar = redPosSeekbar;
            botSetupProgressBar = redPosProgressBar;
            botStartPosDescription = redPosDescriptionTxtView;
        redPosProgressBar.setVisibility(View.VISIBLE);
        redPosDescriptionTxtView.setVisibility(View.VISIBLE);
        redPosSeekbar.setVisibility(View.VISIBLE);

        }
        else{
            botSeupSeekBar = bluePosSeekbar;
            botSetupProgressBar = bluePosProgressBar;
            botStartPosDescription = bluePosDescriptionTxtView;
        bluePosProgressBar.setVisibility(View.VISIBLE);
        bluePosDescriptionTxtView.setVisibility(View.VISIBLE);
        bluePosSeekbar.setVisibility(View.VISIBLE);
        }

        /**
         * TODO- adjust values for positions depending on where the bot starts
         * i.e. bot in front of trench is different than start in front of hirizontal rendevouz
         *
         */
        botSeupSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public String findStartingPos(int progress){
                int positionConversion = botSetupProgressBar.getProgress();


                if(positionConversion<=20){
                    startPos= "In front of alliance trench";
                }
                else if(positionConversion> 20 && positionConversion <= 40)
                {
                    startPos = "in front of target zone";
                }
                else if ( positionConversion >40 && positionConversion<= 80)
                {
                    startPos = "In front of rendevouz";
                }
                else if (positionConversion > 80)
                {
                    startPos = "In front of opponent trench";
                }

                return  startPos;
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {


                botSetupProgressBar.setProgress(progress);
                botStartPosDescription.setText(findStartingPos(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        submitPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean ballsSelected = false;
                //balls preload
                if(preLoaded0.isChecked()){
                    pre.setLoadedBall(0);
                    ballsSelected = true;
                }
                else if (preLoaded1.isChecked()){
                    pre.setLoadedBall(1);
                    ballsSelected = true;
                }
                else if (preLoaded2.isChecked()){
                    pre.setLoadedBall(2);
                    ballsSelected = true;
                }
                else if (preLoaded3.isChecked()){
                    pre.setLoadedBall(3);
                    ballsSelected = true;
                }
                else {
                    Toast.makeText(getContext(), "Please set the number of balls preloaded in " + ScoutFragment.submittedInfoWrapper.getSubmittedGame().getTeamNum(), Toast.LENGTH_SHORT).show();
                }


                if(startPos != "NULL" && ballsSelected == true) {
                    pre.setStartPos(startPos);
                    ScoutFragment.submittedInfoWrapper.setPre(pre);
                    fragmentListener.onFragmentChange(3);
                }
                else
                    Toast.makeText(getContext(), "Update the Robot Starting position", Toast.LENGTH_SHORT).show();
            }
        });


        System.out.println("ALLIANCE: "  + ScoutFragment.submittedInfoWrapper.getSubmittedGame().getAlliance());
        teamNumInfoTextView.setText(ScoutFragment.submittedInfoWrapper.getSubmittedGame().getTeamNum()+"");
        if(ScoutFragment.submittedInfoWrapper.getSubmittedGame().getAlliance() == 'b')
            teamNumInfoTextView.setBackgroundColor(Color.BLUE);
        else
            teamNumInfoTextView.setBackgroundColor(Color.RED);


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
