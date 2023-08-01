package com.example.cs50finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class NutritionActivity extends AppCompatActivity {

    int BMR;

    EditText heightInput;
    EditText weightInput;
    EditText ageInput;

    int height;
    int weight;
    int age;

    TextView calories;

    Button calculateButton;
    Button recipesButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Nutrition");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        heightInput = findViewById(R.id.editTextNumber);
        weightInput = findViewById(R.id.editTextNumber2);
        ageInput = findViewById(R.id.editTextNumber3);

        calories = findViewById(R.id.textView12);

        calculateButton = findViewById(R.id.button9);

        calculateButton.setOnClickListener(view -> {
            if (TextUtils.isEmpty(heightInput.getText())) {
                heightInput.setError("Height is required!");
            } else {
                height = Integer.parseInt(heightInput.getText().toString());
            }
            if (TextUtils.isEmpty(weightInput.getText())) {
                weightInput.setError("Weight is required!");
            } else {
                weight = Integer.parseInt(weightInput.getText().toString());
            }
            if (TextUtils.isEmpty(ageInput.getText())) {
                ageInput.setError("Age is required!");
            } else {
                age = Integer.parseInt(ageInput.getText().toString());
            }
            BMR = (int) (66.5 + (13.75 * weight) + (5.003 * height) - (6.75 * age));
            calories.setText(BMR + " Calories");
        });

        recipesButton = findViewById(R.id.button8);

        recipesButton.setOnClickListener(view -> {
            String url = "https://www.myprotein.com/thezone/recipe/meal-prep-recipes-muscle-building-fat-loss/";

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });
    }
}