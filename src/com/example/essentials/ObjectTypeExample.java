package com.example.essentials;

public class ObjectTypeExample {

    public String someType;

    public static void showExamples() {
        ObjectTypeExample ote = new ObjectTypeExample();
        ote.someType = "Hello object";
        ote.displaySomeType();

    }

    private void displaySomeType() {
        System.out.println(someType);
    }
}
