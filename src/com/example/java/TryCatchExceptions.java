package com.example.java;

public class TryCatchExceptions {

    static void showExamples() {
        String welcome = "Welcome!";
        char[] welcomeArr = welcome.toCharArray();
        try {

            if(welcomeArr.length < 10) {
                throw new Exception("Some exception message");
            }

            char lastChar = welcomeArr[welcomeArr.length -1]; // without - 1, example of run time errors
            System.out.println(lastChar);
            String sub1 = welcome.substring(15);
            System.out.println(sub1);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index problem.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index problem.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
