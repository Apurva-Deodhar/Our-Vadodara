package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class TaxesPaymentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Linking buttons
        Button button1 = findViewById(R.id.button1); // Professional Tax
        Button button2 = findViewById(R.id.button2); // Vehicle Tax
        Button button3 = findViewById(R.id.button3); // Property Tax
        Button button4 = findViewById(R.id.button4); // Gas
        Button button5 = findViewById(R.id.button5); // Electricity

        // Set button click listeners
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaxesPaymentsActivity.this, ProfessionalTaxActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaxesPaymentsActivity.this, VehicleTaxActivity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaxesPaymentsActivity.this, PropertyTaxActivity.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaxesPaymentsActivity.this, GasActivity.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaxesPaymentsActivity.this, ElectricityActivity.class);
                startActivity(intent);
            }
        });
    }
}
