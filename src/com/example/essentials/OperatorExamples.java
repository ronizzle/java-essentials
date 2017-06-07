package com.example.essentials;

public class OperatorExamples {

    static void showExamples() {
        String s1 = "Some text";
        String s2 = "some text";
        String s3 = (1 == 1) ? "hello" : "there";
        System.out.println(s1.equalsIgnoreCase(s2) + " equal ignoring case.");
        System.out.println(s1.equals(s2) + " not equal when case-sensitive.");
        System.out.println(("hello" instanceof String) + "instance of string testing");
        System.out.println(s3 + " from short-hand if-then");

    }
}
