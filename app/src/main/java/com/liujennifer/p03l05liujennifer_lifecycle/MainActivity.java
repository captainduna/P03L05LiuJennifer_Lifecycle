package com.liujennifer.p03l05liujennifer_lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    String TAG = "com.liujennifer.p3l03liujennifer_sharedpreferences";
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    ConstraintLayout layout;
    int countonCreate = 0;
    int countonStart = 0;
    int countonResume = 0;
    int countonPause = 0;
    int countonStop = 0;
    int countonRestart = 0;
    int countonDestroy = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences(TAG, MODE_PRIVATE);
        editor = sharedPreferences.edit();
        setInitialValues();
        countonCreate++;
        storevalue();
        onPause();

    }

    private void setInitialValues() {
        countonCreate = sharedPreferences.getInt("onCreate", 0);
        countonStart = sharedPreferences.getInt("onStart", 0);
        countonResume = sharedPreferences.getInt("onResume", 0);
        countonPause = sharedPreferences.getInt("onPause", 0);
        countonStop = sharedPreferences.getInt("onStop", 0);
        countonRestart = sharedPreferences.getInt("onRestart", 0);
        countonDestroy = sharedPreferences.getInt("onDestroy", 0);
    }

    private void storevalue() {
        editor.putInt("onCreate", countonCreate);
        editor.putInt("onStart", countonStart);
        editor.putInt("onResume", countonResume);
        editor.putInt("onPause", countonPause);
        editor.putInt("onStop", countonStop);
        editor.putInt("onRestart", countonRestart);
        editor.putInt("onDestroy", countonDestroy);
        editor.apply();
        System.out.println("onCreate:" +countonCreate);
        System.out.println("onStart:" +countonStart);
        System.out.println("onResume:" +countonResume);
        System.out.println("onPause:" +countonPause);
        System.out.println("onStop:" +countonStop);
        System.out.println("onRestart:" +countonRestart);
        System.out.println("onDestroy:" +countonDestroy);
        System.out.println("---------------------------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        countonStart++;
        storevalue();
    }

    @Override
    protected void onResume() {
        super.onResume();
        countonResume++;
        storevalue();
    }

    @Override
    protected void onPause() {
        super.onPause();
        countonPause++;
        storevalue();
    }

    @Override
    protected void onStop() {
        super.onStop();
        countonStop++;
        storevalue();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        countonRestart++;
        storevalue();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        countonDestroy++;
        storevalue();
    }
}