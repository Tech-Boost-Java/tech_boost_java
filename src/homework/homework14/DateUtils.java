package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtils {
    public static boolean isValidDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yy");
        sdf.setLenient(false);
        try {
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(DateUtils.isValidDate("02.29.24"));
        System.out.println(DateUtils.isValidDate("02.30.24"));

        System.out.println(DateUtils.isLeapYear(2024));
        System.out.println(DateUtils.isLeapYear(2023));
    }
}
