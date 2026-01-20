package com.healthtech.dosage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testDosageCalculation() {
        DosageCalculator calculator = new DosageCalculator();
        int result = calculator.calculateDosage(5);
        assertEquals(50, result);
    }
}
