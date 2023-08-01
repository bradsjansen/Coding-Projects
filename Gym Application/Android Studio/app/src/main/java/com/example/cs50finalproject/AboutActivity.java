package com.example.cs50finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Objects.requireNonNull(getSupportActionBar()).setTitle("About Me");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button instaButton;

        instaButton = findViewById(R.id.button10);

        instaButton.setOnClickListener(view -> {
            String url = "https://www.tiktok.com/@brad.jansen?lang=en";

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

    }
}