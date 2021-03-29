package com.example.testament;

import android.os.Bundle;

import com.example.testament.presentationLayer.fragments.About;
import com.example.testament.presentationLayer.fragments.Add;
import com.example.testament.presentationLayer.fragments.Dossier;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;



public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        savedInstanceState = null;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        ActionBar ab = getSupportActionBar();
//        ab.setDisplayHomeAsUpEnabled(true);

        tabLayout = findViewById(R.id.tab_layout);
        ViewPager viewPager = findViewById(R.id.view_pager);

        Add addPatient = new Add();
        Dossier dossier = new Dossier();
        About about = new About();

        tabLayout.setupWithViewPager(viewPager);

        AdapterForTabFragments myAdapter = new AdapterForTabFragments(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(myAdapter);

        myAdapter.addFragment(addPatient, "Add");
        myAdapter.addFragment(dossier, "Dossier");
        myAdapter.addFragment(about, "About");



        Objects.requireNonNull(tabLayout.getTabAt(0)).setIcon(R.drawable.add);
        Objects.requireNonNull(tabLayout.getTabAt(1)).setIcon(R.drawable.details);
        Objects.requireNonNull(tabLayout.getTabAt(2)).setIcon(R.drawable.about);


//        BadgeDrawable badgeDrawable = Objects.requireNonNull(tabLayout.getTabAt(0)).getOrCreateBadge();
//        badgeDrawable.setVisible(true);
//        badgeDrawable.setNumber(12);
//        Objects.requireNonNull(tabLayout.getTabAt(0)).setIcon(R.drawable.add);
//        Objects.requireNonNull(tabLayout.getTabAt(1)).setIcon(R.drawable.details);
//        Objects.requireNonNull(tabLayout.getTabAt(2)).setIcon(R.drawable.about);

        BadgeDrawable badgeDrawable = Objects.requireNonNull(tabLayout.getTabAt(0)).getOrCreateBadge();
        badgeDrawable.setVisible(true);
        badgeDrawable.setNumber(12);
    }
}