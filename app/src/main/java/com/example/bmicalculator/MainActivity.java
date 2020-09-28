package com.example.bmicalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        final FrameLayout frameLayout = findViewById(R.id.frame_layout);

        Fragment homeFragment = new HomeFragment();
        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, homeFragment);
        transaction.addToBackStack(null);
        transaction.commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Log.e("talentive", "nav item has been clicked");

                int id = item.getItemId();

                if (id == R.id.my_home) {
                    Log.e("tale", "home");
                    item.setChecked(true);
                    // Create new fragment and transaction
                    Fragment homeFragment = new HomeFragment();
                    final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame_layout, homeFragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                } else if (id == R.id.chart) {
                    Log.e("tale", "chart");
                    item.setChecked(true);
                    // Create new fragment and transaction
                    Fragment homeFragment = new ChartFragment();
                    final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame_layout, homeFragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                } else if (id == R.id.about) {
                    Log.e("tale", "about");
                    item.setChecked(true);
                    // Create new fragment and transaction
                    Fragment homeFragment = new AboutFragment();
                    final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame_layout, homeFragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
                return false;
            }
        });
    }
}