package com.example.essentials;

import java.util.Scanner;

class LineReaderExample {

    static void showExamples() {


        StringBuilder sb1 = new StringBuilder("String Builder - ");
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter value: ");
        String input1 = scanner1.nextLine();
        System.out.println("the value you entered is " + input1);

        sb1.delete(0,sb1.length());

        for(int i2 = 0; i2 < 3; i2++) {
            System.out.print("Enter value " + (i2 + 1) + ": ");
            input1 = scanner1.nextLine();
            sb1.append(input1 + "\n");
        }

        System.out.println(sb1.toString());
    }
}
