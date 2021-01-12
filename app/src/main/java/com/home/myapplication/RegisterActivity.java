package com.home.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText name;
    private EditText lastname;
    private EditText id;
    private EditText username;
    private EditText pass;
    private CheckBox isteacher;
    private User_Profile user;
    private Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = findViewById(R.id.name2);
        lastname = findViewById(R.id.lastname2);
        id = findViewById(R.id.id2);
        username = findViewById(R.id.username2);
        pass = findViewById(R.id.pass2);
        isteacher = findViewById(R.id.isteacher2);
        register = findViewById(R.id.enter2);

        register.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v== register){
            // convert the edit text to string
            String namestr = name.getText().toString();
            String laststr = lastname.getText().toString();
            String idstr = id.getText().toString();
            String usernamestr = username.getText().toString();
            String passwordstr = pass.getText().toString();
            Boolean teacher = isteacher.isChecked();
            user = new User_Profile(namestr,laststr,idstr,usernamestr,passwordstr,teacher);

            if (teacher) {
                Intent intent = new Intent(this,ProfileT_Activity.class);
                startActivity(intent);
            }
            else{
                Intent intent = new Intent(this,CoursesActivity.class);
                startActivity(intent);
            }
        }

    }
}