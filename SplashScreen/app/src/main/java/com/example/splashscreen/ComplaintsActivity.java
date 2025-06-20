package com.example.splashscreen;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ComplaintsActivity extends AppCompatActivity {

    private EditText userName, userAddress, userContact, userComplaint;
    private Button submitSave;
    private FrameLayout imageSection;
    private TextView imagePlaceholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaints);

        // Initialize views
        userName = findViewById(R.id.userName);
        userAddress = findViewById(R.id.userAddress);
        userContact = findViewById(R.id.userContact);
        userComplaint = findViewById(R.id.userComplaint);
        submitSave = findViewById(R.id.btnSubmit);
        imageSection = findViewById(R.id.imageSection);
        imagePlaceholder = new TextView(this);
        imagePlaceholder.setText("No Image Added");
        imagePlaceholder.setGravity(View.TEXT_ALIGNMENT_CENTER);

        // Add placeholder text to image section dynamically
        imageSection.addView(imagePlaceholder);

        // Submit button logic
        submitSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = userName.getText().toString();
                String address = userAddress.getText().toString();
                String contact = userContact.getText().toString();
                String complaint = userComplaint.getText().toString();

                // Basic validation for fields
                if (name.isEmpty()) {
                    Toast.makeText(ComplaintsActivity.this, "Please fill the Name field", Toast.LENGTH_SHORT).show();
                } else if (address.isEmpty()) {
                    Toast.makeText(ComplaintsActivity.this, "Please fill the Address field", Toast.LENGTH_SHORT).show();
                } else if (contact.isEmpty()) {
                    Toast.makeText(ComplaintsActivity.this, "Please fill the Contact field", Toast.LENGTH_SHORT).show();
                } else if (complaint.isEmpty()) {
                    Toast.makeText(ComplaintsActivity.this, "Please fill the Complaint field", Toast.LENGTH_SHORT).show();
                } else {
                    // Form submission success
                    Toast.makeText(ComplaintsActivity.this, "Complaint Submitted Successfully", Toast.LENGTH_LONG).show();
                    // Reset fields after submission
                    userName.setText("");
                    userAddress.setText("");
                    userContact.setText("");
                    userComplaint.setText("");
                }
            }
        });
    }
}