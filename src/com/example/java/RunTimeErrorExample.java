package com.example.java;

class RunTimeErrorExample {

    static void showExamples() {
        String s = null; // when Null, syntax errors
        System.out.println(s);



        String welcome = "Welcome!";
        char[] welcomeArr = welcome.toCharArray();
        char lastChar = welcomeArr[welcomeArr.length - 1]; // without - 1, example of run time errors
        System.out.println(lastChar);

        for(int i1 = 0; i1 < welcomeArr.length; i1++) {
            System.out.print(welcomeArr[i1]);
        }
    }
}
