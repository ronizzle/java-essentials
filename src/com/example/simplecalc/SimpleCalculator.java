package com.example.simplecalc;

import java.math.BigDecimal;
import java.util.Scanner;

class SimpleCalculator {

    void run() {

        Scanner scanner1 = new Scanner(System.in);
        String input1;
        String input2;

        System.out.print("Enter numeric value:");
        input1 = scanner1.nextLine();
        System.out.print("Enter numeric value:");
        input2 = scanner1.nextLine();

        BigDecimal bd1 = new BigDecimal(input1);
        BigDecimal sum = bd1.add(new BigDecimal(input2));
        System.out.println(sum);
    }
}
