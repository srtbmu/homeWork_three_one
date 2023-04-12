package com.example.homework_three_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView SecondName,SecondAdres,SecondNumber;
    String StringName,StringdAdres,StringNumber;

    private void findViewsSecond(){
        SecondName = findViewById(R.id.second_Name);
        SecondAdres = findViewById(R.id.second_Adres);
        SecondNumber = findViewById(R.id.MainNumber);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        StringName = getIntent().getStringExtra("MainName");
        StringdAdres = getIntent().getStringExtra("MainAdres");
        StringNumber = getIntent().getStringExtra("MainNumber");
        findViewsSecond();
        SecondName.setText(StringName);
        SecondAdres.setText(StringdAdres);
        SecondNumber.setText(StringNumber);
    }
}