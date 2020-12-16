package com.home.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Teachers_LoginActivity<Private> extends AppCompatActivity implements View.OnClickListener {
// setting buttons
    private Button tch_li;
    private EditText tch_name;
    private EditText tch_pass;
    private Button enter;

//moving to the different screens
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers__login);

        tch_li = findViewById(R.id.teachers);

        tch_name = findViewById(R.id.tch_name);
        tch_pass = findViewById(R.id.tch_pass);
        enter = findViewById(R.id.enterT);
        enter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            if ( view == enter)
            {
                Intent intent = new Intent(this,ProfileT_Activity.class);
                startActivity(intent);
            }

        }
}