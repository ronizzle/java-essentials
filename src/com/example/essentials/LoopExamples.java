package com.example.essentials;

class LoopExamples {

    static String[] months = {"Jan", "Feb", "Mar", "Apr"};

    static void showExamples() {

        for(int i1 = 0; i1 < months.length; i1++) {
            System.out.println(months[i1]);
        }

        for(int i2 = (months.length - 1); i2 >= 0; i2--) {
            System.out.println(months[i2]);
        }

        for(String month : months) {
            System.out.println(month);
        }

        int ctr1 = 0;

        while(ctr1 < months.length) {
            System.out.println(months[ctr1]);
            ctr1++;
        }

        int ctr2 = 0;

        do {
            System.out.println(months[ctr2]);
            ctr2++;
        } while (ctr2 < months.length);

        loopIt("Months of the year.");
        loopIt("2nd run.");
        loopIt("Third run.");
    }



    static void loopIt(String label) {

        System.out.println(label);


        for(String month : months) {
            System.out.println(month);
        }

    }
}
