package com.example.mobile_labs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Laba3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laba3);

        Button buttonLaba3 = findViewById(R.id.button);
        buttonLaba3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Laba3Activity.this, Laba3_2Activity.class);
                startActivity(intent);
            }
        });

        Button buttonLaba3_1 = findViewById(R.id.button2);
        buttonLaba3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Laba3Activity.this, Laba3ScrollingActivity.class);
                startActivity(intent);
            }
        });
    }
}