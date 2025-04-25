package com.example.bmicalculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class CalorieCalculatorActivity extends AppCompatActivity {

    EditText ageInput, weightInput, heightInput;
    RadioGroup genderGroup;
    Spinner activityLevelSpinner;
    Button calculateCaloriesButton;
    TextView calorieResultText;

    Button seeRecipesButton;

    public static double calculateCalories(float weight, float height, int age, boolean isMale, double multiplier) {
        double bmr;
        if (isMale) {
            bmr = 66.47 + (13.75 * weight) + (5.003 * height) - (6.755 * age);
        } else {
            bmr = 655.1 + (9.563 * weight) + (1.850 * height) - (4.676 * age);
        }
        return bmr * multiplier;
    }


    String[] activityLevels = {
            "Brak aktywności",
            "Lekka aktywność",
            "Średnia aktywność",
            "Duża aktywność",
            "Bardzo duża aktywność"
    };
    double[] activityMultipliers = {1.2, 1.375, 1.55, 1.725, 1.9};

    double result = 0;

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_calculator);

        ageInput = findViewById(R.id.ageInput);
        weightInput = findViewById(R.id.weightInput);
        heightInput = findViewById(R.id.heightInput);
        genderGroup = findViewById(R.id.genderGroup);
        activityLevelSpinner = findViewById(R.id.activityLevelSpinner);
        calculateCaloriesButton = findViewById(R.id.calculateCaloriesButton);
        calorieResultText = findViewById(R.id.calorieResultText);
        seeRecipesButton = findViewById(R.id.seeRecipesButton);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, activityLevels);
        activityLevelSpinner.setAdapter(adapter);


        calculateCaloriesButton.setOnClickListener(v -> {
            String ageStr = ageInput.getText().toString();
            String weightStr = weightInput.getText().toString();
            String heighStr = weightInput.getText().toString();

            if (ageStr.isEmpty() || weightStr.isEmpty() || heighStr.isEmpty() || genderGroup.getCheckedRadioButtonId()==-1){
                calorieResultText.setText("Uzupełni dane");
                return;
            }


            int age = Integer.parseInt(ageStr);
            float weight = Float.parseFloat(weightStr);
            float height = Float.parseFloat(heighStr);
            boolean isMale = genderGroup.getCheckedRadioButtonId() == R.id.radioMale;

            double bmr;
            if (isMale){
                bmr = 66.47 + (13.75 * weight) + (5.003 * height) - (6.755 * age);
            } else {
                bmr = 655.1 + (9.563 * weight) + (1.850 * height) - (4.676 * age);
            }
            int selectedIndex = activityLevelSpinner.getSelectedItemPosition();
            double multiplier = activityMultipliers[selectedIndex];

            result = bmr * multiplier;

            calorieResultText.setText(String.format("Twoje dzienne zapotrzebowanie: %.0f kcal", result));


        });
        seeRecipesButton.setOnClickListener(v -> {
            Intent intent = new Intent(CalorieCalculatorActivity.this, RecipeActivity.class);
            intent.putExtra("calories", result);
            startActivity(intent);
        });
    }
}