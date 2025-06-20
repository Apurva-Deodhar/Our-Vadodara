package com.example.splashscreen;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.splashscreen.databinding.CarouselItemBinding;

import java.util.List;

public class CarouselAdapter extends RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder> {

    private final List<Integer> imageList;

    public CarouselAdapter(List<Integer> imageList) {
        this.imageList = imageList;
    }

    static class CarouselViewHolder extends RecyclerView.ViewHolder {
        private final CarouselItemBinding binding;

        public CarouselViewHolder(CarouselItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(int imageResId) {
            binding.imageView.setImageResource(imageResId);
        }
    }

    @NonNull
    @Override
    public CarouselViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CarouselItemBinding binding = CarouselItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CarouselViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CarouselViewHolder holder, int position) {
        holder.bind(imageList.get(position));
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }
}

