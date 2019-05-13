/*
@author khizr ali pardhan
@version 1.0, an atrocity.
@date 2018-01-01

made my first ~5 apps during christmas break, after finishing at langara college.
started sfu spring 2018. started 2nd year CPSC (or as SFU calls it CMPT)
 */


package com.example.tom10.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView text;
    double numb1 = 0;
    double numb2 = 0;
    double sum = 0;

    char op;
    boolean isopUsed = false;
    boolean iseqUsed = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button[] buttonArrayNumbered = {findViewById(R.id.button1), findViewById(R.id.buttonPERIOD),
                findViewById(R.id.button2), findViewById(R.id.button3), findViewById(R.id.button4),
                findViewById(R.id.button5), findViewById(R.id.button6), findViewById(R.id.button7),
                findViewById(R.id.button8), findViewById(R.id.button9), findViewById(R.id.button0)};
        // b.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
        Button[] buttonArrayOpperators = {findViewById(R.id.buttonDIV), findViewById(R.id.buttonMIN), findViewById(R.id.buttonPLUS), findViewById(R.id.buttonMULTI)};

        Button buttonEquals = findViewById(R.id.buttonEQUALS);
        Button buttonClear = findViewById(R.id.buttonCLEAR);
        Button buttonInvert = findViewById(R.id.buttonINVERT);
        Button buttonBack = findViewById(R.id.buttonBACK);
        text = findViewById(R.id.box);
        // text.setText("i hate math");

        /**add action handler for numbered buttons*/
        for (final Button b : buttonArrayNumbered) {
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (text.getText().toString().equals("0.00") || text.getText().toString().equals("0.0")) {
                        text.setText("");
                        isopUsed = false;
                    }
                    text.append(b.getText().toString().replaceAll("\\s+", ""));
                }
            });
        }

        /**add action handler for operation buttons*/
        for (final Button b : buttonArrayOpperators) {
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    op = b.getText().charAt(0);
                    dealWithSettingNumb();
                    text.setText("");
                    Log.i("any", "2:" + String.valueOf(numb2));
                    Log.i("any", "isopused?:" + String.valueOf(isopUsed));
                    Log.i("any", "opIs?:" + String.valueOf(op));
                }
            });

            /**add action handler for equals buttons*/
            buttonEquals.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dealWithSettingNumb();
                    Log.i("any", "--------------------------");
                    Log.i("any", "1:" + String.valueOf(numb1));
                    Log.i("any", "2:" + String.valueOf(numb2));
                    Log.i("any", "isopused?:" + String.valueOf(isopUsed));
                    Log.i("any", "opIs?:" + String.valueOf(op));
                    dealWithEquals();
                }
            });

        }
/**add action handler for clear button*/
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
                numb1 = numb2 = sum = 0;
                iseqUsed = isopUsed = false;
            }
        });

        /**add action handler for invert button*/
        buttonInvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("-" + text.getText());
                numb1 *= -1;
                dealWithEquals();

            }
        });

        /**add action handler for back button*/
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().subSequence(0, text.getText().length() - 1));
            }
        });

    }//no create

    public void dealWithSettingNumb() {
        Log.i("any", "isopused?:" + String.valueOf(isopUsed));
        Log.i("any", "opIs?:" + String.valueOf(op));
        if (isopUsed == true) {
            try {
                numb2 = Double.parseDouble(text.getText().toString());
            } catch (Exception e) {
                numb2 = 0;
            }
        } else {
            isopUsed = true;
            try {
                numb1 = Double.parseDouble(text.getText().toString());
            } catch (Exception e) {
                numb1 = 0;
                isopUsed = false;
            }

        }
    }

    public void dealWithEquals() {
        if (isopUsed) {
            Log.i("any", "inside switch");
            switch (op) {
                case '+':
                    sum = numb1 + numb2;
                    break;
                case '-':
                    sum = numb1 - numb2;
                    break;
                case '/':
                    sum = numb1 / numb2;
                    break;
                case 'X':
                    sum = numb1 * numb2;
                    break;
                default:
                    Log.i("any", "default case******8 ");
            }
            text.setText(String.valueOf(sum));//.substring(0, 7));//lenght + 1 (for deci) + precision points
            Log.i("any", "sum:" + String.valueOf(sum));
            numb1 = sum;
            numb2 = 0;
            sum = -9999;// just in case
            iseqUsed = true;
        }
        //   Log.i("any", "Clicked ");
    }


}//class
