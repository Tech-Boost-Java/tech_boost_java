package Homeworks.Homework_functional;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.function.Consumer;;

interface Encryption {
    String encrypt(String s, int n);
    String decrypt(String s, int n);
}

class Time {
    public static boolean isValidDate(String dateStr) {
        try {
            // Define the formatter for the "mm.dd.yy" format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");

            // Try to parse the date string
            // This will throw an exception if the format doesn't match or if it's not a valid date
            LocalDate date = LocalDate.parse(dateStr, formatter);

            return true;
        } catch (DateTimeParseException e) {
            // If any parsing exception occurs, the date is invalid
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        return Year.of(year).isLeap();
    }

}

class EncryptionDemo {
    public static void main(String[] args) {
        Encryption encryption = new Encryption() {
            @Override
            public String encrypt(String s, int n) {
                StringBuilder encrypted = new StringBuilder();
                for (char c : s.toCharArray()) {
                    encrypted.append((char) (c + n));
                }
                return encrypted.toString();
            }

            @Override
            public String decrypt(String s, int n) {
                StringBuilder decrypted = new StringBuilder();
                for (char c : s.toCharArray()) {
                    decrypted.append((char) (c - n));
                }
                return decrypted.toString();
            }
        };

        String s = encryption.encrypt("Hello World", 3);
        System.out.println(s);

        String decrypted = encryption.decrypt(s, 3);
        System.out.println(decrypted);

        String[] testDates = {
                "02.29.24",
                "01.15.23",
                "13.01.23",
                "02.29.23",
                "04.31.23",
                "06.15.25",
                "12.abc.23"
        };

        for (String date : testDates) {
            System.out.println(date + " is " + (Time.isValidDate(date) ? "valid" : "invalid"));
        }

        int[] testYears = {
                2000,  // leap year (divisible by 400)
                2004,  // leap year (divisible by 4, not by 100)
                2020,  // leap year
                2024,  // leap year
                1900,  // not a leap year (divisible by 100, not by 400)
                2022,  // not a leap year
                2023   // not a leap year
        };

        for (int year : testYears) {
            System.out.println(year + " is " + (Time.isLeapYear(year) ? "a leap year" : "not a leap year"));
        }

        LocalDate birthday = LocalDate.of(2001, 1, 1);
        Consumer<LocalDate> printDayOfWeek = dateOfBirthday -> System.out.println("Day of week after 6 month: "
                + dateOfBirthday.plusMonths(6).getDayOfWeek()
                + "\nDay of week after 12 month: "
                + dateOfBirthday.plusMonths(12).getDayOfWeek());

        printDayOfWeek.accept(birthday);

    }
}