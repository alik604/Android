package com.example.blueeyespc.basicalarmapp;
/**
 * @author khizr ali pardhan
 * @date 4/29/2018
 * @resources used:
 * https://www.youtube.com/watch?v=QcF4M2yUpY4
 * https://github.com/Shivakishore14/AndroidTutorial/tree/master/AlarmTut
 */

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSet;
    EditText etTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSet = (Button) findViewById(R.id.btnSet);
        etTime = (EditText) findViewById((R.id.etAlarm));

        btnSet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int time = Integer.parseInt(etTime.getText().toString());

                Intent i = new Intent(MainActivity.this, Alarm.class);
                AlarmManager am = (AlarmManager) getSystemService(ALARM_SERVICE);
                PendingIntent pi = PendingIntent.getBroadcast(getApplicationContext(), 0, i, 0);
                am.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (time * 1000), pi);
                Toast.makeText(getApplicationContext(), "Alarm set in " + time + "seconds", Toast.LENGTH_LONG).show();

            }
        });


    }
}
