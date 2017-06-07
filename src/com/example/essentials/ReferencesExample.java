package com.example.essentials;

class ReferencesExample {
    static void showExamples() {
        int i0 = 0;
        System.out.println(i0);
        incrementValue(i0);
        System.out.println(i0);

        int[] i1 = {1, 2, 3};
        System.out.println(i1[0]);
        incrementValue(i1);
        System.out.println(i1[0]);

        String s1 = "Welcome!";
        System.out.println(s1);
        changeString(s1);
        System.out.println(s1);
    }


    /**
     * primited data types stays as is outside the scope
     * @param val
     */
    static void incrementValue(int val) {
        val++;
        System.out.println(val++);
    }


    /**
     * objects passed changes the value even outside of the scope
     * @param val
     */
    static void incrementValue(int[] values) {
        values[0]++;
        System.out.println(values[0]);
    }

    /**
     * Strings are immutable
     * @param val
     */
    static void changeString(String val) {
        val = "Hello!";
        System.out.println(val);
    }
}
