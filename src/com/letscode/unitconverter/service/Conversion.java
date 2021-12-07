package com.letscode.unitconverter.service;

public class Conversion {

    private static float CONVERSION_FACTOR = 2.54f;

    public static float convertInchToCm(float inch) {
        return inch * CONVERSION_FACTOR;
    }
}
