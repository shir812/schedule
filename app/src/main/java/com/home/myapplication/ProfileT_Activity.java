package com.home.myapplication;

import android.app.Dialog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class ProfileT_Activity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout linearLayout;
    //dialog
    private Dialog d;
    private EditText new_sub;
    private Button create;
    private SharedPreferences sp;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_t_);
        linearLayout= findViewById(R.id.line1);
        sp=getSharedPreferences("details", 0);
        counter = sp.getInt("countId",0);

    }
    // showing the menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_teacher,menu);
        return true;}

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        int id=item.getItemId();
        if(id == R.id.new_1){
            Button b=new Button(this);
            LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            b.setLayoutParams(layoutParams);
            b.setText("מתמטיקה");
            b.setOnClickListener(this);
            linearLayout.addView(b);
        }
        if(id == R.id.new_2){
            createNewSubDialog();


        }
        return true;
    }

    @Override
    public void onClick(View v) {
        if(v==create)
        {

            Button b=new Button(this);
            LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            b.setLayoutParams(layoutParams);
            String str =new_sub.getText().toString();
            b.setText(str);
            b.setOnClickListener(this);
            SharedPreferences.Editor editor = sp.edit();
            counter++;
            editor.putInt("counterId", counter);
            b.setId(counter);
            linearLayout.addView(b);
        }

    }


    public void createNewSubDialog(){
        d = new Dialog(this);
        d.setContentView(R.layout.activity_profile_t_);
        d.setTitle("מקצוע חדש");
        d.setCancelable(true);
        new_sub = (EditText)d.findViewById(R.id.new_sub);
        create = (Button)d.findViewById(R.id.create);
        create.setOnClickListener(this);
        d.show(); }


        }


