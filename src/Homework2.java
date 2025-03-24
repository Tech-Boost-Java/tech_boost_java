public class Homework2 {
    public static int smallestNumber(int a, int b, int c) {
        if(a <= b && a <= c) {
            return a;
        }
        else if(b <= c && b <= a) {
            return b;
        }
        else {
            return c;
        }
    }
    public static void main(String[] args){
        System.out.println("The smalles number is: " + smallestNumber(18, 32, 54));
    }
}
