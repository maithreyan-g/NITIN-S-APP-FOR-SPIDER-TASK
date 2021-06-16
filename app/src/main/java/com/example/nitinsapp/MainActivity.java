package com.example.nitinsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 =findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity2();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity3();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity4();
            }
        });

    }
    public void openactivity2()
    {
        Intent intent2=new Intent(this,MainActivity2.class);
        startActivity(intent2);
    }
    public void openactivity3()
    {
        Intent intent3=new Intent(this,MainActivity3.class);
        startActivity(intent3);
    }
    public void openactivity4()
    {
        Intent intent4=new Intent(this,MainActivity4.class);
        startActivity(intent4);
    }
}