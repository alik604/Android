package com.example.tom10.a99namesofallahswt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class details extends AppCompatActivity {
    TextView topTV_ariName;
    TextView midTV_engName;
    TextView bottomTV_benef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        // Toolbar toolbar = ( Toolbar ) findViewById(R.id.toolbar);
        //  toolbar.setVisibility(View.GONE);
        //  setSupportActionBar(toolbar);
        Intent in = getIntent();
        Bundle b = in.getExtras();

        topTV_ariName = ( TextView ) findViewById(R.id.topTextView);
        midTV_engName = ( TextView ) findViewById(R.id.midTextView);
        bottomTV_benef = ( TextView ) findViewById(R.id.bottomTextView);

        topTV_ariName.setText(b.get("name").toString());
        midTV_engName.setText(b.get("trans").toString());
        bottomTV_benef.setText(b.get("desc").toString());

        FloatingActionButton fab = ( FloatingActionButton ) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent i = new Intent(details.this,MainActivity.class);

                startActivity(new Intent(details.this, MainActivity.class));
                //TODO go back to right pos
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
    }//onCreate


}
