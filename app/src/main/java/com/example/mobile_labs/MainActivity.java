package com.example.mobile_labs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Кнопка Лаба 1
        Button buttonLaba1 = findViewById(R.id.button_laba1);
        buttonLaba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на Laba1Activity
                Intent intent = new Intent(MainActivity.this, Laba1Activity.class);
                startActivity(intent);
            }
        });

        // Кнопка Лаба 2
        Button buttonLaba2 = findViewById(R.id.button_laba2);
        buttonLaba2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на Laba2Activity
                Intent intent = new Intent(MainActivity.this, Laba2Activity.class);
                startActivity(intent);
            }
        });

        // Кнопка Лаба 3
        Button buttonLaba3 = findViewById(R.id.button_laba3);
        buttonLaba3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на Laba3Activity
                Intent intent = new Intent(MainActivity.this, Laba3Activity.class);
                startActivity(intent);
            }
        });

        Button buttonLaba4 = findViewById(R.id.button_laba4);
        buttonLaba4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на Laba3Activity
                Intent intent = new Intent(MainActivity.this, Laba4Activity.class);
                startActivity(intent);
            }
        });

        Button buttonLaba5 = findViewById(R.id.button_laba5);
        buttonLaba5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Завершить текущее Activity
                finish();
            }
        });
    }
}
