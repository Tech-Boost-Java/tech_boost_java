package QuizeTasks;
import java.util.Scanner;
public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three0digit number: ");
        String input = scanner.nextLine();
        double number = Integer.parseInt(input);
        System.out.println("square root: "+ calculateSquareRoot(number));
        System.out.println("square: "+ calculateSquare(number));
        System.out.println("cube: "+ calculateCube(number));

    }
    public static double calculateSquareRoot(double number){
        if(number>1){
            double result = Math.sqrt(number);
            return result;
        }
        else {
            // Handle the error if the number is not three digits
            throw new IllegalArgumentException("The input number should be positiv and more than 1.");
        }

    }
    public static double calculateSquare(double number){
        if(number>1){
            double result = number*number;
            return result;
        }
        else {
            // Handle the error if the number is not three digits
            throw new IllegalArgumentException("Error");
        }

    }
    public static double calculateCube(double number){
        if(number>1){
            double result = Math.pow(number,3);
            return result;
        }
        else {
            // Handle the error if the number is not three digits
            throw new IllegalArgumentException("Error");
        }

    }
}
