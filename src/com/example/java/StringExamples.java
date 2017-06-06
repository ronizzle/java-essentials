package com.example.java;


import java.text.NumberFormat;

public class StringExamples {
    static void showExamples() {
        char[] c1 = {'a', 'b', 'c'};
        String s1 = new String(c1);
        String s2 = new String(" some some.");
        System.out.println(s1 + s2);
        char[] c2 = s1.toCharArray();

        for(char c3: c2) {
            System.out.println(c3);
        }

        int i1 = 12;
        String s3 = Integer.toString(i1);
        System.out.println(s3);

        boolean b1 = false;
        String s4 = Boolean.toString(b1);
        System.out.println(s4);

        long l1 = 10_000_000;
        NumberFormat formatter =  NumberFormat.getNumberInstance();
        String s5 = formatter.format(l1);
        System.out.println(s5);


        String s6 = "Hello";
        String s7 = "World";
        String s8 = s6 + " " + s7;
        System.out.println(s8);
        StringBuilder sb1 = new StringBuilder("String Builder - ");
        sb1.append(s6);
        sb1.append(" ");
        sb1.append(s7);
        System.out.println(sb1);
    }
}

