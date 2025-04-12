package homework2;
import java.util.Scanner;
public class task2 {
    String str;
    task2(String str){
        this.str = str;
    }
    public void replace(String str){
        String string = str.replaceAll("\\s+", " ");
        System.out.println(string.trim());
    }
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        String string = scan.nextLine();
        task2 str = new task2(string);
        str.replace(string);
    }
}
