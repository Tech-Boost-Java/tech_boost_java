package Homework8;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class HW4 {
    public static void dayOfWeek(LocalDate birthday) {
        try{
            Locale defaultLocale = Locale.getDefault();
            if (defaultLocale.getLanguage().equals("en")) {
                System.out.println("Day of the week: " + birthday.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
                System.out.println("After 6 months: " + birthday.plusMonths(6).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
                System.out.println("After 12 months: " + birthday.plusMonths(12).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
            }
            else {
                System.out.println("День тижня: " + birthday.getDayOfWeek().getDisplayName(TextStyle.FULL, defaultLocale));
                System.out.println("Після 6 місяців: " + birthday.plusMonths(6).getDayOfWeek().getDisplayName(TextStyle.FULL, defaultLocale));
                System.out.println("Після 12 місяців: " + birthday.plusMonths(12).getDayOfWeek().getDisplayName(TextStyle.FULL, defaultLocale));
            }
        }
        catch (Exception e) {
            System.out.println("Smth went wrong " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2006, 10, 11);

        dayOfWeek(birthday);
    }
}
