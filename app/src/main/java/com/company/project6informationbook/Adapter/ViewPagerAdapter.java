package com.company.project6informationbook.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.company.project6informationbook.Fragments.fragments_Russia;
import com.company.project6informationbook.Fragments.fragments_india;
import com.company.project6informationbook.Fragments.fragments_italy;

public class ViewPagerAdapter extends FragmentStateAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;

        switch (position){
            case 0:
                fragment= fragments_india.newInstance();
                break;
            case 1:
                fragment = fragments_Russia.newInstance();
                break;
            case 2:
                fragment= fragments_italy.newInstance();
                break;
            default:
                return  null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
