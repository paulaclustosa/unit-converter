package com.letscode.unitconverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner unitScan = new Scanner(System.in);
        System.out.print("From inch to cm. Enter inch to be converted: ");
        float inch = unitScan.nextFloat();

        System.out.printf("%.2f", convertInchToCm(inch));
    }

    public static float convertInchToCm(float inch) {
        final float CONVERSION_FACTOR = 2.54f;
        return inch * CONVERSION_FACTOR;
    }
}
