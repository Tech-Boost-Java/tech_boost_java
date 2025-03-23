package homework.homework2;

public class TheSmallestNum {
    private int a;
    private int b;
    private int c;

    public TheSmallestNum(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int findTheSmallest(){
        return Math.min(Math.min(a, b), c);
    }
}
