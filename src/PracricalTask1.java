import java.util.Scanner;

public class PracricalTask1 {
    static Scanner sc = new Scanner(System.in);

    static int getNumber(String prompt){
        System.out.print(prompt);
        return sc.nextInt();
    }
    static int getTotal(int a, int b){
        return a + b;
    }
    static float getAverage(float a, float b){
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        int firstNumb = getNumber("Enter the first number: ");
        int secondNumb = getNumber("Enter the second number1: ");

        int sum = getTotal(firstNumb, secondNumb);
        System.out.println("The sum of " + firstNumb + " and " + secondNumb + " is " + sum);

        double average = getAverage(firstNumb, secondNumb);
        System.out.println("The average of " + firstNumb + " and " + secondNumb + " is " + average);


    }
}
