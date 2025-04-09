package lesson2;

public class Operators {
    public static void main(String[] args) {
        int t = 5, s = 4, v = 7;
        System.out.println((t > s) && (t > v) || (s < v)); // true
        System.out.println((t > s) || (t > v) && (s > v)); // true
        System.out.println((t > s || t > v) && (s > v));   // false
    }
}
