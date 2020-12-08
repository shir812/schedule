package com.home.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Students_LogInActivity extends AppCompatActivity implements View.OnClickListener {
//
    private Button stu_li;
    private Button enter;
    private EditText stu_name;
    private EditText stu_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students__log_in);

        stu_li = findViewById(R.id.students);

        stu_name = findViewById(R.id.stu_name);
        stu_pass = findViewById(R.id.stu_pass);
        enter = findViewById(R.id.enterS);
        enter.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        if ( v == enter)
        {
            Intent intent = new Intent(this,ProfileSActivity.class);
            startActivity(intent);
        }

    }


}
