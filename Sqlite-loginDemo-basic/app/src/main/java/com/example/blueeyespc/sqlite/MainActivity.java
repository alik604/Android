package com.example.blueeyespc.sqlite;
/**
 * @aurthor not me!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * @date 4-30-2018
 * @resources https://www.youtube.com/watch?v=ULudeYrQDXA
 * https://github.com/Shivakishore14/AndroidTutorial/tree/master/SqliteTut
 * <p3>
 * C&Ped off github. typed out everything java,
 * got error with the SQL stuff. thats what i get for using shortform
 * when following a video. scraped my typed code and used a copy off github.
 * </p3>
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login, signup;
    EditText name, pass;
    DbHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.btnLogin);
        signup = (Button) findViewById(R.id.BtnSignUp);
        name = (EditText) findViewById(R.id.etName);
        pass = (EditText) findViewById(R.id.etPassword);

        db = new DbHandler(getApplicationContext());
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (db.login(name.getText().toString(), pass.getText().toString()))
                    Toast.makeText(getApplicationContext(), "valid", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "try again", Toast.LENGTH_LONG).show();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.insert(name.getText().toString(), pass.getText().toString());
                Toast.makeText(getApplicationContext(), "Done", Toast.LENGTH_LONG).show();
            }
        });
    }
}