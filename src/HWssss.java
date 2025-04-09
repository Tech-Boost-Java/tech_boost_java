import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HWssss {
    public static boolean isValid(String s) {
        Pattern p = Pattern.compile("^[a-zA-Z -]+$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ім'я: ");
        String s = sc.nextLine();
        while(!isValid(s)) {
            System.out.println("Введіть ще раз: ");
            s = sc.nextLine();
        }
        String[] greetings = {
                "Hello, %s",
                "Welcome %s",
                "How are you, %s?",
                "'Sup %s!"
        };
        int i = new java.util.Random().nextInt(greetings.length);
        System.out.printf(greetings[i], s);

    }
}
