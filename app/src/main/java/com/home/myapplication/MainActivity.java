package com.home.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
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
            Intent intent = new Intent(this,Students_LogInActivity.class);
            startActivity(intent);
        }
        }





}









