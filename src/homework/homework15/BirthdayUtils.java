package homework.homework15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class BirthdayUtils {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2007, 1, 25);  // Пример: 15 мая 1990 года
        printWeekdaysAfterMonths(birthday);
    }

    public static void printWeekdaysAfterMonths(LocalDate date) {
        System.out.println("Day of the week on the birthday: " + date.getDayOfWeek());

        LocalDate dateAfter6Months = date.plusMonths(6);
        System.out.println("Day of the week after 6 months: " + dateAfter6Months.getDayOfWeek());

        LocalDate dateAfter12Months = date.plusMonths(12);
        System.out.println("Day of the week after 12 months: " + dateAfter12Months.getDayOfWeek());
    }
}
