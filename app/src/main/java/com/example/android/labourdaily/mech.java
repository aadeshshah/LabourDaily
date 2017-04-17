package com.example.android.labourdaily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech);
    }
    public void mech1(View view) {
        Intent startNewActivity = new Intent(this, mech1.class);
        startActivity(startNewActivity);
    }
}
