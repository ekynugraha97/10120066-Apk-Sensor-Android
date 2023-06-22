package com.eky.a10120066_sensor;

/*
 * NIM  : 10120066
 *Nama  : Eky Nugraha Heriawan
 *Kelas : IF2
 *Email : eky.10120066@mahasiswa.unikom.ac.id
 * */

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.eky.a10120066_sensor.R;

public class ViewpagerActivity extends AppCompatActivity {

    ViewPager viewpager;
    viewpageradapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        viewpager = findViewById(R.id.view_pager);
        viewPagerAdapter = new viewpageradapter(this);

        viewpager.setAdapter(viewPagerAdapter);
    }

    public void onClick(View view){
        Intent intent = new Intent(ViewpagerActivity.this, MainActivity.class);
        startActivity(intent);
    }
}