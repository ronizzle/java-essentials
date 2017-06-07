package com.example.simplecalc;

import javax.naming.OperationNotSupportedException;
import java.math.BigDecimal;
import java.util.Scanner;

public class LevelTwoCalc {

    void run() {

        Scanner scanner1 = new Scanner(System.in);
        String input1;
        String input2;
        String input3;
        Double d1;
        Double d2;
        Double result;

        System.out.print("Enter numeric value:");
        input1 = scanner1.nextLine();
        System.out.print("Enter numeric value:");
        input2 = scanner1.nextLine();
        System.out.print("Enter numeric value:");
        input3 = scanner1.nextLine().trim();


        try {

            d1 = Double.parseDouble(input1);
            d2 = Double.parseDouble(input2);

            switch(input3) {
                case "+":
                    result = d1 + d2;
                    break;
                case "-":
                    result = d1 - d2;
                    break;
                case "*":
                    result = d1 * d2;
                    break;
                case "/":
                    result = d1 / d2;
                    break;
                default:
                    throw new Exception("Invalid operator. Only use + - * /");
            }

            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Some wrong input " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
