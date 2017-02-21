package com.example.eugenelie.themeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button butQuitSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        butQuitSecond = (Button) findViewById(R.id.QuitSecond);
    }

    public void onOpenMain(View view){
        this.finish();
    }
}
