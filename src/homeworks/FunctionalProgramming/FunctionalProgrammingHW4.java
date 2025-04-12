package homeworks.FunctionalProgramming;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class FunctionalProgrammingHW4 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2006, 11, 17);
        printDayOfWeek(birthday);
    }

    public static void printDayOfWeek(LocalDate localDate) {
        try {

            System.out.println("Birthday falls on: " + getDayOfWeek(localDate));
            System.out.println("6 months later falls on: " + getDayOfWeek(localDate.plusMonths(6)));
            System.out.println("12 months later falls on: " + getDayOfWeek(localDate.plusMonths(12)));
        }
        catch (DateTimeParseException e) {
            System.out.println("Error: Invalid date format.");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public static String getDayOfWeek (LocalDate localDate) {
        Locale defaultLocale = Locale.getDefault();
        return localDate.getDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL, defaultLocale);
    }
}

/*
4. Create a variable "birthday" of type "LocalDate" and set it to the date of your birthday.
Then create a method that takes a "LocalDate" object as a parameter, and prints the day of
the week it falls on, as well as the day of the week after 6 months and 12 months have
passed.
**Additionally, the method should only print the day of the week in English if the default
locale is set to English. Otherwise, it should print the day of the week in the language of
the default locale. Finally, the method should handle any exceptions that may occur during
the date calculation process and print an appropriate error message.
 */
