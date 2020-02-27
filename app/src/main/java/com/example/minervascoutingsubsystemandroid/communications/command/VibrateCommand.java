package com.example.minervascoutingsubsystemandroid.communications.command;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

import com.example.minervascoutingsubsystemandroid.CONST;
import com.example.minervascoutingsubsystemandroid.MainActivity;

@CommandDesc(name = "vibrate")
public class VibrateCommand implements Command {

    int duration;

    @Override
    public void executeCommand() {
        if (duration > CONST.MAX_VIBRATION_TIME){
            duration = CONST.MAX_VIBRATION_TIME;
        }
        Vibrator v = (Vibrator) MainActivity.mainActivity.getSystemService(Context.VIBRATOR_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            v.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            v.vibrate(500);
        }
    }

    @Override
    public void processCommand(String cmdStr) {

    }
}
