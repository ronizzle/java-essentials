package com.example.java;

public class BoolExamples {

    static void showExamples() {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = !b1;
        boolean b4 = (11 != 12);
        String b5 = "true";
        System.out.println(b1 + " is b1");
        System.out.println(b2 + " is b2");
        System.out.println(b3 + " is b1 reversed");
        System.out.println(b4 + " is 11 != 12 ");
        System.out.println(Boolean.parseBoolean(b5) + " is b5");

    }
}

