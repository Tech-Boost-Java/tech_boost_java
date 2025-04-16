package hw;
public class CasearCipher {
    public static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                char shifted = (char) ((c- base + n) % 26 + base);
                result.append(shifted);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - (n % 26));
    }

    public static void main(String[] args) {
        String original = "abc XYZ";
        int shift = 3;

        String encrypted = encrypt(original, shift);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("Decrypted: " + decrypted);
    }
}
