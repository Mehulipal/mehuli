package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView L1;
    TextView L2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b=getIntent().getExtras();
        String name2=b.getString("name");
        L1=(TextView)findViewById(R.id.tv1);
        L2=(TextView)findViewById(R.id.tv2);
        L2.setText(name2);
    }
}
