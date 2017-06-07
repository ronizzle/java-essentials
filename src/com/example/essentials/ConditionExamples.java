package com.example.essentials;


import java.util.Scanner;

class ConditionExamples {
    static void showExamples() {
        int i1 = 833;

        try {
            if(i1 >= 1 && i1 <= 3) {
                System.out.println("You're in Q1");
            } else if(i1 >= 4 && i1 <= 6) {
                System.out.println("You're in Q2");
            } else if(i1 >= 7 && i1 <= 9) {
                System.out.println("You're in Q3");
            } else if(i1 >= 10 && i1 <= 12) {
                System.out.println("You're in Q4");
            } else {
                throw new Exception("Invalid month.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Input some month number: ");
        String input1 = sc1.nextLine();
        int monthNumber1 = Integer.parseInt(input1);

        switch (monthNumber1) {
            case 1:
                System.out.println("Input is " + 1 + " so January!");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
