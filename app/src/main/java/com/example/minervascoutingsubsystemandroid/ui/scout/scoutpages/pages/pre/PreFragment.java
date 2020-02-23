package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.pre;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.minervascoutingsubsystemandroid.R;
import com.example.minervascoutingsubsystemandroid.structure.models.Pre;
import com.example.minervascoutingsubsystemandroid.ui.FragmentManager;
import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;

public class PreFragment extends Fragment implements FragmentManager {

    PreViewModel preViewModel;

    OnFragmentChangeListener fragmentListener;

    private Button preTabBtn;
    private Button actionTabBtn;
    private Button postTabBtn;

    SeekBar botSetupPos;
    ProgressBar progressBar;
    TextView startingPosDescription;

    CheckBox hasBallPreload;


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


        botSetupPos = (SeekBar) view.findViewById(R.id.start_pos_seekbar);
        progressBar = (ProgressBar) view.findViewById(R.id.start_pos_progressbr);
        startingPosDescription = (TextView) view.findViewById(R.id.robot_pos_txtView);

        hasBallPreload = (CheckBox) view.findViewById(R.id.ballsPreloaded_init_chkbx);

        submitPre = (Button) view.findViewById(R.id.submit_pre_btn);

        startPos = "NULL";


        /**
         * TODO- adjust values for positions depending on where the bot starts
         * i.e. bot in front of trench is different than start in front of hirizontal rendevouz
         *
         */
        botSetupPos.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public String findStartingPos(int progress){
                int positionConversion = progressBar.getProgress();


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


                progressBar.setProgress(progress);
                startingPosDescription.setText(findStartingPos(progress));
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
                //balls preload
                if(hasBallPreload.isChecked()){
                    pre.setLoadedBall(1);
                }
                else {
                    pre.setLoadedBall(0);
                }


                if(startPos != "NULL") {
                    pre.setStartPos(startPos);
                    fragmentListener.onFragmentChange(3);
                }
                else
                    Toast.makeText(getContext(), "Update the Robot Starting position", Toast.LENGTH_SHORT).show();




            }
        });



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
