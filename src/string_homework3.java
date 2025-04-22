import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class string_homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prices = sc.nextLine();
        String regex = "\\$\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(prices);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
