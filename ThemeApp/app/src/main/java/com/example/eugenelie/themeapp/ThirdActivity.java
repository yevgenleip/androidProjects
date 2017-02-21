package com.example.eugenelie.themeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    private Button butQuitThird;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        butQuitThird = (Button) findViewById(R.id.QuitThird);
    }

    public void onOpenMain(View view){
        this.finish();
    }
}
