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
    String TAG = "com.liujennifer.p03l05liujennifer_lifecycle";
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

    TextView create;
    TextView start;
    TextView resume;
    TextView pause;
    TextView stop;
    TextView restart;
    TextView destroy;

    int lifecountonCreate = 0;
    int lifecountonStart = 0;
    int lifecountonResume = 0;
    int lifecountonPause = 0;
    int lifecountonStop = 0;
    int lifecountonRestart = 0;
    int lifecountonDestroy = 0;

    TextView lifecreate;
    TextView lifestart;
    TextView liferesume;
    TextView lifepause;
    TextView lifestop;
    TextView liferestart;
    TextView lifedestroy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        create = findViewById(R.id.onCreate1);
        start = findViewById(R.id.onStart1);
        resume = findViewById(R.id.onResume1);
        pause = findViewById(R.id.onPause1);
        stop = findViewById(R.id.onStop1);
        restart = findViewById(R.id.onRestart1);
        destroy = findViewById(R.id.onDestroy1);

        lifecreate = findViewById(R.id.onCreate2);
        lifestart = findViewById(R.id.onStart2);
        liferesume = findViewById(R.id.onResume2);
        lifepause = findViewById(R.id.onPause2);
        lifestop = findViewById(R.id.onStop2);
        liferestart = findViewById(R.id.onRestart2);
        lifedestroy = findViewById(R.id.onDestroy2);

        sharedPreferences = getSharedPreferences(TAG, MODE_PRIVATE);
        editor = sharedPreferences.edit();
        setInitialValues();
        countonCreate++;
        lifecountonCreate++;
        storevalue();
    }

    private void setInitialValues() {
        create.setText("onCreate: " + countonCreate);
        start.setText("onStart: " + countonStart);
        resume.setText("onResume: " + countonResume);
        pause.setText("onPause: " + countonPause);
        stop.setText("onStop: " + countonStop);
        restart.setText("onRestart: " + countonRestart);
        destroy.setText("onDestroy: " + countonDestroy);
        lifecountonCreate = sharedPreferences.getInt("onCreate", 0);
        lifecountonStart = sharedPreferences.getInt("onStart", 0);
        lifecountonResume = sharedPreferences.getInt("onResume", 0);
        lifecountonPause = sharedPreferences.getInt("onPause", 0);
        lifecountonStop = sharedPreferences.getInt("onStop", 0);
        lifecountonRestart = sharedPreferences.getInt("onRestart", 0);
        lifecountonDestroy = sharedPreferences.getInt("onDestroy", 0);
        lifecreate.setText("onCreate: " + lifecountonCreate);
        lifestart.setText("onStart: " + lifecountonStart);
        liferesume.setText("onResume: " + lifecountonResume);
        lifepause.setText("onPause: " + lifecountonPause);
        lifestop.setText("onStop: " + lifecountonStop);
        liferestart.setText("onRestart: " + lifecountonRestart);
        lifedestroy.setText("onDestroy: " + lifecountonDestroy);

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
        create.setText("onCreate: " + countonCreate);
        start.setText("onStart: " + countonStart);
        resume.setText("onResume: " + countonResume);
        pause.setText("onPause: " + countonPause);
        stop.setText("onStop: " + countonStop);
        restart.setText("onRestart: " + countonRestart);
        destroy.setText("onDestroy: " + countonDestroy);
        lifecreate.setText("onCreate: " + lifecountonCreate);
        lifestart.setText("onStart: " + lifecountonStart);
        liferesume.setText("onResume: " + lifecountonResume);
        lifepause.setText("onPause: " + lifecountonPause);
        lifestop.setText("onStop: " + lifecountonStop);
        liferestart.setText("onRestart: " + lifecountonRestart);
        lifedestroy.setText("onDestroy: " + lifecountonDestroy);





    }

    @Override
    protected void onStart() {
        super.onStart();
        countonStart++;
        lifecountonStart++;
        storevalue();
    }

    @Override
    protected void onResume() {
        super.onResume();
        countonResume++;
        lifecountonResume++;
        storevalue();
    }

    @Override
    protected void onPause() {
        super.onPause();
        countonPause++;
        lifecountonPause++;
        storevalue();
    }

    @Override
    protected void onStop() {
        super.onStop();
        countonStop++;
        lifecountonStop++;
        storevalue();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        countonRestart++;
        lifecountonRestart++;
        storevalue();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        countonDestroy++;
        lifecountonDestroy++;
        storevalue();
    }
}