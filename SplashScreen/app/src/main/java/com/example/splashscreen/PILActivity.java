package com.example.splashscreen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PILActivity extends AppCompatActivity {

    private EditText etPilTitle, etPilDescription, etContactDetails;
    private Button btnUpload, btnSubmitPil;
    private TextView tvSignatures;
    private ProgressBar progressBarSignatures;

    private int currentSignatures = 0; // Initialize with 0 (can be updated dynamically)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pil_submission);

        // Initialize UI components
        etPilTitle = findViewById(R.id.etPilTitle);
        etPilDescription = findViewById(R.id.etPilDescription);
        etContactDetails = findViewById(R.id.etContactDetails);
        btnUpload = findViewById(R.id.btnUpload);
        btnSubmitPil = findViewById(R.id.btnSubmitPil);
        tvSignatures = findViewById(R.id.tvSignatures);
        progressBarSignatures = findViewById(R.id.progressBarSignatures);

        // Set initial signature count
        updateSignatureProgress();

        // Upload Button Click Listener
        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle file upload logic here
                Toast.makeText(PILActivity.this, "File upload feature not implemented yet", Toast.LENGTH_SHORT).show();
            }
        });

        // Submit Button Click Listener
        btnSubmitPil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitPIL();
            }
        });
    }

    private void submitPIL() {
        String title = etPilTitle.getText().toString().trim();
        String description = etPilDescription.getText().toString().trim();
        String contact = etContactDetails.getText().toString().trim();

        if (title.isEmpty() || description.isEmpty() || contact.isEmpty()) {
            Toast.makeText(this, "Please fill in all required fields", Toast.LENGTH_SHORT).show();
        } else if (currentSignatures < 100) {
            Toast.makeText(this, "At least 100 e-signatures are required to submit a PIL.", Toast.LENGTH_LONG).show();
        } else {
            // Logic to handle PIL submission (e.g., save locally or prepare for backend integration)
            Toast.makeText(this, "PIL Submitted Successfully!", Toast.LENGTH_LONG).show();
        }
    }

    private void updateSignatureProgress() {
        // Update the text and progress bar
        tvSignatures.setText("E-signatures Collected: " + currentSignatures + "/100");
        progressBarSignatures.setProgress(currentSignatures);

        // Simulate adding signatures (for demo purposes)
        simulateAddingSignatures();
    }

    private void simulateAddingSignatures() {
        // Increment signatures (for UI testing/demo only)
        progressBarSignatures.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (currentSignatures < 100) {
                    currentSignatures += 10; // Increment by 10
                    updateSignatureProgress(); // Recursively update UI
                }
            }
        }, 2000); // Delay of 2 seconds for each update
    }
}