package com.eky.a10120066_sensor;

/*
 * NIM  : 10120066
 *Nama  : Eky Nugraha Heriawan
 *Kelas : IF2
 *Email : eky.10120066@mahasiswa.unikom.ac.id
 * */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.eky.a10120066_sensor.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.SYSTEM_UI_FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, ViewpagerActivity.class));
                finish();
            }
        }, 4000);
    }
}