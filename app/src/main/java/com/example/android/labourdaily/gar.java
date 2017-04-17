package com.example.android.labourdaily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class gar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gar);
    }
    public void gar1(View view) {
        Intent startNewActivity = new Intent(this, gar1.class);
        startActivity(startNewActivity);
    }
}
