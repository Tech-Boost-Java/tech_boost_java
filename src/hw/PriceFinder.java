package hw;
import java.util.Scanner;
import java.util.regex.*;

public class PriceFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence with prices: ");
        String text = sc.nextLine();

        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Found prices: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
