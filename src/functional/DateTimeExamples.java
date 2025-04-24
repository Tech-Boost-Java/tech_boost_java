package functional;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeExamples {

    public static void main(String[] args) {
        demoBasicDateTimeOperations();
        solveDaysUntilSpecificDate();
        solveAddDaysAndHours();
        solveIsWeekend();
    }

    //  Demonstration of basic date-time features
    public static void demoBasicDateTimeOperations() {
        System.out.println("=== Basic Date-Time Operations ===");

        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        ZonedDateTime currentZoned = ZonedDateTime.now();

        System.out.println("Current date: " + currentDate);
        System.out.println("Current time: " + currentTime);
        System.out.println("Current date and time: " + currentDateTime);
        System.out.println("Date and time with zone: " + currentZoned);

        // Formatting example
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("Formatted date and time: " + currentDateTime.format(formatter));
    }

    // How many days until a specific date
    public static void solveDaysUntilSpecificDate() {
        System.out.println("\n=== Days Until New Year's Eve ===");

        LocalDate today = LocalDate.now();
        LocalDate newYear = LocalDate.of(today.getYear(), 12, 31);
        long daysUntil = ChronoUnit.DAYS.between(today, newYear);

        System.out.println("Days remaining until New Year's Eve: " + daysUntil);
    }

    //  Add days and hours to the current time
    public static void solveAddDaysAndHours() {
        System.out.println("\n=== Add Days and Hours to Current Time ===");

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime future = now.plusDays(3).plusHours(5);

        System.out.println("Now: " + now);
        System.out.println("In 3 days and 5 hours: " + future);
    }

    // Check if a given day is a weekend
    public static void solveIsWeekend() {
        System.out.println("\n=== Check if a Day is a Weekend ===");

        LocalDate inputDate = LocalDate.of(2025, 4, 26); // change this to any date
        DayOfWeek day = inputDate.getDayOfWeek();

        boolean isWeekend = day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;

        System.out.println("Date: " + inputDate + " — " + day);
        System.out.println("Is it a weekend? " + (isWeekend ? "Yes" : "No"));
    }
}
