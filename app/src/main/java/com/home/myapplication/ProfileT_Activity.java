package com.home.myapplication;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
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
    Dialog d;
    EditText new_sub;
    Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_t_);
        linearLayout= findViewById(R.id.line1);
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
        if(id == R.id.new_sub){
            creatNewSubDialog();


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
            b.setId(Integer.parseInt(str));//??
            linearLayout.addView(b);
        }

    }


    public void creatNewSubDialog(){
        d = new Dialog(this);
        d.setContentView(R.layout.activity_profile_t_);
        d.setTitle("מקצוע חדש");
        d.setCancelable(true);
        new_sub = (EditText)d.findViewById(R.id.new_sub);
        create = (Button)d.findViewById(R.id.create);
        create.setOnClickListener(this);
        d.show(); }
}


