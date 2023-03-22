package myself;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println("--------->");

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println("Before formatting: " + localDateTime1);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = localDateTime1.format(dateTimeFormatter);
        System.out.println("After formatting: " + formattedDate);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formattedDate1 = localDateTime1.format(dateTimeFormatter1);
        System.out.println("After Formatting: " + formattedDate1);

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formattedDate2 =localDateTime1.format(dateTimeFormatter2);
        System.out.println(formattedDate2);

        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");

        String formattedDate3 =localDateTime1.format(dateTimeFormatter3);
        System.out.println(formattedDate3);

        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

        String formattedDate4 = localDateTime1.format(dateTimeFormatter4);
        System.out.println(formattedDate4);




    }

    }



