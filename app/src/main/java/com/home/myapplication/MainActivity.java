package com.home.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button login;
    private EditText userName;
    private EditText userPass;
    private Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = findViewById(R.id.newUser);
        login = findViewById(R.id.enter);
        userName = findViewById(R.id.name);
        userPass = findViewById(R.id.pass);

        login.setOnClickListener(this);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
       if ( v == login)
        {
           Intent intent = new Intent(this,CoursesActivity.class);
           startActivity(intent);
       }
        if (v== register ){ // register screen
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        }

    }










}









