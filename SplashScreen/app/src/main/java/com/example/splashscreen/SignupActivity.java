package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up); // Correct layout for signup

        // Initialize views
        signupButton = findViewById(R.id.signup_button);

        // Handle signup button click
        signupButton.setOnClickListener(view -> {
            // You can add any validations here if needed
            Intent intent = new Intent(SignupActivity.this, HomePageActivity.class);
            startActivity(intent);
            finish(); // Close the current activity (SignupActivity)
        });
    }
}
