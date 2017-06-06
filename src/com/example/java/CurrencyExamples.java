package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyExamples {

    static void showExamples() {


        Locale locale1 = new Locale("da", "DK");
        double dbl1 = 1_234_567.89d;
        NumberFormat numf1 = NumberFormat.getNumberInstance(locale1);
        NumberFormat curf1 = NumberFormat.getCurrencyInstance(locale1);
        NumberFormat intf1 = NumberFormat.getIntegerInstance(locale1);
        System.out.println("Number: " + numf1.format(dbl1));
        System.out.println("Currency: " + curf1.format(dbl1));
        System.out.println("Integer: " + intf1.format(dbl1));
    }
}
