package com.example.tom10.donttouchtheblacktile;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //use 3px or Xdp for XML stuff
    Button[] row1 = new Button[4];
    Button[] row2 = new Button[4];
    Button[] row3 = new Button[4];
    Button[] row4 = new Button[4];
    Button[] stdFreeRow;
    Button[][] allRows = {row1, row2, row3, row4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * flags
         */
        boolean isBlackTileOnRow1 = false; //todo
        boolean isBlackTileOnRow2 = false;
        boolean isBlackTileOnRow3 = false;
        boolean isBlackTileOnRow4 = false;
        /**
         * buttons
         */
        row1[0] = findViewById(R.id.button11);
        row1[1] = findViewById(R.id.button12);
        row1[2] = findViewById(R.id.button13);
        row1[3] = findViewById(R.id.button14);

        row2[0] = findViewById(R.id.button21);
        row2[1] = findViewById(R.id.button22);
        row2[2] = findViewById(R.id.button23);
        row2[3] = findViewById(R.id.button24);

        row3[0] = findViewById(R.id.button31);
        row3[1] = findViewById(R.id.button32);
        row3[2] = findViewById(R.id.button33);
        row3[3] = findViewById(R.id.button34);

        row4[0] = findViewById(R.id.button41);
        row4[1] = findViewById(R.id.button42);
        row4[2] = findViewById(R.id.button43);
        row4[3] = findViewById(R.id.button44);

        stdFreeRow = row1.clone();//System.arraycopy( src, 0, dest, 0, src.length );
        row1[0].setBackgroundColor(Color.BLUE);
        for (Button[] array : allRows) { //should have checked if infected, rather then color.... -_-
            //TODO remove this later
            int i = getRand();
            Log.wtf("qqq", "getRand() is: " + i);
            array[i].setBackgroundColor(Color.BLACK);
        }

        isBlackTileOnRow1 = isBlackTileOnRow2 = isBlackTileOnRow3 = isBlackTileOnRow4 = true;
        //TODO

        //  findViewById(R.id.button41).setBackgroundColor(Color.BLACK);

        for (int i = 0; i < allRows.length; i++)
            for (int j = 0; j < allRows[i].length; j++) {
                final int ii = i; // ewwwww
                final int jj = j;

                allRows[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int colorOfTile = -99;
                        try {
                            colorOfTile = ((ColorDrawable) allRows[ii][jj].getBackground()).getColor();
                        } catch (Exception e) {
                        }

                        if ((colorOfTile == Color.BLACK) && (ii == 3)) { //&& isShiftDown(4, isBlackTileOnRow4)
                            orderShiftDown();
                        }
                    }
                });
            }

    }//onCreate

    /**
     * Shift down, replace top most row with STD free one, make 1 square black
     */
    //TODO ark as infected to avoid overhead of array.clone();
    private Button[][] shiftDown(Button[] row1, Button[] row2, Button[] row3, Button[] row4, Button[] stdFreeRow) {


        List<String> list = new ArrayList<>();
        for (int i = 0; i < allRows.length; i++)
            for (int j = 0; j < allRows[i].length; j++) {
                int colorOfTile = -99;
                try {
                    colorOfTile = ((ColorDrawable) allRows[i][j].getBackground()).getColor();
                } catch (Exception e) {
                }


                if (colorOfTile == Color.BLACK)
                    list.add("(" + i + "," + j + ")");

            }//inner forloop
        while (list.iterator().hasNext()) {
            Log.d("listOBJ", list.iterator().next());
        }

    /*   // row4 = row3.clone();
        row3 = row2.clone();
        row2 = row1.clone();
        row1 = stdFreeRow.clone();
        if (((ColorDrawable) row1[0].getBackground()).getColor() == Color.BLUE) {
            row2[0]=row1[0];
            Toast.makeText(this, "hiii ", Toast.LENGTH_SHORT).show();
        }*/
        Button[][] reternMe = {row1, row2, row3, row4};
        return reternMe;
    }

    /*
       private Button[][] shiftDown(Button[] row1, Button[] row2, Button[] row3, Button[] row4, Button[] stdFreeRow) {
            //TODO
            //     row4 = row3.clone();
            //     row3 = row2.clone();
            //     row2 = row1.clone();
            //    row1 = stdFreeRow.clone();
            row1[getRand()].setBackgroundColor(Color.BLACK);
            Toast.makeText(this, "shiftDown**", Toast.LENGTH_SHORT).show();
            Button[][] reternMe = {row1, row2, row3, row4};
            return reternMe;
        }
     */
    private void orderShiftDown() {
        allRows = shiftDown(row1, row2, row3, row4, stdFreeRow);
    }

    private boolean isShiftDown(int rowNumb, boolean isTilePresent) {
        //TODO
        return false;
    }

    private int getRand() {
        return (int) (Math.random() * 4);//+1
    }


    public Button[] getrow1() {
        return row1;
    }

    public Button[] getrow2() {
        return row2;
    }

    public Button[] getrow3() {
        return row3;
    }

    public Button[] getrow4() {
        return row4;
    }
}//MainActivity
