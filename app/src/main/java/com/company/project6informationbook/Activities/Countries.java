package com.company.project6informationbook.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.company.project6informationbook.Adapter.ViewPagerAdapter;
import com.company.project6informationbook.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Countries extends AppCompatActivity {

    TabLayout tabLayoutCountries;

    ViewPager2 viewPagerCountries;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countres);

        tabLayoutCountries = findViewById(R.id.tabLayoutCountries);
        viewPagerCountries = findViewById(R.id.viewPagerCountries);


        ViewPagerAdapter adaptercountries = new ViewPagerAdapter(getSupportFragmentManager(), getLifecycle());
        viewPagerCountries.setAdapter(adaptercountries);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutCountries, viewPagerCountries, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position){
                    case 0:
                        tab.setText("India");
                        break;
                    case 1:
                        tab.setText("Russia");
                        break;
                    case 2:
                    tab.setText("Italy");
                    break;

                }
            }

        });tabLayoutMediator.attach();
    }


}