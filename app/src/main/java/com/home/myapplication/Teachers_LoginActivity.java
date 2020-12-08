package com.home.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Teachers_LoginActivity extends AppCompatActivity {
// setting buttons
    private Button tch_li;
    private EditText tch_name;
    private EditText tch_pass;

//moving to the different screens
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers__login);

        tch_li = findViewById(R.id.teachers);

        tch_name = findViewById(R.id.tch_name);
        tch_pass = findViewById(R.id.tch_pass);

    }

}