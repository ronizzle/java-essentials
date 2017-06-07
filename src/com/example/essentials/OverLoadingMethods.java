package com.example.essentials;

import java.util.Scanner;

class OverLoadingMethods {
    static void showExamples() {
        String s1 = getInput("Enter 1st value: ");
        String s2 = getInput("Enter 2nd value: ");


        double result1 = addValues(s1, s2);
        System.out.println(result1);
        double result2 = addValues(s1, s2, result1);
        System.out.println(result2);
        double result3 = addValues(s2, s2, s2, s2, s2, s2);
        System.out.println(result3);
    }

    static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;
        return result;
    }
    static double addValues(String s1, String s2, double d3) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2 + d3;
        return result;
    }

    static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static double addValues(String ... values) {
        double result = 0;

        for(String value: values) {
            result += Double.parseDouble(value);

        }

        return result;
    }
}
