package com.example.mobile_labs;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.widget.TextView;

public class Laba2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_laba2);

        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView ageTextView = findViewById(R.id.ageTextView);
        TextView specTextView = findViewById(R.id.specTextView);

        addToTheEndTextViewValue(nameTextView, "Мишель");
        addToTheEndTextViewValue(ageTextView, "13");
        addToTheEndTextViewValue(specTextView, "Программист");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void addToTheEndTextViewValue(TextView textView, String endValue){
        String oldValue = textView.getText().toString();
        String newValue = oldValue + " " +endValue;
        textView.setText(newValue);

    }
}