package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;

public class EmergencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Request a feature for no title bar (optional, only if needed)
        requestWindowFeature(1);

        // Set flags to make the layout fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // Set the status bar color to transparent
        getWindow().setStatusBarColor(Color.TRANSPARENT);

        // Set the content view
        setContentView(R.layout.activity_emergency);
    }
}

