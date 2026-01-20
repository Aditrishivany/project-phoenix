package com.healthtech.dosage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DosageCalculatorTest {

    @Test
    public void testCorrectDose() {
        DosageCalculator dc = new DosageCalculator();
        assertEquals(50, dc.calculateDose(5));
    }
}
