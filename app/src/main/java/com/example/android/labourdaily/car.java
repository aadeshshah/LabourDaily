package com.example.android.labourdaily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class car extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
    }
    public void car1(View view) {
        Intent startNewActivity = new Intent(this, car1.class);
        startActivity(startNewActivity);
    }
}
