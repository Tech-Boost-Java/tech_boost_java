import java.util.Scanner;

public class MinimumNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int count = 3;
            int nums[] = new int[count];

            for (int index = 0; index < count; index++) {
                System.out.printf("%nInput the %d number: ", index + 1);
                nums[index] = sc.nextInt();
            }

            int min = nums[count - 1];
            for (int index = 0; index < count - 1; index++) {
                if (nums[index] < min) {
                    min = nums[index];
                }
            }
            
            System.out.printf("The smallest number is %d%n", min);
        }
    }
}