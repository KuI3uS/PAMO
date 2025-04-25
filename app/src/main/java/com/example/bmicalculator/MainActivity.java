package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    Button btnBmi, btnCalories, btnRecipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBmi = findViewById(R.id.btnBmi);
        btnCalories = findViewById(R.id.btnCalories);
        btnRecipes = findViewById(R.id.btnRecipes);

        btnBmi.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, BmiCalculatorActivity.class)));
        btnCalories.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CalorieCalculatorActivity.class)));
        btnRecipes.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, RecipeActivity.class)));
    }

}