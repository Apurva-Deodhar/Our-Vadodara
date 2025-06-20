package com.example.splashscreen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        Button openTwitterButton = findViewById(R.id.openTwitterButton);
        openTwitterButton.setOnClickListener(v -> {
            String twitterUrl = "https://x.com/ourvadodara?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor";
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(twitterUrl)));
        });
    }
}
