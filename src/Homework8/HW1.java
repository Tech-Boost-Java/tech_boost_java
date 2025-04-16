package Homework8;

public class HW1 {
    public static String encrypt(String s, int n){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if(Character.isLowerCase(letter)) {
                char enc = (char) ('a' + (letter - 'a' + n) % 26);
                builder.append(enc);
            }
            else if(Character.isUpperCase(letter)) {
                char enc = (char) ('A' + (letter - 'A' + n) % 26);
                builder.append(enc);
            }
            else{
                builder.append(letter);
            }
        }

        return builder.toString();
    }

    public static String decrypt(String s, int n){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if(Character.isLowerCase(letter)) {
                char enc = (char) ('a' + (letter - 'a' - n + 26) % 26);
                builder.append(enc);
            }
            else if(Character.isUpperCase(letter)) {
                char enc = (char) ('A' + (letter - 'A' - n + 26) % 26);
                builder.append(enc);
            }
            else{
                builder.append(letter);
            }
        }

        return builder.toString();
    }
    public static void main(String[] args) {
        String text = "Hello World";
        int number = 3;

        String encrypted = encrypt(text, number);
        System.out.println("encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, number);
        System.out.println("decrypted: " + decrypted);
    }
}
