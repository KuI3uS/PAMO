package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText weightInput, heightInput;
    private Button calculateButton;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightInput = findViewById(R.id.weightInput);
        heightInput = findViewById(R.id.heightInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultText = findViewById(R.id.resultText);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI() {
        String weightStr = weightInput.getText().toString();
        String heightStr = heightInput.getText().toString();

        if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
            float weight = Float.parseFloat(weightStr);
            float height = Float.parseFloat(heightStr) / 100;

            if (height > 0) {
                float bmi = weight / (height * height);
                String category = getBMICategory(bmi);
                resultText.setText(String.format("Twoje BMI: %.2f\nKategoria: %s", bmi, category));
            } else {
                resultText.setText("Wzrost musi być większy od 0!");
            }
        } else {
            resultText.setText("Wprowadź wagę i wzrost!");
        }
    }

    private String getBMICategory(float bmi) {
        if (bmi < 18.5) {
            return "Niedowaga";
        } else if (bmi < 24.9) {
            return "Optimum";
        } else if (bmi < 29.9) {
            return "Nadwaga";
        } else {
            return "Otyłość";
        }
    }

}