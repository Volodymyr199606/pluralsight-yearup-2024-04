package com.pluralsight;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        dateAndTime();
    }

    public static void dateAndTime() {
        System.out.println("************************************");
        System.out.println("           DATE AND TIME");
        System.out.println("************************************");


        LocalDate date2021 = LocalDate.of(2021, 9, 5);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(date2021.format(formatter1));


        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(date2021.format(formatter2));


        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println(date2021.format(formatter3));


        DayOfWeek dayOfWeek = date2021.getDayOfWeek();
        System.out.println(dayOfWeek);


        LocalDateTime dateTime2021 = LocalDateTime.of(date2021, LocalTime.of(10, 2));
        ZonedDateTime gmtDateTime = ZonedDateTime.of(dateTime2021, ZoneId.of("GMT"));
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("MMM d, yyyy HH:mm z");
        System.out.println(gmtDateTime.format(formatter4));


        ZonedDateTime sanFranciscoTime = gmtDateTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("H:mm 'on' dd-MMM-yyyy");
        System.out.println(sanFranciscoTime.format(formatter5));

        System.out.println();
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("EEEE, H:mm 'on' dd-MMM-yyyy");
        System.out.println(LocalDateTime.now(ZoneId.of("America/Los_Angeles")).format(formatter6));
    }
}