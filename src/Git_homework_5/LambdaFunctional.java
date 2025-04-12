package Git_homework_5;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LambdaFunctional {

    public static String encrypt(String s, int n) {
        Function<Character, Character> shift = c -> {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                return (char) ((c - base + n) % 26 + base);
            } else {
                return c;
            }
        };

        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            result.append(shift.apply(c));
        }
        return result.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - (n%26));
    }

    public static boolean isValidDate(String input) {
        try {
            // Split date string
            String[] parts = input.split("\\.");
            if (parts.length != 3) return false;

            int month = Integer.parseInt(parts[0]);
            int day = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]) + 2000; // interpret "yy" as "20yy"

            // Build full date string like "2024-02-10"
            String fullDate = String.format("%04d-%02d-%02d", year, month, day);

            // Use strict formatter
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd").withResolverStyle(ResolverStyle.STRICT);

            LocalDate.parse(fullDate, formatter); // throws if invalid
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        return Year.isLeap(year);
    }

    public static void printBirthday(LocalDate birthday) {
        try{
            Locale currentLocale = Locale.getDefault();
            String dayOfweek = birthday.getDayOfWeek().getDisplayName(TextStyle.FULL,  currentLocale);
            String dayOfweekInmonths = birthday.plusMonths(6).getDayOfWeek().getDisplayName(TextStyle.FULL, currentLocale);
            String dayOfweekInyear = birthday.plusYears(1).getDayOfWeek().getDisplayName(TextStyle.FULL, currentLocale);

            System.out.printf("Day of week: %s\nDay of week in 6 months: %s\nDay of week in a year: %s\n", dayOfweek, dayOfweekInmonths, dayOfweekInyear);
        }
        catch(DateTimeParseException e){
            System.out.println("Invalid date format: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        String s = "adcdz";
        String encrypted = encrypt(s, 10);
        System.out.println(encrypted);
        String decrypted = decrypt(encrypted, 10);
        System.out.println(decrypted);

        String date = "02.29.23";
        boolean valid = isValidDate(date);
        System.out.printf("valid: %b\n", valid);
        System.out.println("Date: " + date);

        int year = 2028;
        System.out.println("The " + year + " is leap: " +  isLeapYear(year));


        Locale.setDefault(new Locale("uk", "UA"));
        LocalDate birthday = LocalDate.of(2007, 6, 15);
        printBirthday(birthday);

    }
}
