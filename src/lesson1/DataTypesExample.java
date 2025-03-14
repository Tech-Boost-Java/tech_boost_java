package lesson1;

public class DataTypesExample {
    private static int age;
    private String name = "John";

    public static void main(String[] args) {
        // Integer types (whole numbers)
        byte smallNumber = 127;    // 8-bit, range: -128 to 127
        short mediumNumber = 32000; // 16-bit, range: -32,768 to 32,767
        int number = 1000000;      // 32-bit, most commonly used integer type
        long bigNumber = 1000000000L; // 64-bit, use 'L' suffix for long

        // Floating-point types (decimal numbers)
        float decimalNum = 5.75f;  // 32-bit, use 'f' suffix for float
        double preciseNum = 19.99; // 64-bit, more precise, commonly used

        // Character type
        char letter = 'A';         // 16-bit Unicode character, single quotes

        // Boolean type
        boolean isJavaFun = true;  // true or false values only

        // Output examples
        System.out.println("Byte value: " + smallNumber);
        System.out.println("Short value: " + mediumNumber);
        System.out.println("Integer value: " + number);
        System.out.println("Long value: " + bigNumber);
        System.out.println("Float value: " + decimalNum);
        System.out.println("Double value: " + preciseNum);
        System.out.println("Character value: " + letter);
        System.out.println("Boolean value: " + isJavaFun);


    }
}