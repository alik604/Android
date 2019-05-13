package com.example.blueeyespc.myphonedialer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.CalendarContract.CalendarCache.URI;

public class MainActivity extends AppCompatActivity {

    // names copy and pasted from some example code i found... no point in typing 25ish lines
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnStar;
    Button btnZero;
    Button btnHash;
    Button btnDelete;
    Button btnDial;

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = findViewById(R.id.oneBtn);
        btnTwo = findViewById(R.id.twoBtn);
        btnThree = findViewById(R.id.threeBtn);
        btnFour = findViewById(R.id.fourBtn);
        btnFive = findViewById(R.id.fiveBtn);
        btnSix = findViewById(R.id.sixBtn);
        btnSeven = findViewById(R.id.sevenBtn);
        btnEight = findViewById(R.id.eightBtn);
        btnNine = findViewById(R.id.nineBtn);
        btnStar = findViewById(R.id.starBtn);
        btnZero = findViewById(R.id.zeroBtn);
        btnHash = findViewById(R.id.hashBtn);
        btnDelete = findViewById(R.id.delBtn);
        btnDial = findViewById(R.id.call);

        textView = findViewById(R.id.editText);

    }

    public void one(View v) {
        textView.append("1");
    }

    public void two(View v) {
        textView.append("2");
    }

    public void three(View v) {
        textView.append("5");
    }

    public void four(View v) {
        textView.append("4");
    }

    public void five(View v) {
        textView.append("5");
    }

    public void six(View v) {
        textView.append("6");
    }

    public void seven(View v) {
        textView.append("7");

    }

    public void eight(View v) {
        textView.append("8");

    }

    public void nine(View v) {
        textView.append("9");

    }

    public void star(View v) {
        textView.append("*");
    }

    public void zero(View v) {
        textView.append("0");
    }

    public void hash(View v) {

        textView.append("#");
    }

    public void del(View v) {
        String str = textView.getText().toString();
        if (str.length() >= 1)
            str = str.substring(0, str.length() - 1);
        textView.setText(str);
    }

    public void call(View v) {

        String str = textView.getText().toString();
        if (str.contains("#"))
            str.replace("#", "%23");


        Intent i = new Intent(Intent.ACTION_DIAL);//ACTION_CALL
        i.setData(URI.parse("tel:" + str));

        try {
            startActivity(i);
        } catch (SecurityException e) {
            Toast.makeText(getApplicationContext(), "error caught", Toast.LENGTH_SHORT);
        }

        /*
       if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        } else {
            startActivity(i);
        }
         */
        del(v);
    }
}
