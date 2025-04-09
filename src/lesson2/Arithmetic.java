package lesson2;

public class Arithmetic {
    public static void main(String[] args) {
        int g = 11;
        int h = 7;
        int z = g * h;
        int v = g + h;
        int n = g - h;
        int m = g / h;
        int k = g % h;
        System.out.println("Z = " + k);

        int x = 5; // x++; ++x; x = x + 1;
        int a, b;
        a = x++; // a = 5 x = 6
        x--; // x = 5
        b = ++x; // b = 6 x = 6
        ++x; // x = 7
        boolean bool = true;
        System.out.println(bool); // true
        System.out.println(!bool); // false
        a = x++ + ++x + ++x + x++;
        System.out.println(a + " " + b);

        x = 5;
        int y = -5;
        System.out.println(x == y); // false
        System.out.println(x != y); // true
        System.out.println(x >= y); // true
    }
}
