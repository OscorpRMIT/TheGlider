package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Calendar;

public class Activity2 extends AppCompatActivity {

    CalendarView calendarView;
    TextView myDate;
    private Button NotesButton;
    private Button WeatherButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        calendarView = (CalendarView) findViewById(R.id.calendarView);
        myDate = (TextView) findViewById(R.id.myDate);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                String date = i2 + "/" + (i1 + 1) + "/" + i;
                myDate.setText(date);
            }
        });

        WeatherButton = (Button) findViewById(R.id.WeatherButton);
        WeatherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWeatherActivity();
            }
        });

        NotesButton = (Button) findViewById(R.id.NotesButton);
        NotesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNotesActivity();
            }
        });

    }

    public void openWeatherActivity(){
        Intent WeatherActivity = new Intent(this, WeatherScreen.class);
        startActivity(WeatherActivity);
    }

    public void openNotesActivity(){
        Intent NotesActivity = new Intent(this, NavScreen.class);
        startActivity(NotesActivity);
    }

      /*  Calendar cal = Calendar.getInstance();
        Intent intent = new Intent(Intent.ACTION_EDIT);
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra("beginTime", cal.getTimeInMillis());
        intent.putExtra("allDay", true);
        intent.putExtra("rrule", "FREQ=YEARLY");
        intent.putExtra("endTime", cal.getTimeInMillis()+60*60*1000);
        intent.putExtra("title", "A Test Event from android app");
        startActivity(intent);
          */
    }
