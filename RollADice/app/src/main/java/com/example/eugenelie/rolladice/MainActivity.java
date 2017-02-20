package com.example.eugenelie.rolladice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button but1;
    private Button but2;
    private Button but3;
    private Button btnWinner;
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private String name1;
    private String name2;
    private String name3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.etpl1);
        but1 = (Button) findViewById(R.id.bpl1);
        tv1 = (TextView) findViewById(R.id.tvpl1);
        et2 = (EditText) findViewById(R.id.etpl2);
        but2 = (Button) findViewById(R.id.bpl2);
        tv2 = (TextView) findViewById(R.id.tvpl2);
        et3 = (EditText) findViewById(R.id.etpl3);
        but3 = (Button) findViewById(R.id.bpl3);
        tv3 = (TextView) findViewById(R.id.tvpl3);
        btnWinner = (Button) findViewById(R.id.winner);

        but1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                name1 = et1.getText().toString();
                tv1.setText(String.valueOf(rollDice.rollADice()));
            }
        });
        but2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                name2 = et2.getText().toString();
                tv2.setText(String.valueOf(rollDice.rollADice()));
            }
        });
        but3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                name3 = et3.getText().toString();
                tv3.setText(String.valueOf(rollDice.rollADice()));
            }
        });

        btnWinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv1 != null && tv2 != null && tv3 != null){
                    final int n1 =Integer.parseInt(tv1.getText().toString());
                    final int n2 =Integer.parseInt(tv2.getText().toString());
                    final int n3 =Integer.parseInt(tv3.getText().toString());

                    if(n1 >= n2 && n1 >= n3)
                        btnWinner.setText("Winner is Player 1 " + name1);
                    else if(n2 >= n1 && n2 >= n3)
                        btnWinner.setText("Winner is Player 2 " + name2);
                    else
                        btnWinner.setText("Winner is Player 3 " + name3);

                }
            }
        });

    }
}

class rollDice {
    public static int rollADice(){
        int dice=(int)(Math.random()*6+1);
        return dice;
    }
}
