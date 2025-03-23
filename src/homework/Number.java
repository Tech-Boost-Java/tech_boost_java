package homework;
import java.util.Scanner;
public class Number {
    void minNumber(){
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = enter.nextInt();
        int min = number;
        for(int i = 0; i < 2; i++){
            System.out.print("Enter number: ");
            int numbers = enter.nextInt();
            if(number > numbers){
                min = numbers;
            }
            //System.out.println(number);
        }
        System.out.print(min);
    }
    public static void main( String[] args ){
        Number minimum = new Number();
        minimum.minNumber();
    }
}
