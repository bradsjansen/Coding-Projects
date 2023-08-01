package com.example.cs50finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class AdvancedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Advanced Workout");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}