import java.util.Scanner;

public class string_homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = input.nextLine();
        String fixed = sentence.replaceAll("\\s+", " ");
        System.out.println(fixed);
    }

}
