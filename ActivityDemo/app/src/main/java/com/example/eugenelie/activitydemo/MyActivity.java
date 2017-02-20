package com.example.eugenelie.activitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Log.i("MyActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MyActivity", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MyActivity", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MyActivity", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MyActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MyActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MyActivity", "onDestroy");
    }
}
