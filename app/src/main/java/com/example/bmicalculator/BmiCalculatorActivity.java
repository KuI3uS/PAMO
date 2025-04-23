package com.example.bmicalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class BmiCalculatorActivity extends AppCompatActivity {

    EditText weightInput, heightInput;
    Button calculateButton;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);

        weightInput = findViewById(R.id.weightInput);
        heightInput = findViewById(R.id.heightInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultText = findViewById(R.id.resultText);

        calculateButton.setOnClickListener(v -> {
            String weightStr = weightInput.getText().toString();
            String heightStr = heightInput.getText().toString();

            if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
                float weight = Float.parseFloat(weightStr);
                float height = Float.parseFloat(heightStr) / 100;

                float bmi = weight / (height * height);
                String status;

                if (bmi < 18.5)
                    status = "Niedowaga";
                else if (bmi < 25)
                    status = "Optimum";
                else if (bmi < 30)
                    status = "Nadwaga";
                else
                    status = "Otyłość";

                resultText.setText(String.format("BMI: %.2f\nStatus: %s", bmi, status));
            } else {
                resultText.setText("Wprowadź masę i wzrost.");
            }
        });
    }
}