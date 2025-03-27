package arr;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] elements = new int[5];

        elements[0] = 1;
        elements[1] = 2;
        elements[2] = 3;
        elements[3] = 4;
        elements[4] = 5;
        System.out.println( "Value of element with index 4:  " + elements[4]);

//        for (int i = 0; i < elements.length; i++) {
//            System.out.println(elements[i]);
//        }
//        for (int el : elements) {
//            System.out.println(el);
//        }
//
//        System.out.println(Arrays.toString(elements));
        int[] elements1 = {1, 7, -10, 35, 0, 35, 12, 11, 2, 3, 14, 0};
        int[] elements2 = {1, 7, -10, 35, 0, 35, 12, 11, 2, 3, 14, 0};
        System.out.println("Equals: " + Arrays.equals(elements1, elements2));

        int indexNotCorrect = Arrays.binarySearch(elements2, 35);
        System.out.println("Index of 35: " + indexNotCorrect);
        System.out.print(Arrays.toString(elements2) + " ");
        System.out.println();
        Arrays.sort(elements2);
        int index = Arrays.binarySearch(elements2, 35);
        System.out.println("Index of 35: " + index);

        System.out.println("Length: " + elements2.length);
        System.out.println("Sorted array: " + Arrays.toString(elements2));


        int[] copy = Arrays.copyOf(elements2, 15);
        System.out.println("\nCopy of array: " + Arrays.toString(copy));

        int[][] elements3= {{1}, {4, 5, 6}, {7, 8},{-3,0,-111}};
        System.out.println(Arrays.deepToString(elements3));

        System.out.println(elements3[1][2]);

        System.out.println(Arrays.equals(elements1, elements2));

        int[] nums = new int[10];
        Arrays.fill(nums, new Random().nextInt(100));
        System.out.println(Arrays.toString(nums));


    }
}
