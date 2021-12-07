package com.letscode.unitconverter.utils;

import java.util.Scanner;

import static com.letscode.unitconverter.utils.Printer.printEnterInchMessage;

public class Reader {

    private static Scanner unitScan = new Scanner(System.in);

    public static float getInch() {
        printEnterInchMessage();
        return unitScan.nextFloat();
    }

}
