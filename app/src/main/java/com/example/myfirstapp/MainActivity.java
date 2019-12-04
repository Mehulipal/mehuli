package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText Name;
    EditText Year;
    EditText Month;
    EditText Day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.et1);
        Year = (EditText) findViewById(R.id.et2);
        Month = (EditText) findViewById(R.id.et3);
        Day = (EditText) findViewById(R.id.et4);
    }

    public void click(View v) {
        String n = Name.getText().toString();
        int year = Integer.parseInt(Year.getText().toString());
        int month = Integer.parseInt(Month.getText().toString());
        int day = Integer.parseInt(Day.getText().toString());
        LocalDate l = LocalDate.of(year, month, day); //specify year, month, date directly
        LocalDate now = LocalDate.now(); //gets localDate
        Period diff = Period.between(l, now); //difference between the dates is calculated
        String m = diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days";
        Toast.makeText(this, m, Toast.LENGTH_SHORT).show();
        if (diff.getMonths() == 0 && diff.getDays() == 0) {
            Intent i = new Intent(this, MainActivity2.class);
            i.putExtra("name", n);
            startActivity(i);
        } else {
            Intent in = new Intent(this, MainActivity3.class);
            in.putExtra("age", m);
            startActivity(in);
        }
    }
}
