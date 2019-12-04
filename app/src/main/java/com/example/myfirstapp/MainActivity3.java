package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView L3;
    TextView L4;
    TextView L5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle b1=getIntent().getExtras();
        String Age=b1.getString("age");
        L3=(TextView)findViewById(R.id.tv3);
        L4=(TextView)findViewById(R.id.tv4);
        L5 =(TextView)findViewById(R.id.tv5);
        L4.setText(Age);

    }
}
