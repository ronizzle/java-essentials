package com.example.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class SimpleArrayExample {
    static void showExamples() {

        //setting an initial size
        int[] intArr = new int[10];

        intArr[0] = 3;
        intArr[1] = 1;
        intArr[2] = 2;
        intArr[3] = 4;

        //array of strings
        String[] strArr = {"world", "hello", "java"};
        Arrays.sort(strArr);


        //copying arrays
        int[] copyIntArr = new int[4];
        System.arraycopy(intArr, 0, copyIntArr,0, 4);

        for(int i1: copyIntArr) {
            System.out.println(i1);
        }

        String[][] regions = new String[3][2];
        regions[0][0] = "Abra";
        regions[0][1] = "Churva";


        List <String> list = new ArrayList<>();
        list.add("Curry");
        list.add("Durant");
        list.add("Westbrook");
        System.out.println(list);
        String durant = list.get(1);
        System.out.println(durant);
        list.remove(0);
        int pos = list.indexOf("Westbrook");
        System.out.println(pos);
        list.add("Curry");
        list.add("Thomposon");
        list.add("Pachulla");

        System.out.println(list);

        Iterator <String> iterator = list.iterator();
        String surname;

        while(iterator.hasNext()) {
            surname = iterator.next();
            System.out.println(surname);
        }

        for(String surname2: list) {
            System.out.println(surname2);
        }

        list.forEach(System.out::println);
    }
}
