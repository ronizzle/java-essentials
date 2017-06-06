package com.example.java;

public class ParseStringExample {

    static void showExamples() {
        String s1 = "Some string";
        int pos1 = s1.indexOf("string");
        String s2 = s1.substring(2);
        String s3 = " hello        ";

        System.out.println("Length of s1 :" + s1.length());
        System.out.println("Position of substring: " + pos1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s3.trim());
    }
}

