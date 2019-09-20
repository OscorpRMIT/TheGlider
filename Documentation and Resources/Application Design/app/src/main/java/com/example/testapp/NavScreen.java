package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NavScreen extends AppCompatActivity {
private Button WeatherButton;
private Button CalendarButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_screen);

        CalendarButton = (Button) findViewById(R.id.CalendarButton);
        CalendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalendarActivity();
            }
        });

        WeatherButton = (Button) findViewById(R.id.WeatherButton);
        WeatherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWeatherActivity();
            }
        });

    }

        public void openCalendarActivity(){
        Intent CalendarActivity = new Intent(this, Activity2.class);
        startActivity(CalendarActivity);
    }

        public void openWeatherActivity(){
        Intent WeatherActivity = new Intent(this, WeatherScreen.class);
        startActivity(WeatherActivity);
        }
    }
