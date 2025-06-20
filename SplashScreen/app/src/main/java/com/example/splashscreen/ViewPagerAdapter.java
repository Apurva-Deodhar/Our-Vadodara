package com.example.splashscreen;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity); // This constructor correctly calls the parent constructor
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Return different fragments based on position
        if (position == 1) {
            return new SignupTabfragment();
        }
        return new LoginTabFragment();
    }

    @Override
    public int getItemCount() {
        // Number of fragments in the ViewPager
        return 2;
    }
}
