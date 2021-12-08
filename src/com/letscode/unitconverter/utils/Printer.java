package com.letscode.unitconverter.utils;

import com.letscode.unitconverter.service.Conversion;

public class Printer {

    private static String ENTER_INCH_MESSAGE = "Inches to centimeters converter =) \n" +
            "Enter inch to be converted: ";

    public static void printEnterInchMessage() {
        System.out.print(ENTER_INCH_MESSAGE);
    }

    public static void printConversionResult(float inch) {
        System.out.printf("%.2f in = %.2f cm", inch, Conversion.convertInchToCm(inch));
    }

}
