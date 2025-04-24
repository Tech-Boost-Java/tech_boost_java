package functional;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateAndTime {
    public static void main(String[] args) {
        // Get the current date and time
       LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);


        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);

        // Parse a date string
        String dateString = "2023-10-01 12:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
        System.out.println("Parsed date and time: " + parsedDateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Current date and time with timezone: " + zonedDateTime);

        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTimeInZone = ZonedDateTime.now(zoneId);
        System.out.println("Current date and time in New York: " + zonedDateTimeInZone);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        int count = 0;
        for (String zone : availableZoneIds) {
            System.out.println("Available Zone ID: " + zone);
            count++;
        }
        System.out.println("Total available Zone IDs: " + count);




    }
}
