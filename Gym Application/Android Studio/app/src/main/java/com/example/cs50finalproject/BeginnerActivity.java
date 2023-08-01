package com.example.cs50finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class BeginnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Beginner Workout");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}