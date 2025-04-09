import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HWsss {
    public static String str(String s) {
        StringBuilder st = new StringBuilder();
        Pattern p = Pattern.compile("\\$\\d+\\.\\d{2}\\b");
        Matcher m = p.matcher(s);

        while(m.find()) {
            st.append(m.group()).append(" ");
        }
        return st.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(str(s));

    }
}
