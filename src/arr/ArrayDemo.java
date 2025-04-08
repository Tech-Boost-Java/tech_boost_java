package arr;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {


        //Way 1
        int[] elements = new int[5];

        elements[0] = 0;
        elements[1] = 3;
        elements[2] = 7;
        elements[3] = -10;
        elements[4] = 1;
        System.out.println("Value of element with index 4:  " + elements[4]);//print element with index 4
        //Way1 to print all elements
        for (int i = 0; i < elements.length; i++) {
            System.out.println("Index" + i + " with value " + elements[i]);
        }
        //Way2 to print all elements
        for (int elem : elements) {
            System.out.println(elem);
        }
        System.out.println("*".repeat(10));
        //Way3 to print all elements
        System.out.println(Arrays.toString(elements));

        int[] elements1 = {1, 7, -10, 35, 0, 35, 12, 11, 2, 3, 14, 0};
        int[] elements2 = {1, 7, -10, 35, 0, 35, 12, 11, 2, 3, 14, 0};
        //Compare two arrays for equality of elements and order
        System.out.println("Equals: " + Arrays.equals(elements1, elements2));

        //Not correct index of element 35 because the array is not sorted
        int indexNotCorrect = Arrays.binarySearch(elements2, 35);
        System.out.println("Index of 35: " + indexNotCorrect);

        //Sort array
        Arrays.sort(elements2);
        //Correct index of element 35 because the array is sorted
        int index = Arrays.binarySearch(elements2, 35);
        System.out.println("Index of 35: " + index);

        System.out.println("Length: " + elements2.length);
        //toString() method is used to convert the specified array of objects into a string representation.
        System.out.println("Sorted array: " + Arrays.toString(elements2));

        //make a copy of an array with a new length of 15
        int[] copy = Arrays.copyOf(elements2, 15);
        System.out.println("\nCopy of array: " + Arrays.toString(copy));

        //deepToString() method is used to convert the specified array of arrays into a string representation.
        int[][] elements3 = {{1}, {4, 5, 6}, {7, 8}, {-3, 0, -111}};
        System.out.println(Arrays.deepToString(elements3));

        //access element in 2D array: 2nd row, 3rd column (indexing starts from 0)
        //index 1 is the 2nd row, index 2 is the 3rd column --> 6
        System.out.println(elements3[1][2]);
        //equals() returns false
        System.out.println(Arrays.equals(elements1, elements2));

        //fill array with a specific value
        int[] nums = new int[10];
        Arrays.fill(nums, new Random().nextInt(100));
        System.out.println(Arrays.toString(nums));


    }
}
