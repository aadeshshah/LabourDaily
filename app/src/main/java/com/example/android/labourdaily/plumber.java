package com.example.android.labourdaily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class plumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plumber);
    }
    public void plum1(View view) {
        Intent startNewActivity = new Intent(this, plum1.class);
        startActivity(startNewActivity);
    }
}
