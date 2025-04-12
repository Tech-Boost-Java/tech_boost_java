package homework2;
import java.util.Scanner;
public class task1 {
    String word1 = " ";
    String word2 = " ";
    public void longestWord(String [] str){
        int max = 0;
        for(String string : str){
            if(string.length() > max){
                max = string.length();
                word1 = string;
            }
        }
        System.out.println(word1 + " is the longest word: " + max + " letters");
    }
    public String reverseWord(String [] str){
        int i = 0;
        for(String string : str){
            if(i == 1){
                word2 = string;
                break;
            }
            i++;
        }
        return word2;
    }
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        task1 sentence = new task1();
        System.out.print("Enter text: ");
        String text = scan.nextLine();
        String [] str = text.split(" ");
        if(str.length != 5){
            System.out.println("The sentence should be no more than five words. Type the sentence again");
            System.exit(0);
        }
        sentence.longestWord(str);
        String secondWord = sentence.reverseWord(str);
        String reverse = new StringBuilder(secondWord).reverse().toString();
        System.out.println(reverse);
    }
}

