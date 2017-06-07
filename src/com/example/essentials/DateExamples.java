package com.example.essentials;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

class DateExamples {

    static void showExamples() {
        Date date1 = new Date();
        System.out.println(date1);

        GregorianCalendar gc1 = new GregorianCalendar(2012, 1, 12);
        gc1.add(GregorianCalendar.DATE, 1);
        Date date2 = gc1.getTime();
        System.out.println(date2);

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df1.format(date2));

        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);

        LocalDate ld1 = LocalDate.of(2009, 1, 30);
        System.out.println(ld1);

        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_DATE;
        System.out.println(dtf1.format(ld1));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dtf2.format(ld1));
    }
}
