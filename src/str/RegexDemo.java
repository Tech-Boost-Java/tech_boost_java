package str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String text = "Hello, my name is John Doe. I am 27 years old. I live in New York.";
        String regex = "\\d+";//matches one or more digits
        String replacement = "XX";//replace all digits with XX
        String result = text.replaceAll(regex, replacement);
        System.out.println(result);

        //regex
        String numberPhone = "123-456-7890";
        System.out.println(numberPhone.matches("\\d{3}-\\d{3}-\\d{4}"));//regex for phone number

        Pattern pattern = Pattern.compile("(\\d{3})-(\\d{3})-(\\d{4})");//regex for phone number using groups
        Matcher matcher = pattern.matcher(numberPhone);

        if (matcher.find()){
            System.out.println("First group is " + matcher.group(1));
            System.out.println("Second group is " + matcher.group(2));
            System.out.println("Third group is " + matcher.group(3));
        }
        //regex for email
        String[] emails = {"emailExample03@gmail.com","emailExample03gmail.com","emailExample03@gmailcom" };
        String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";//alternative regex for email is "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"

        for (String email : emails) {
            if (email.matches(regexEmail)) {
                System.out.println(email + " is a valid email address");
            } else {
                System.out.println(email + " is not a valid email address");
            }
        }
        //regex for validating a password
        String[] passwords = {"$Password123!", "password", "PASSWORD", "12345678", "Password123", "Password123!"};

        for (String password : passwords) {
            System.out.println(password + " is " + (isValidPassword(password) ? "valid" : "invalid") + " password");
        }

    }
    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return password.matches(regex);
    }


}
