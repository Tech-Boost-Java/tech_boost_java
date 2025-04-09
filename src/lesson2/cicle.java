package lesson2;

import java.util.Scanner;
import java.util.Arrays;

public class cicle {
    public static void main(String[] args) {
        int x = 0;
        while (x < 5) {
            System.out.println("Hello World! ");
            x++;
        }
        do {
            System.out.println("Hell");
            x++;
        } while (x < 15);

        int[] numbers = {5, 6, 8, 3, 5, 7, 9};
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        for (int i = 0; i < 5; i++) {
            System.out.println("Input number");
            n = sc.nextInt();
            if (n < 0){
                continue;
            }
            sum += n;
        }
        System.out.println(sum);
        sc.close();

        int[] arr = {2, -5, 7, -4, 8};int sum2= 0;
        for (int i = 0; i < arr.length; i++) { sum2 += arr[i];}
        System.out.println("Sum = " + sum2);

        int product = 1;
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {product = product * arr[i];}}
        System.out.println("Product = " + product);

        int amount = 0;
        for (int a : arr) {
            if (a > 0 && a <= 7) { amount++; }
        }
        System.out.println("Amount = " + amount);

        int max = arr[0];
        int imax = 0;
        int g = 0;
        while (g < arr.length) {
            if (arr[g] > max) {
                max = arr[g];
                imax = g;
            }
            g++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] numbers2 = { 2, -5, 8, -4, 7 };
        Arrays.sort(numbers2);
        int index = Arrays.binarySearch(numbers2, 7);
        String elements = Arrays.toString(numbers2);
        System.out.println("Numbers = " + elements);
        System.out.println("Position of element with value 7 is " + index);
    }
}
