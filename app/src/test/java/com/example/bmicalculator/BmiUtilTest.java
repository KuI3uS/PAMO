package com.example.bmicalculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BmiUtilTest {

    @Test
    public void testCalculateBmi() {
        float bmi = BmiUtil.calculateBmi(70, 175);
        assertEquals(22.86f, bmi, 0.1f);
    }
}