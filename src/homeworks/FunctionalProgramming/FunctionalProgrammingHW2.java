package homeworks.FunctionalProgramming;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.*;

public class FunctionalProgrammingHW2 {
    public static void main(String[] args) {
        System.out.println(isValidDate("04.12.25"));  // true
        System.out.println(isValidDate("02.30.22"));  // false (invalid day)
        System.out.println(isValidDate("13.12.22"));  // false (invalid month)
        System.out.println(isValidDate("04.31.23"));  // false (invalid day in April)
    }

    public static boolean isValidDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate date = LocalDate.parse(dateStr, formatter);
            String formattedDate = date.format(formatter);
            return dateStr.equals(formattedDate);
        } catch (DateTimeParseException e) {return false;}
    }

}

/*
2. Create a method to validate a date according to the format "mm.dd.yy".
 */
