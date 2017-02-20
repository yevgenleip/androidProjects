package com.example.eugenelie.gesturesproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    private TextView tv;
    private Button btn;
    private String eventStr;
    private GestureDetector detector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        btn = (Button) findViewById(R.id.btn);
        detector = new GestureDetector(this, this);
    }

    public void onClear(View view){
        tv.setText("");
    }
    public boolean onTouchEvent(MotionEvent event){
        return detector.onTouchEvent(event);
    }
    @Override
    public boolean onDown(MotionEvent e) {
        eventStr = String.format("onDown: (%f,%f)\n", e.getX(), e.getY());
        tv.setText(tv.getText()+eventStr);
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        eventStr = String.format("onShowPress: (%f,%f)\n", e.getX(), e.getY());
        tv.setText(tv.getText()+eventStr);
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        eventStr = String.format("onSingleTapUp: (%f,%f)\n", e.getX(), e.getY());
        tv.setText(tv.getText()+eventStr);
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        eventStr = String.format("onScroll: (%f,%f), (%f, %f)\n\tdX=%f, dY=%f\t",
                e1.getX(), e1.getY(),e2.getX(),e2.getY(), distanceX, distanceY);
        tv.setText(tv.getText()+eventStr);
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        eventStr = String.format("onLongPress: (%f,%f)\n", e.getX(), e.getY());
        tv.setText(tv.getText()+eventStr);

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        eventStr = String.format("onFling: (%f,%f), (%f, %f)\n\tdX=%f, dY=%f\t",
                e1.getX(), e1.getY(),e2.getX(),e2.getY(),velocityX,velocityY);
        tv.setText(tv.getText()+eventStr);
        return true;
    }
}
