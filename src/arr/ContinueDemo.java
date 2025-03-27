package arr;

public class ContinueDemo {
    public static void main(String[] args) {
        int[] elements = {1, 7, -10, -35, 0, -35, 12, 11, 2, 3, 14, 0};

        int sum = 0;

        for (int element : elements) {
            if (element <= 0) {
                continue;
            }
            sum += element;
        }
        System.out.println("Sum of positive elements: " + sum);
    }
}
