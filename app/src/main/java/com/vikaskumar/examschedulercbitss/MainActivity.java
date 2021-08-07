package com.vikaskumar.examschedulercbitss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    CheckBox student, instructor, scheduler;
    TextView signIn, createACCOUNT;

    float v = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        student = findViewById(R.id.check_student);
        instructor = findViewById(R.id.check_instructor);
        scheduler = findViewById(R.id.check_scheduler);

        signIn = findViewById(R.id.tv_signin);
        createACCOUNT= findViewById(R.id.tv_createAc);
    }
}