package practice.practice5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CollectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list");
        String input = sc.nextLine();
        String [] numbers = input.split(",");
        ArrayList<Integer> myCollection = new ArrayList<>();
        for (String number : numbers) {
            myCollection.add(Integer.parseInt(number.trim())); // Remove spaces and convert to integer
        }
        ArrayList<Integer> newCollection = new ArrayList<>();

        for(Integer number : myCollection){
            if (number > 5){
                newCollection.add(myCollection.indexOf(number));
            }
        }
        System.out.println(Arrays.toString(newCollection.toArray()));

        myCollection.removeIf(number -> number > 20);
        System.out.println(Arrays.toString(myCollection.toArray()));

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        System.out.println(Arrays.toString(myCollection.toArray()));

        myCollection.sort((a, b) -> { return a.compareTo(b); });
        System.out.println(Arrays.toString(myCollection.toArray()));
    }
}
