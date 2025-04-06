package Git_homework_2;

import java.util.Scanner;
import java.util.regex.*;

public class ThirdClas {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        System.out.printf("Enter some instances of currency (e.g. $12.45 $345.67): ");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] instances = input.split(" ");

        for (String instance : instances) {
            Matcher matcher = pattern.matcher(instance);
            if (matcher.matches()) {
                System.out.printf(instance + " ");
            }
        }
    }
}
