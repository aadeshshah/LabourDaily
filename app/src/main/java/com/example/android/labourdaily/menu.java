package com.example.android.labourdaily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void plum(View view){
        Intent startNewActivity = new Intent(this,plumber.class);
        startActivity(startNewActivity);
    }
    public void elec(View view){
        Intent startNewActivity = new Intent(this,elec.class);
        startActivity(startNewActivity);
    }
    public void mech(View view){
        Intent startNewActivity = new Intent(this,mech.class);
        startActivity(startNewActivity);
    }
    public void gar(View view){
        Intent startNewActivity = new Intent(this,gar.class);
        startActivity(startNewActivity);
    }
    public void carpen(View view){
        Intent startNewActivity = new Intent(this,car.class);
        startActivity(startNewActivity);
    }
    public void lab(View view){
        Intent startNewActivity = new Intent(this,labour.class);
        startActivity(startNewActivity);
    }
}
