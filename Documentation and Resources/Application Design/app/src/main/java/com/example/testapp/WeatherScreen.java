package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeatherScreen extends AppCompatActivity {
private Button NotesButton;
private Button CalendarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_screen);

        NotesButton = (Button) findViewById(R.id.NotesButton);
        NotesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNotesActivity();
            }
        });

        CalendarButton = (Button) findViewById(R.id.CalendarButton);
        CalendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalendarActivity();
            }
        });
    }

    public void openNotesActivity(){
        Intent NotesActivity = new Intent(this, NavScreen.class);
        startActivity(NotesActivity);
    }

    public void openCalendarActivity(){
        Intent CalendarActivity = new Intent(this, Activity2.class);
        startActivity(CalendarActivity);
    }

    }