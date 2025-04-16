package homework.homework13;

public class Words {
    static final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    static final int ALPHABET_LEN = alphabet.length;

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            boolean isUpper = Character.isUpperCase(ch);
            char lowerChar = Character.toLowerCase(ch);

            int index = findIndexInAlphabet(lowerChar);
            if (index != -1) {
                int shiftedIndex = (index + shift) % ALPHABET_LEN;
                char encryptedChar = alphabet[shiftedIndex];
                result.append(isUpper ? Character.toUpperCase(encryptedChar) : encryptedChar);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, ALPHABET_LEN - (shift % ALPHABET_LEN));
    }

    private static int findIndexInAlphabet(char ch) {
        for (int i = 0; i < ALPHABET_LEN; i++) {
            if (alphabet[i] == ch) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        int shift = 3;

        String encrypted = encrypt(original, shift);
        String decrypted = decrypt(encrypted, shift);

        System.out.println("Original:  " + original);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
