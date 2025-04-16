package hw;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class DateValidator {
    public static boolean isValidDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.uu")
                .withResolverStyle(ResolverStyle.STRICT);

        try {
            LocalDate parsedDate = LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValidDate("04.16.25"));
        System.out.println(isValidDate("02.30.25"));
        System.out.println(isValidDate("13.01.25"));
        System.out.println(isValidDate("4.1.25"));
    }
}
