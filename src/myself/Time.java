package myself;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Local Date: " + date);
        System.out.println("Local Time: " + time);
        System.out.println("Local Date and Time: " + dateTime);

        System.out.println("=========================");

        date = date.plusDays(3);
        System.out.println(date);

        date = date.minusDays(5);
        System.out.println(date);

        System.out.println("=========================");

        date = date.plusWeeks(2);
        System.out.println(date);

        date = date.minusWeeks(3);
        System.out.println(date);

        System.out.println("=====================");

        date = date.plusMonths(1);
        System.out.println(date);

        date = date.minusMonths(2);
        System.out.println(date);

        System.out.println("====================");

        date = date.plusYears(3);
        System.out.println(date);

        date = date.minusYears(2);
        System.out.println(date);

        System.out.println("===================");

        time = time.plusHours(2);
        System.out.println(time);

        time = time.minusHours(3);
        System.out.println(time);

        System.out.println("===================");

        time = time.plusMinutes(22);
        System.out.println(time);

        time = time.minusMinutes(10);
        System.out.println(time);

        System.out.println("====================");

        time = time.plusSeconds(5);
        System.out.println(time);

        time = time.minusSeconds(20);
        System.out.println(time);

        System.out.println("====================");

        time = time.plusNanos(56);
        System.out.println(time);

        time = time.minusNanos(45);
        System.out.println(time);

        System.out.println("=====================");

        dateTime = dateTime.minusDays(4);
        System.out.println(dateTime);
    }
}
