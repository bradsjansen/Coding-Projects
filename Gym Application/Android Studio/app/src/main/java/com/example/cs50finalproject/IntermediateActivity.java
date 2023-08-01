package com.example.cs50finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class IntermediateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Intermediate Workout");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}