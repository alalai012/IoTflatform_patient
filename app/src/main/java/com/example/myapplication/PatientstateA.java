package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PatientstateA extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientstate_a);

        TextView heart_value = (TextView)findViewById(R.id.heart_value);
        TextView heart_state = (TextView)findViewById(R.id.heart_state);
        TextView oxygen_value = (TextView)findViewById(R.id.oxygen_value);
        TextView oxygen_state = (TextView)findViewById(R.id.oxygen_state);
    }
}