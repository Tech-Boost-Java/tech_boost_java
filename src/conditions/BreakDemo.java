package conditions;

/**
 * BreakDemo
 * Demonstrates the use of break statement
 * to exit a loop
 * to find the index of an element in an array
 * Break statement is used to exit a loop prematurely
 */
public class BreakDemo {
    public static void main(String[] args) {
        int[] elements = {1, 7, -10, 35, 0, 35, 12, 11, 2, 3, 14, 0};
        int searchElement = 35;
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == searchElement) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + searchElement + ": " + index);
    }
}
