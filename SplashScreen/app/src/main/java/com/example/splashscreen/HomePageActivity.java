package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.net.Uri;


public class HomePageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Emergency Button
        Button emergencyButton = findViewById(R.id.emergency_button);
        emergencyButton.setOnClickListener(v -> {
            startActivity(new Intent(HomePageActivity.this, EmergencyActivity.class));
        });

        // Circular Icon Buttons - News, Complaints, PIL, Announcements
        ImageView newsIcon = findViewById(R.id.news_icon);
        newsIcon.setOnClickListener(v -> {
            String twitterUrl = "https://x.com/ourvadodara?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor";
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(twitterUrl)));
        });

        ImageView complaintsIcon = findViewById(R.id.complaints_icon);
        complaintsIcon.setOnClickListener(v -> {
            // Open Complaints Activity
            startActivity(new Intent(HomePageActivity.this, ComplaintsActivity.class));
        });

        ImageView pilIcon = findViewById(R.id.pil_icon);
        pilIcon.setOnClickListener(v -> {
            // Open PIL Activity
            startActivity(new Intent(HomePageActivity.this, PILActivity.class));
        });

        ImageView announcementsIcon = findViewById(R.id.announcements_icon);
        announcementsIcon.setOnClickListener(v -> {
            // Open Announcements Activity
            startActivity(new Intent(HomePageActivity.this, AnnouncementsActivity.class));
        });

        // Main Feature Cards
        CardView taxesPaymentsCard = findViewById(R.id.taxes_payments);
        taxesPaymentsCard.setOnClickListener(v -> {
            // Open Taxes & Payments Activity
            startActivity(new Intent(HomePageActivity.this, TaxesPaymentsActivity.class));
        });

        CardView complaintsCard = findViewById(R.id.complaints);
        complaintsCard.setOnClickListener(v -> {
            // Open Complaints Activity
            startActivity(new Intent(HomePageActivity.this, ComplaintsActivity.class));
        });

        CardView cityCard = findViewById(R.id.kyc);
        cityCard.setOnClickListener(v -> {
            // Open Know Your City Activity
            startActivity(new Intent(HomePageActivity.this, CityInfoActivity.class));
        });

        CardView onlineServicesCard = findViewById(R.id.online_services);
        onlineServicesCard.setOnClickListener(v -> {
            // Open Online Services Activity
            startActivity(new Intent(HomePageActivity.this, OnlineServicesActivity.class));
        });

        // Bottom Navigation Bar
        ImageView homeIcon = findViewById(R.id.home_icon);
        homeIcon.setOnClickListener(v -> {
            // Handle Home Icon Click
            Toast.makeText(HomePageActivity.this, "Home Icon Clicked", Toast.LENGTH_SHORT).show();
        });

        ImageView profileIcon = findViewById(R.id.profile_icon);
        profileIcon.setOnClickListener(v -> {
            // Open Profile Activity
            startActivity(new Intent(HomePageActivity.this, ProfileActivity.class));
        });

        ImageView settingsIcon = findViewById(R.id.settings_icon);
        settingsIcon.setOnClickListener(v -> {
            // Open Settings Activity
            startActivity(new Intent(HomePageActivity.this, SettingsActivity.class));
        });

        ImageView moreIcon = findViewById(R.id.more_icon);
        moreIcon.setOnClickListener(v -> {
            // Open More Options Activity
            startActivity(new Intent(HomePageActivity.this, MoreOptionsActivity.class));
        });
    }
}
