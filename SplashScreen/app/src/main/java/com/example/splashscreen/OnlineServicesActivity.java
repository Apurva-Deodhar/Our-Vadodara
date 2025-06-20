package com.example.splashscreen;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class OnlineServicesActivity extends AppCompatActivity {

    private CardView card1, card2, card3, card4, card5, card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);

        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);
        card5 = findViewById(R.id.card5);
        card6 = findViewById(R.id.card6);

        // Set click listeners for each card
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OnlineServicesActivity.this, "Water and Gas Services clicked", Toast.LENGTH_SHORT).show();
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OnlineServicesActivity.this, "Animal Pound License clicked", Toast.LENGTH_SHORT).show();
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OnlineServicesActivity.this, "Shooting Permissions clicked", Toast.LENGTH_SHORT).show();
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OnlineServicesActivity.this, "Vendor Registrations clicked", Toast.LENGTH_SHORT).show();
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OnlineServicesActivity.this, "Animal Adoption clicked", Toast.LENGTH_SHORT).show();
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OnlineServicesActivity.this, "Meat and Fish License clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

