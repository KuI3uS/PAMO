package com.example.bmicalculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalorieCalculatorActivityTest {

    @Test
    public void testCalculateCaloriesForMale() {
        double result = CalorieCalculatorActivity.calculateCalories(70, 175, 25, true, 1.55);

        //1735.62 * 1.55 = 2690.21
        assertEquals(2690, result, 1); // tolerancja 1 kcal
    }

    @Test
    public void testCalculateCaloriesForFemale() {
        double result = CalorieCalculatorActivity.calculateCalories(60, 165, 30, false, 1.375);
        //1393.85 * 1.375 = 1916.54
        assertEquals(1916, result, 100); // tolerancja 1 kcal
    }
}