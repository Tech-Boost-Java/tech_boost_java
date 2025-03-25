package arr;
import java.util.Arrays;
public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};

        // Print original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sorting the array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Filling an array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        // Copying an array
        int[] copiedArray = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // Copying a range of an array
        int[] copiedRange = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("Copied Range (index 1-3): " + Arrays.toString(copiedRange));

        // Checking if two arrays are equal
        boolean isEqual = Arrays.equals(arr, copiedArray);
        System.out.println("Are Original and Copied Arrays Equal? " + isEqual);

        // Binary search (requires a sorted array)
        int key = 6;
        int index = Arrays.binarySearch(arr, key);
        if (index >= 0) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found.");
        }
    }
}
