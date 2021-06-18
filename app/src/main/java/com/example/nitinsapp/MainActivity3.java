package com.example.nitinsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Color;
import android.os.Vibrator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    double speed;
    double checkin;
    TextView answers;
    TextView out;
    ConstraintLayout r = findViewById(R.id.act3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        EditText input = findViewById(R.id.inputsp);
        EditText check=findViewById(R.id.inputlf);
        Button calculate = findViewById(R.id.check1);
        Button reset= findViewById(R.id.reset1);
        answers = findViewById(R.id.answer);
        out= findViewById(R.id.output);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputSpeed = input.getText().toString();
                String inputcheck = check.getText().toString();
                speed = Double.parseDouble(inputSpeed);
                checkin = Double.parseDouble(inputcheck);
                lorentzf(speed,checkin);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                input.setText(null);
                check.setText(null);
                answers.setText(null);
                out.setText(null);
                r.setBackgroundColor(Color.CYAN);
            }
        });
    }
    void lorentzf (double speed,double checkin){
        double factor;
        String INV="INCORRECT ANSWER";
        String ca="CORRECT ANSWER";
        String CR="THE CORRECT ANSWER IS";
        double c=3*Math.pow(10,8);
        if (speed>=c){
            Toast.makeText(getBaseContext(),"INPUT IS INVALID",Toast.LENGTH_LONG).show();
        }
        else{
            factor= 1/Math.sqrt(1-Math.pow(speed/c,2));
            if(checkin!=factor){
                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                answers.setText(String.valueOf(INV));
                System.out.println(CR+" "+factor);
                v.vibrate(1000);
                r.setBackgroundColor(Color.RED);
            }
            else{
                answers.setText(String.valueOf(ca));
                r.setBackgroundColor(Color.GREEN);
            }

            }
    }
}