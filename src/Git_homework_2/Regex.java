package Git_homework_2;
import java.util.regex.*;

public class Regex {
    public static boolean isVowel(String s) {
        Pattern pattern = Pattern.compile("^[aeiou]$", Pattern.CASE_INSENSITIVE);
        Matcher m = pattern.matcher(s);
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println(isVowel("ou"));
    }
}
