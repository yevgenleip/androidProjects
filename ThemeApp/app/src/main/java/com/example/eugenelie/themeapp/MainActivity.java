package com.example.eugenelie.themeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button butSecond;
    private Button butThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butSecond = (Button) findViewById(R.id.buttonSecond);
        butThird = (Button) findViewById(R.id.buttonThird);
    }

    public void onOpenSecond(View view){
        Intent intentSecond = new Intent(this, SecondActivity.class);
        startActivity(intentSecond);
    }

    public void onOpenThird(View view){
        Intent intentThird = new Intent(this, ThirdActivity.class);
        startActivity(intentThird);
    }
}
