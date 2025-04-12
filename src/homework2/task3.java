package homework2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    Boolean found = false;
    public void regex(String text){
        Pattern p = Pattern.compile("\\$\\d+(\\.\\d{2})?");
        Matcher matcher = p.matcher(text);
        while (matcher.find()) {
            found = true;
            System.out.println(matcher.group());
        }
        if(!found){
            System.out.println("no match found");
        }
    }
    public static void main( String[] args ){
        Scanner scan = new Scanner(System.in);
        task3 sentence = new task3();
        String text = scan.nextLine();
        sentence.regex(text);
    }
}
