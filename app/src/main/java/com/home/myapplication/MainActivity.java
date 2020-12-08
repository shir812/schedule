package com.home.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button st;
    private Button tc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        st = findViewById(R.id.students);
        tc = findViewById(R.id.teachers);

        st.setOnClickListener(this);
        tc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        if ( v == st)
        {
            Intent intent = new Intent(this,Students_LogInActivity.class);
            startActivity(intent);
        }

        if ( v == tc)
        {
            Intent intent = new Intent(this,Teachers_LoginActivity.class);
            startActivity(intent);
        }
        }





}









