package com.example.minervascoutingsubsystemandroid.ui.scout.scoutpages.pages.post;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.minervascoutingsubsystemandroid.CONST;
import com.example.minervascoutingsubsystemandroid.R;
import com.example.minervascoutingsubsystemandroid.structure.models.MatchSubmit;
import com.example.minervascoutingsubsystemandroid.structure.models.MatchSubmitManager;
import com.example.minervascoutingsubsystemandroid.structure.models.PostActions;
import com.example.minervascoutingsubsystemandroid.ui.FragmentManager;
import com.example.minervascoutingsubsystemandroid.ui.OnFragmentChangeListener;
import com.example.minervascoutingsubsystemandroid.ui.scout.ScoutFragment;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import static com.example.minervascoutingsubsystemandroid.structure.models.MatchTimerManager.stopMatchTimer;

public class PostFragment extends Fragment implements FragmentManager {

    OnFragmentChangeListener fragmentListener;
    private Button preBtn;
    private Button actionBtn;
    private Button postBtn;

    SeekBar climbPosSeekBar;
    TextView climbPosTxtView;

    Switch hasParkedSwitch;
    Switch gotClimbAssistanceSwitch;
    Switch gaveClimbAssistanceSwitch;
    Switch isBarBalancedSwitch;

    Switch wasBotDefendedSwitch;

    Spinner commentsSelectionSpinner;
    EditText commentsEdiText;

    String climbPos;

    Button submitMatchBtn;
    PostViewModel postViewModel;

    ProgressBar climbPosProgressBar;
    String climbPosDescription;

    Button submitMatch;

   TextView teamNumInfoTextView;

    PostActions post = new PostActions();
    /**
     *
     * TODO: ADD SKETCHY-O METER ON CLIMB
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {




        postViewModel = ViewModelProviders.of(this).get(PostViewModel.class);
        final View view = inflater.inflate(R.layout.fragment_scout_post_action, container, false);





        preBtn = (Button) view.findViewById(R.id.pre_post_btn);
        actionBtn = (Button) view.findViewById(R.id.actions_post_btn);
        postBtn = (Button) view.findViewById(R.id.post_post_btn);

        climbPosSeekBar = (SeekBar) view.findViewById(R.id.climbPos_seekbar);
        climbPosTxtView = (TextView) view.findViewById(R.id.climbPost_txtView);

        hasParkedSwitch = (Switch) view.findViewById(R.id.park_switch);
        gotClimbAssistanceSwitch = (Switch) view.findViewById(R.id.gotBuddyd_switch);
        gaveClimbAssistanceSwitch = (Switch) view.findViewById(R.id.buddydBot_switch);
        isBarBalancedSwitch = (Switch) view.findViewById(R.id.barBalance_switch);
        wasBotDefendedSwitch = (Switch) view.findViewById(R.id.wasDefended_switch);

        commentsSelectionSpinner = (Spinner) view.findViewById(R.id.optionalComments_spinner);
        commentsEdiText = (EditText) view.findViewById(R.id.comments_editText);

        submitMatchBtn = (Button) view.findViewById(R.id.submitMatchBtn);



        submitMatch = (Button) view.findViewById(R.id.submitMatchBtn);

        teamNumInfoTextView = (TextView) view.findViewById(R.id.teamNumInfor_post_txtView);
        climbPos = "NULL";

        climbPosDescription = "NULL";

        final String[] sampleComments = {};


        ArrayAdapter adapter = new ArrayAdapter(this.getContext(),android.R.layout.simple_spinner_item,Arrays.asList(sampleComments));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        commentsSelectionSpinner.setAdapter(adapter);




        preBtn.setVisibility(View.INVISIBLE);
        actionBtn.setVisibility(View.VISIBLE);
        postBtn.setVisibility(View.INVISIBLE);

        commentsSelectionSpinner.setVisibility(View.GONE);


        teamNumInfoTextView.setText(ScoutFragment.submittedInfoWrapper.getSubmittedGame().getTeamNum()+"");
        if(ScoutFragment.submittedInfoWrapper.getSubmittedGame().getAlliance() == 'r')
        teamNumInfoTextView.setBackgroundColor(Color.RED);
        else
            teamNumInfoTextView.setBackgroundColor(Color.BLUE);
        commentsSelectionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                String currentComment = commentsEdiText.getText().toString();
                int lenOfSasmpleText = sampleComments.length;
                 for(int i = 0 ; i <lenOfSasmpleText ; i ++){
                     if(i == 0){
                         currentComment += ", "+ sampleComments[i];
                     }
                     else if (i<lenOfSasmpleText-2){
                         currentComment += sampleComments[i] + ", ";
                     }
                     else if(lenOfSasmpleText-i == 2){
                         currentComment += sampleComments[i];
                     }

                 }


               commentsEdiText.setText(currentComment);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        climbPosSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            public ArrayList findClimbPos(int progress){
                int positionConversion = climbPosProgressBar.getProgress();


                if(progress<20){
                    climbPosDescription = "Far Left of bar";
                    climbPos= "1";
                }
                else if(progress<20)
                {
                    climbPosDescription = "Left of bar";
                    climbPos = "2";
                }
                else if ( progress <40)
                {
                    climbPosDescription = "Center of bar";
                    climbPos = "3";
                }
                else if (progress <60)
                {
                    climbPosDescription = " Right of bar";
                    climbPos = "4";
                }
                else if (progress <80)
                {
                    climbPosDescription = "Far right of bar";
                    climbPos = "5";
                }

                ArrayList<String> climbReturns = new ArrayList<>(Arrays.asList(climbPos,climbPosDescription)) ;
                return   climbReturns;
            }




            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                //returned as climbPos, climbPosDescription
//                int positionConversion = climbPosProgressBar.getProgress();


                if(progress<20){
                    climbPosDescription = "Far Left of bar";
                    climbPos= "1";
                }
                else if(progress<40)
                {
                    climbPosDescription = "Left of bar";
                    climbPos = "2";
                }
                else if ( progress <60)
                {
                    climbPosDescription = "Center of bar";
                    climbPos = "3";
                }
                else if (progress <80)
                {
                    climbPosDescription = " Right of bar";
                    climbPos = "4";
                }
                else
                {
                    climbPosDescription = "Far right of bar";
                    climbPos = "5";
                }


                climbPosTxtView.setText(climbPosDescription);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        submitMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPostValues();
                System.out.println(new Gson().toJson(post));
                ScoutFragment.submittedInfoWrapper.setPostActions(post);
                final String fileName =ScoutFragment.submittedInfoWrapper.getSubmittedGame().getMatchNum()+"_"+
                        ScoutFragment.submittedInfoWrapper.getSubmittedGame().getTeamNum()+"_"+ UUID.randomUUID().toString()+".json";
                try {
                    writeToFile((new Gson()).toJson(ScoutFragment.submittedInfoWrapper),fileName, view.getContext());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(fileName);
                MatchSubmitManager.addMatchSubmitToPref(new MatchSubmit(fileName,false));
                final OkHttpClient client = new OkHttpClient().newBuilder()
                        .build();
                MediaType mediaType = MediaType.parse("text/plain");
                System.out.println(new Gson().toJson(ScoutFragment.submittedInfoWrapper));
                RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                        .addFormDataPart("json", new Gson().toJson(ScoutFragment.submittedInfoWrapper))
                        .build();
                System.out.println(CONST.postURI+"/minervascouting2020/api/upload/submittedInfoWrapperJSON");
                final Request request = new Request.Builder()
                        .url(CONST.postURI+"/minervascouting2020/api/upload/submittedInfoWrapperJSON")
                        .method("POST", body)
                        .build();
                    AsyncTask.execute(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Response response = client.newCall(request).execute();
                                if (response.isSuccessful()){
                                    MatchSubmitManager.addMatchSubmitToPref(new MatchSubmit(fileName,true));
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                stopMatchTimer();

                fragmentListener.onFragmentChange(1);
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

    public void setPostValues(){

        post.setComment(commentsEdiText.getText().toString());
        if (hasParkedSwitch.isChecked()){
            post.setParked(true);
        }
        else{
            post.setParked(false);
        }


        if(gotClimbAssistanceSwitch.isChecked()){
            post.setGotClimbAssistance(true);
        }
        else
        {
            post.setGotClimbAssistance(false);
        }


        if (gaveClimbAssistanceSwitch.isChecked()){
            post.setBuddyBot(true);
        }
        else {
            post.setBuddyBot(false);
        }


        if (isBarBalancedSwitch.isChecked()){
            post.setBalanced(true);
        }
        else {
            post.setBalanced(false);
        }


        if(wasBotDefendedSwitch.isChecked()){
            post.setWasBotDefended(true);
        }
        else {
            post.setWasBotDefended(false);
        }
        try{
            post.setHangLoc(Integer.parseInt(climbPos));
        }
        catch (Exception e ){
            post.setHangLoc(-1);
            System.out.println("CANNOT SET CLIMB POSITION");
        }
    }


    public static void writeToFile(String data, String fileName, Context context) throws IOException {
        File root = Environment.getExternalStorageDirectory();

        File outDir = new File(root.getAbsolutePath() + File.separator + "Scouting_App_2020");
        Writer writer;
        boolean success = true;
        if (!outDir.exists()) {
            success = outDir.mkdirs();
        }
        if (success) {
            File outPutFile = new File(outDir, fileName);
            writer = new PrintWriter(new FileWriter(outPutFile));
            writer.write(data);
            writer.close();
            writer.flush();
        } else {
            Log.e("Error","Folder not created properly");
        }
    }


}
