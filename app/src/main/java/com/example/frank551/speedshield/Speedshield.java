package com.example.frank551.speedshield;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Speedshield extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speedshield);
    }

    public void start_profile_activity(View view) {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }

    public void start_rewards_activity(View view) {
        Intent intent = new Intent(this, rewards.class);
        startActivity(intent);
    }


}
