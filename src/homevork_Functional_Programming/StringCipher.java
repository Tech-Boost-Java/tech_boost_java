package homevork_Functional_Programming;

public class StringCipher {
    public static String encrypt(String input, int n) {
        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c))
                output.append((char) ((c - 'A' + n) % 26 + 'A'));
            else if (Character.isLowerCase(c))
                output.append((char) ((c - 'a' + n) % 26 + 'a'));
            else
                output.append(c);
        }
        return output.toString();
    }

    public static String decrypt(String input, int n) {
        return encrypt(input, 26 - n % 26);
    }

    public static void main(String[] args) {
        String input = "abc";
        int n = 3;
        String encrypted = encrypt(input, n);
        System.out.println("Encrypted String: " + encrypted);

        String decrypted = decrypt(encrypted, n);
        System.out.println("Decrypted String: " + decrypted);
    }

}
