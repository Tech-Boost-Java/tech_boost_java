package practice.practice4;
import java.util.*;

import practice.practice2.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class SetOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String input = sc.nextLine();
        String[] numbers = input.split(",");
        ArrayList<String> numList = new ArrayList<>(Arrays.asList(numbers));

        ArrayList<String> numList2 = new ArrayList<>();
        for(String number : numList){
            if(!numList2.contains(number)){
                numList2.add(number);
            }
        }

        System.out.println(numList2);
    }
}
