package practice.practice7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Time {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DayOfWeek currentDayOfWeek = today.getDayOfWeek();
        String dayName = currentDayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println("Today is: " + dayName);

        LocalDate firstDayOfMonth = today.withDayOfMonth(1);

        while (firstDayOfMonth.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstDayOfMonth = firstDayOfMonth.plusDays(1);
        }

        System.out.println("First Monday of this month: " + firstDayOfMonth);
    }
}
