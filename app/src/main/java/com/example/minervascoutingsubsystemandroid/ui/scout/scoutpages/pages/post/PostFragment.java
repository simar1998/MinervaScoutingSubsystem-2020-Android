package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.post;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.minervascoutingsubsystemandroid.R;
import com.example.minervascoutingsubsystemandroid.structure.models.PostActions;

public class PostFragment extends Fragment {

    private Button preBtn;
    private Button actionBtn;
    private Button postBtn;

    SeekBar climbPosSeekBar;
    TextView climbPosTxtView;

    Switch hasParkedSwitch;
    Switch gotClimbAssistanceSwitch;
    Switch gaveClimbAssistanceSwitch;
    Switch isBarBalancedSwitch;

    Spinner commentsSelectionSpinner;
    TextView commentsTextView;


    Button submitMatchBtn;
    PostViewModel postViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        postViewModel = ViewModelProviders.of(this).get(PostViewModel.class);
        View view = inflater.inflate(R.layout.fragment_scout_post_action, container, false);


        final PostActions post = new PostActions();


        climbPosSeekBar = (SeekBar) view.findViewById(R.id.climbPos_seekbar);
        climbPosTxtView = (TextView) view.findViewById(R.id.climbPost_txtView);

        hasParkedSwitch = (Switch) view.findViewById(R.id.park_switch);
        gotClimbAssistanceSwitch = (Switch) view.findViewById(R.id.gotBuddyd_switch);
        gaveClimbAssistanceSwitch = (Switch) view.findViewById(R.id.buddydBot_switch);
        isBarBalancedSwitch = (Switch) view.findViewById(R.id.barBalance_switch);

        commentsSelectionSpinner = (Spinner) view.findViewById(R.id.optionalComments_spinner);
        commentsTextView = (TextView) view.findViewById(R.id.comments_editText);

        submitMatchBtn = (Button) view.findViewById(R.id.submitMatchBtn);


        submitMatchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hasParkedSwitch.isChecked()){
                    post.setParked(true);
                }
                else{
                    post.setParked(false);
                }


                if(gotClimbAssistanceSwitch.isChecked()){
                    post.setGotBuddyd(true);
                }
                else
                {
                    post.setGotBuddyd(false);
                }

                if (gaveClimbAssistanceSwitch.isChecked()){
                    post.setBuddydBot(true);
                }
                else {
                    post.setBuddydBot(false);
                }

                if (isBarBalancedSwitch.isChecked()){
                    post.setBarBalanced(true);
                }
                else {
                    post.setBarBalanced(false);
                }

            }
        });














        return view;
    }
}
