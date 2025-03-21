package lesson1;

public class testclass5 {
    public static int calculateArea(int width, int height) {
        return width * height;
    }

    public static void main(String[] args) {
        int width = 5;
        int height = 10;
        System.out.println("Площа прямокутника: " + calculateArea(width, height));
    }
}
