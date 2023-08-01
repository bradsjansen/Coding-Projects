package com.example.cs50finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Workouts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button beginner = findViewById(R.id.button5);
        beginner.setOnClickListener(view -> {
            Intent intent = new Intent(ThirdActivity.this,BeginnerActivity.class);
            startActivity(intent);
        });

        Button intermediate = findViewById(R.id.button6);
        intermediate.setOnClickListener(view -> {
            Intent intent = new Intent(ThirdActivity.this,IntermediateActivity.class);
            startActivity(intent);
        });

        Button advanced = findViewById(R.id.button7);
        advanced.setOnClickListener(view -> {
            Intent intent = new Intent(ThirdActivity.this,AdvancedActivity.class);
            startActivity(intent);
        });
    }
}