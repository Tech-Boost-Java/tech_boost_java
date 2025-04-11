package homework.hw5_FuntionalProgramming;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class task2and3 {

    public static int toInt(@NotNull String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 10 + (s.charAt(i) - '0');
        }
        return result;
    }

    // 3
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(String date) {
        if (date == null || date.length() != 8 || date.charAt(2) != '.' || date.charAt(5) != '.') {
            return false;
        }

        String mmStr = date.substring(0, 2);
        String ddStr = date.substring(3, 5);
        String yyStr = date.substring(6, 8);

        int month = toInt(mmStr);
        int day = toInt(ddStr);
        int year = toInt(yyStr);

        if (month < 1 || month > 12) return false;

        int fullYear = (year < 50) ? 2000 + year : 1900 + year;
        int[] daysInMonth = { 31, (isLeapYear(fullYear) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        return day >= 1 && day <= daysInMonth[month - 1];
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date (mm.dd.yy): ");
        String date = scanner.nextLine();
        if (isValidDate(date)) {
            System.out.println("Date is valid.");
        } else {
            System.out.println("Date is not valid.");
        }
        // 3
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println("Year is leap.");
        } else {
            System.out.println("Year is not leap.");
        }
        scanner.close();
    }
}
