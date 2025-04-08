package Allhomework.second;
import java.util.Scanner;
public class task2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a sentence within a few spaces instead of one: ");
            String input = scanner.nextLine();
            String normalized = input.replaceAll("\\s+", " ");
            System.out.println("Result after normalizing: " + normalized);
        }
}
