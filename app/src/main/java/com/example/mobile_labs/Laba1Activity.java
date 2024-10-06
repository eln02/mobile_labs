package com.example.mobile_labs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Laba1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laba1);
        // Инициализация Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Установка заголовка
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Лаба 1");
        }

        // Найти ImageView по id
        ImageView imageView = findViewById(R.id.my_image_view);

        // Установить обработчик клика
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на новую активность (ImageActivity)
                Intent intent = new Intent(Laba1Activity.this, ImageActivity.class);
                startActivity(intent);
            }
        });
    }
}
