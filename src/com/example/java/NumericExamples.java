package com.example.java;

import java.math.BigDecimal;

class NumericExamples {

    static void showExamples() {
        System.out.println("Hello from IDEA!");
        String aString = "Ronizzle";
        System.out.println("Hello " + aString);

        byte b = 5;
        int i = 5;
        double d = 5d;
        float f = 5f;
        System.out.println(b);
        System.out.println(i);
        System.out.println(d);
        System.out.println(f);

        b = 127;
        System.out.println(b);
        b++;
        System.out.println(b);
        b = 127;
        System.out.println(b);

        if (b < Byte.MAX_VALUE) {
            b++;
        }

        System.out.println(b);

        double value = 0.12;
        double pSum = value + value + value;
        System.out.println(pSum);

        String strValue = Double.toString(value);
        System.out.println(strValue);
        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println(bSum);

        int intVal1 = 1;
        int intVal2 = 2;
        int intVal3 = intVal1 + intVal2;
        System.out.println(intVal3);

        float floatVal1 = Math.round(3.6);
        System.out.println(floatVal1);
    }
}
