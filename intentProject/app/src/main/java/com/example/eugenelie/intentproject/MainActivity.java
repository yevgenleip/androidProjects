package com.example.eugenelie.intentproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.btn1);
    }


    public void onOpen(View view){
        Intent intentSecond = new Intent(this, secondActivity.class);
        startActivity(intentSecond);

    }

    public void onOpen1(View view){
        Intent myIntent = new Intent();
        myIntent.setAction(Intent.ACTION_VIEW);
        myIntent.setData(Uri.parse("http://www.google.com"));
        startActivity(myIntent);
    }
}
