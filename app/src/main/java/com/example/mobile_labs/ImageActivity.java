package com.example.mobile_labs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Установка заголовка
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Лаба 1");
        }

        // Найти ImageView по id
        ImageView imageView = findViewById(R.id.my_image_view);
    }
}