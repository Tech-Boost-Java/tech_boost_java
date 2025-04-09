import java.util.Scanner;

public class HWss {
    public static String str(String s){
        String res = s.replaceAll("\\s+", " ");
        return res;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("before: " + s);
        System.out.println("after: " + str(s));
    }
}
