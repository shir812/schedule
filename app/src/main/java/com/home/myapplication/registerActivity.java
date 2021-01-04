package com.home.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class registerActivity extends AppCompatActivity {
    private EditText name;
    private EditText lastname;
    private EditText id;
    private EditText username;
    private EditText pass;
    private Boolean isteacher;
    private User_Profile user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        user= new User_Profile(name.toString(), lastname.toString(), id.toString(), username.toString(), pass.toString(), isteacher);
        if (user.getTeacher()) {
            Intent intent = new Intent(this,ProfileT_Activity.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this,ProfileSActivity.class);
            startActivity(intent);
        }
    }
}