package com.example.bmicalculator;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RecipeActivity extends AppCompatActivity {


    TextView recipeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        recipeText = findViewById(R.id.recipeText);

        double calories = getIntent().getDoubleExtra("calories", 0);

        String result;

        if (calories < 2000) {
            result = "Przepis 1 – Lekki lunch:\n" +
                    "• Sałatka z kurczakiem i awokado\n" +
                    "• Jogurt naturalny\n" +
                    "• Woda z cytryną\n\n" +
                    "Kalorie: ~1800 kcal";
        } else if (calories < 2500) {
            result = "Przepis 2 – Standardowy obiad:\n" +
                    "Ryż z warzywami i łososiem\n" +
                    "Zupa krem z dyni\n" +
                    "Kompot owocowy\n\n" +
                    "Kalorie: ~2300 kcal";
        } else {
            result = " Przepis 3 – Energetyczne danie:\n" +
                    "Makaron z pesto i kurczakiem\n" +
                    "Kremowa zupa ziemniaczana\n" +
                    "Smoothie bananowe z masłem orzechowym\n\n" +
                    "Kalorie: ~2700 kcal";
        }

        recipeText.setText(result);
    }
}