package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the main layout (activity_main.xml)
        setContentView(R.layout.activity_main);  // Ensure the correct layout is set here

        // Find views in the main layout for ImageView and TextView
        ImageView topImageView = findViewById(R.id.topImageView);
        TextView titleTextView = findViewById(R.id.titleTextView);

        // Create zoom animation for ImageView and TextView
        ObjectAnimator scaleXImage = ObjectAnimator.ofFloat(topImageView, "scaleX", 1f, 1.2f);
        ObjectAnimator scaleYImage = ObjectAnimator.ofFloat(topImageView, "scaleY", 1f, 1.2f);
        scaleXImage.setDuration(2500); // 2.5 seconds
        scaleYImage.setDuration(2500);

        ObjectAnimator scaleXText = ObjectAnimator.ofFloat(titleTextView, "scaleX", 1f, 1.2f);
        ObjectAnimator scaleYText = ObjectAnimator.ofFloat(titleTextView, "scaleY", 1f, 1.2f);
        scaleXText.setDuration(2500); // 2.5 seconds
        scaleYText.setDuration(2500);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(scaleXImage, scaleYImage, scaleXText, scaleYText);
        animatorSet.setStartDelay(500); // Optional: Add delay before animation starts
        animatorSet.start();

        // After animations finish, navigate to HomePageActivity or other activities
        animatorSet.addListener(new android.animation.Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(android.animation.Animator animation) {}

            @Override
            public void onAnimationEnd(android.animation.Animator animation) {
                // Navigate to HomePageActivity after animation ends
                Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
                startActivity(intent);
                finish(); // Close the current activity (MainActivity)
            }

            @Override
            public void onAnimationCancel(android.animation.Animator animation) {}

            @Override
            public void onAnimationRepeat(android.animation.Animator animation) {}
        });
    }
}
