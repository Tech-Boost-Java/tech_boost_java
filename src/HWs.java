import java.util.Scanner;

public class HWs {
    public static String biggesttWord(String s){
        String[] words = s.split(" ");
        String longestWord = "";
        for(String a: words){
            if(a.length() > longestWord.length()) {
                longestWord = a;
            }
        }
        return longestWord;
    }
    public static int size(String longestWord){
        return longestWord.length();
    }
    public static String secondDrow(String s){
        String[] words = s.split(" ");
        String reverso = new StringBuilder(words[1]).reverse().toString();

        return reverso;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("The longest word is: " + biggesttWord(s));
        System.out.println("The longest word size is: " + size(biggesttWord(s)));
        System.out.println("The second word is: " + secondDrow(s));

    }
}
