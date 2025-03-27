package conditions;

public class StatementsExamples {
    public static void main(String[] args) {
        double a = -10;
        boolean b = true;
        if (a > 0 && b == true) {
            if (b == true) {
                System.out.println("a is positive");
            }
        } else if (a == 0) {
            System.out.println("a is zero");
        } else if (a == 6) {
            System.out.println("a is 6");
        } else {
            System.out.println("a is negative");
        }
        System.out.println("End of the program");
    }
}
