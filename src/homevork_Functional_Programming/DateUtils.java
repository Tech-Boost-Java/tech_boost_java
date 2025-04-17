package homevork_Functional_Programming;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateUtils {
    public static boolean validateDateFormat(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate.parse(date, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void printDayOfWeek(LocalDate date) {
        try {
            Locale currentLocale = Locale.getDefault();
            boolean isEnglish = Locale.getDefault().getLanguage().equals("en");

            String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, currentLocale);
            System.out.println("Day of Week: " + dayOfWeek);

            String dayOfWeek6 = date.plusMonths(6).getDayOfWeek().getDisplayName(TextStyle.FULL, currentLocale);
            System.out.println("Day of Week after 6 months: " + dayOfWeek6);

            String dayOfWeek12 = date.plusMonths(12).getDayOfWeek().getDisplayName(TextStyle.FULL, currentLocale);
            System.out.println("Day of Week after 12 months: " + dayOfWeek12);

        } catch (Exception e) {
            System.out.println("An error occurred during date calculation: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        System.out.println(DateUtils.validateDateFormat("2020-12-30"));
        System.out.println(DateUtils.validateDateFormat("12.10.06"));

        System.out.println();

        int year = 2026;
        if (isLeapYear(year))
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");

        System.out.println();

        LocalDate birthday = LocalDate.of(2006, 12, 10);

        printDayOfWeek(birthday);
    }
}
