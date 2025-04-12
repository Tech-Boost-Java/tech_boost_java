package homeworks.FunctionalProgramming;

public class FunctionalProgrammingHW1 {
    public static void main(String[] args) {
        String demo = "abc";
        String res = encrypt(demo, 3);

        System.out.println(res);
        System.out.println(decrypt(res, 3));
    }

    public static String encrypt(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            res.append((char) (s.charAt(i) + n));
        }
        return res.toString();
    }

    public static String decrypt(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            res.append((char) (s.charAt(i) - n));
        }
        return res.toString();
    }
}

/*
1. Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
Method encrypt should take a string and return coded string where every letter is moved
on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
return decoded value
 */
