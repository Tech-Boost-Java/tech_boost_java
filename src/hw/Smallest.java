package hw;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = sc.nextInt();
        System.out.print("Input the second number: ");
        int b = sc.nextInt();
        System.out.print("Input the third number: ");
        int c = sc.nextInt();
        int minimum = a;
        if(minimum > b){
            minimum = b;
        }
        if(minimum > c){
            minimum = c;
        }
        System.out.print("The smallest number is " + minimum);
        sc.close();
    }
}
