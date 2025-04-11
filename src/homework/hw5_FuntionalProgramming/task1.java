package homework.hw5_FuntionalProgramming;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class task1 {

    public static @NotNull String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                char ch = (char) ((c - 'a' + n) % 26 + 'a');
                result.append(ch);
            } else if (Character.isUpperCase(c)) {
                char ch = (char) ((c - 'A' + n) % 26 + 'A');
                result.append(ch);
            } else {
                result.append(c); // залишає пробіли, розділові знаки тощо
            }
        }
        return result.toString();
    }

    public static @NotNull String decrypt(String s, int n) {
        return encrypt(s, 26 - (n % 26));
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        System.out.print("Enter shift (n): ");
        int shift = scanner.nextInt();
        scanner.close();

        String encrypted = encrypt(text, shift);
        String decrypted = decrypt(encrypted, shift);

        System.out.println("Encrypted : " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
