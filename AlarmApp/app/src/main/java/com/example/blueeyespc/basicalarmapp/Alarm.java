//https://stackoverflow.com/questions/45605083/android-vibrate-is-deprecated-how-to-use-vibrationeffect-in-android-api-26
package com.example.blueeyespc.basicalarmapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.widget.Toast;

public class Alarm extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Wake up", Toast.LENGTH_LONG).show();

        Vibrator v = (Vibrator) context.getSystemService(context.VIBRATOR_SERVICE);

        if (Build.VERSION.SDK_INT >= 26) {
            v.vibrate(VibrationEffect.createOneShot(150, 10));
        } else {
            v.vibrate(150);
        }

    }
}
