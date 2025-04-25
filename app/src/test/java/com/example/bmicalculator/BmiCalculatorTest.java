package com.example.bmicalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BmiCalculatorTest {

    // Logika BMI
    public float calculateBmi(float weight, float heightCm) {
        float heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    // Test BMI
    @Test
    public void testCalculateBmi() {
        float bmi = calculateBmi(70, 175);
        assertEquals(22.86f, bmi, 0.1f);
    }
}