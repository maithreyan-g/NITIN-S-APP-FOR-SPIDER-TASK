package com.example.nitinsapp;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView spi;
    double spifact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        spi=findViewById(R.id.spi);
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        {
            if(hour<=12){
                spifact= (double) (factorial(hour)/(Math.pow(minute,3)+second));
                spi.setText(String.valueOf(spifact));
            }

            else {
                hour = Math.abs(hour - 12);
                spifact = (double) (factorial(hour) / (Math.pow(minute, 3) + second));
                spi.setText(String.valueOf(spifact));
            }
    }

}

    public double factorial(int hour) {
        double result = 1;

        for (int factor = 2; factor <= hour; factor++) {
            result *= factor;
        }

        return result;
    }
    }
