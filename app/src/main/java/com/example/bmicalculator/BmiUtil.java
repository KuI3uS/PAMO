package com.example.bmicalculator;

public class BmiUtil {
    public static float calculateBmi(float weightKg, float heightCm) {
        float heightM = heightCm / 100f; // f oznacza że to jest liczba zmiennoprzecinkowa
        return weightKg / (heightM * heightM);
    }
}