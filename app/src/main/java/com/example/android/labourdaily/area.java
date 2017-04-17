package com.example.android.labourdaily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class area extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
    }
    public void menu(View view){
        Intent startNewActivity = new Intent(this,menu.class);
        startActivity(startNewActivity);
    }
}
