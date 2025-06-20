package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Correct layout for login

        // Initialize views
        loginButton = findViewById(R.id.login_button);

        // Handle login button click
        loginButton.setOnClickListener(view -> {
            // You can add any validations here if needed
            Intent intent = new Intent(LoginActivity.this, HomePageActivity.class);
            startActivity(intent);
            finish(); // Close the current activity (LoginActivity)
        });
    }
}
