package Git_homework_1;

import java.util.Scanner;

public class SmallestNumber {

    public static int smallestNumber(){
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter "+(i+1)+" number: ");
            numbers[i] = new Scanner(System.in).nextInt();
        }
        int minNum = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < minNum){
                minNum = numbers[i];
            }
        }
        return minNum;
    }

    public static void main(String[] args) {
        System.out.println(smallestNumber());
    }
}
