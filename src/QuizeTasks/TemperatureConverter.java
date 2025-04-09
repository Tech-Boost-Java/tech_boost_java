package QuizeTasks;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temp: ");
        String input = scanner.nextLine();
        double number = Integer.parseInt(input);
        System.out.println("Celsius: "+ fahrenheitToCelsius(number));
    }
    public static double fahrenheitToCelsius(double number){
        return (number-32)/1.8;
    }
}
