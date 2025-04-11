package homework.hw5_FuntionalProgramming;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class task4 {

    public static void printWeekdays(LocalDate date) {
        Locale currentLocale = Locale.getDefault();
        Locale displayLocale = currentLocale.getLanguage().equals("en") ? Locale.ENGLISH : currentLocale;

        DayOfWeek day = date.getDayOfWeek();
        DayOfWeek dayplus6 = date.plusMonths(6).getDayOfWeek();
        DayOfWeek dayplus12 = date.plusMonths(12).getDayOfWeek();

        System.out.println("The day of the week birthday falls on: " + day.getDisplayName(TextStyle.FULL, displayLocale));
        System.out.println("The day of the week birthday falls on after 6 months: " + dayplus6.getDisplayName(TextStyle.FULL, displayLocale));
        System.out.println("The day of the week birthday falls on after 12 months: " + dayplus12.getDisplayName(TextStyle.FULL, displayLocale));
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2007, 8, 12);

        printWeekdays(birthday);
    }
}

