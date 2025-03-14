package lesson1;

public class OperatorsExample {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;

        int sum = a + b;        // Addition
        int difference = a - b; // Subtraction
        int product = a * b;    // Multiplication
        int quotient = a / b;   // Division
        int remainder = a % b;  // Modulus (remainder after division)

        // Output arithmetic results
        System.out.println("Sum: " + sum);              // 15
        System.out.println("Difference: " + difference); // 5
        System.out.println("Product: " + product);      // 50
        System.out.println("Quotient: " + quotient);    // 2
        System.out.println("Remainder: " + remainder);  // 0

        // Comparison Operators
        boolean isEqual = (a == b);      // Equal to
        boolean isNotEqual = (a != b);   // Not equal to
        boolean isGreater = (a > b);     // Greater than
        boolean isLess = (a < b);        // Less than
        boolean isGreaterOrEqual = (a >= b); // Greater than or equal to

        // Output comparison results
        System.out.println("a equals b: " + isEqual);         // false
        System.out.println("a not equals b: " + isNotEqual);  // true
        System.out.println("a greater than b: " + isGreater); // true
        System.out.println("a less than b: " + isLess);       // false
        System.out.println("a >= b: " + isGreaterOrEqual);    // true

        // Logical Operators
        boolean x = true;
        boolean y = false;

        boolean andResult = x && y;  // Logical AND (true if both are true)
        boolean orResult = x || y;   // Logical OR (true if at least one is true)
        boolean notResult = !x;      // Logical NOT (inverts the value)

        // Output logical results
        System.out.println("x AND y: " + andResult);  // false
        System.out.println("x OR y: " + orResult);    // true
        System.out.println("NOT x: " + notResult);    // false

        // Assignment and Increment/Decrement Operators
        int num = 10;
        num += 5;   // Same as num = num + 5
        num++;      // Increment by 1
        num--;      // Decrement by 1

        // Output modified value
        System.out.println("Modified num: " + num);   // 15
    }
}
