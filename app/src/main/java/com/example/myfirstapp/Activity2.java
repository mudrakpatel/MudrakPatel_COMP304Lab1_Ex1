package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //Initialize textViewActivity2 and get the data passed from MainActivity
        TextView textViewActivity2 = (TextView) findViewById(R.id.textViewActivity2);
        Intent intent = getIntent();
        textViewActivity2.setText(intent.getStringExtra("intentData"));
    }
}
