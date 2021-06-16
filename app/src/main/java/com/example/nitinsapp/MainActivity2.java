package com.example.nitinsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
        double speed;
        TextView answers;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            EditText input = findViewById(R.id.input);
            Button calculate = findViewById(R.id.calc1);
            answers = findViewById(R.id.answer);
            calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String inputSpeed = input.getText().toString();
                    speed = Double.parseDouble(inputSpeed);
                    lorentzf(speed);
                }
            });
        }
        void lorentzf (double speed){
            double factor;
            String err ="TOAST";
            double c=3*Math.pow(10,8);
            if (speed>=c){
                Toast.makeText(getBaseContext(),"INPUT IS INVALID",Toast.LENGTH_LONG).show();
                }
            else{
                factor= 1/Math.sqrt(1-Math.pow(speed/c,2));
                answers.setText(String.valueOf(factor));
            }

        }}