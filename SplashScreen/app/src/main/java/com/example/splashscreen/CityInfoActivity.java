package com.example.splashscreen;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.CarouselSnapHelper;

import java.util.ArrayList;
import java.util.List;

public class CityInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carousel);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Set up the carousel layout manager
        recyclerView.setLayoutManager(new CarouselLayoutManager());

        // Snap to center
        CarouselSnapHelper snapHelper = new CarouselSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);

        // Prepare data
        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.lvp); // Replace with your drawable resources
        imageList.add(R.drawable.nuv);
        imageList.add(R.drawable.phlos_fox4);
        imageList.add(R.drawable.sayajibaug);
        imageList.add(R.drawable.tambekarwada);

        // Set adapter
        CarouselAdapter adapter = new CarouselAdapter(imageList);
        recyclerView.setAdapter(adapter);
    }
}
