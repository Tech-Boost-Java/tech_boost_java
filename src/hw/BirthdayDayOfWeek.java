package hw;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class BirthdayDayOfWeek {
    public static void printBirthdayDays(LocalDate birthday) {
        try {
            Locale currentLocale = Locale.getDefault();

            String dayNow = birthday.getDayOfWeek().getDisplayName(TextStyle.FULL, currentLocale);

            LocalDate plus6 = birthday.plusMonths(6);
            String day6 = plus6.getDayOfWeek().getDisplayName(TextStyle.FULL, currentLocale);

            LocalDate plus12 = birthday.plusMonths(12);
            String day12 = plus12.getDayOfWeek().getDisplayName(TextStyle.FULL, currentLocale);

            System.out.println("Birthday falls on: " + dayNow);
            System.out.println("After 6 months: " + day6);
            System.out.println("After 12 months: " + day12);
        } catch (Exception e) {
            System.out.println("An error occurred while processing the date: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2006, 10, 3);
        printBirthdayDays(birthday);
    }
}
