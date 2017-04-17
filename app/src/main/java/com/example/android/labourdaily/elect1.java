package com.example.android.labourdaily;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class elect1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elect1);
    }
    public void call1(View view) {
        Intent startNewActivity = new Intent(getIntent().ACTION_DIAL);
        startNewActivity.setData(Uri.parse("tel:+91999999999"));
        startActivity(startNewActivity);
    }
    public void lo1(View view) {
        Intent startNewActivity = new Intent(getIntent().ACTION_VIEW, Uri.parse("google.navigation:q=Navrachana+University+Vadodara"));
        startActivity(startNewActivity);
    }
}
