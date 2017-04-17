package com.example.android.labourdaily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class elec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elec);
    }
    public void elec1(View view) {
        Intent startNewActivity = new Intent(this, elect1.class);
        startActivity(startNewActivity);
    }
}
