package com.example.cs50finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Homepage");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button workouts = findViewById(R.id.button2);
        workouts.setOnClickListener(view -> {
            Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
            startActivity(intent);
        });

        Button nutrition = findViewById(R.id.button3);
        nutrition.setOnClickListener(view -> {
            Intent intent = new Intent(SecondActivity.this,NutritionActivity.class);
            startActivity(intent);
        });

        Button about = findViewById(R.id.button4);
        about.setOnClickListener(view -> {
            Intent intent = new Intent(SecondActivity.this,AboutActivity.class);
            startActivity(intent);
        });
    }
}