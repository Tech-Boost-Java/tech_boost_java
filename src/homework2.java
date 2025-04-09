import java.util.Scanner;

public class homework2 {
    static int findMin(int a, int b, int c) {
        return (a < b) ? (Math.min(a, c)) : (Math.min(b, c));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Min number: " + findMin(a, b, c));
    }
}
