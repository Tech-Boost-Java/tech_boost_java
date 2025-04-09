package HW;
import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = in.nextInt();
        System.out.println("Enter second number: ");
        int secondNmber = in.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = in.nextInt();

        System.out.println(FindGreatest(firstNumber,secondNmber,thirdNumber));

    }
    static int FindGreatest(int firstNumber,int secondNmber,int thirdNumber){
        if(firstNumber<secondNmber && firstNumber<thirdNumber){
            return firstNumber;
        }
        if(secondNmber<firstNumber && secondNmber<thirdNumber){
            return secondNmber;
        }
        else {
            return thirdNumber;
        }

    }

}
