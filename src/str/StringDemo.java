package str;

/**
 * String class demo
 * String is immutable
 * String pool
 * String methods
 *
 */
public class StringDemo {
    public static void main(String[] args) {
        //Ways to create a string
        String str1 = "Hello";//Hello -> string pool
        String str2 = " ";//Hello -> string pool
        String str3 = "Hello"; //Hello -> string pool
        String str4 = new String("hello");//creates a new object in the heap memory
        //but constructor is not necessary, because the string is already created in the string pool

        //Comparing strings
        System.out.println(str1 == str3); // true -> compares the references
        System.out.println(str1.equals(str3)); // true -> compares the values
        System.out.println(str3.equalsIgnoreCase(str4)); // true -> compares the values ignoring the case

        //compareTo() -> lexicographically compares by Unicode values of the characters
        // returns an integer value
        System.out.println(str1.compareTo(str4));//-32
        System.out.println("abc".compareTo("def"));//-3
        System.out.println(str3.compareToIgnoreCase(str4));//0

        //String methods
        System.out.println(str1.length());// returns the length of the string
        System.out.println(str1.charAt(4));// returns the character at the specified index
        System.out.println(str2.isEmpty());// returns true if the string is empty
        System.out.println(str2.isBlank());// returns true if the string is empty or contains only white spaces

        //Substring
        String str5 = "Text for testing";
        System.out.println(str5.substring(5));// returns a substring from the specified index
        System.out.println(str5.substring(5, 10));// returns a substring from the specified index to the end index

        //Concatenation
        String str6 = str1.concat(" World!");
        System.out.println(str6);//Hello World!

        String str7 = str5.replace(' ', '_');
        System.out.println(str7);//Text_for_testing
        System.out.println(str7.toUpperCase());//TEXT_FOR_TESTING
        System.out.println(str7.toLowerCase());//text_for_testing

        //String from char array
        char[] chA = {'A', 'B', 'C', 'D', 'E', 'F'};
        String str8 = new String(chA, 2, 4);//CDEF, 2 - starting index, 4 - length
        System.out.println(str8);

        //indexOf() and contains()
        System.out.println(str5.indexOf('l'));//-1 if not found
        System.out.println(str5.indexOf("test"));//10

        System.out.println(str5.contains("test"));//true

        //trim() -> removes leading and trailing white spaces
        //strip() -> removes leading and trailing white spaces
        //stripLeading() -> removes leading white spaces

        System.out.println("\t\f\nText for demonstrate         ".trim() + " other text");
        System.out.println("\t\f\rText for demonstrate         ".strip() + " other text");
        System.out.println("\t\f\nText for demonstrate         ".stripLeading() + " other text");//removes leading white spaces

        //split() -> splits the string by the specified delimiter
        //as parameter can be used a regular expression
        String[] strArr = "Text_for_method_split()".split("_");

        for (String s : strArr) {
            System.out.print(s + " ");
        }
    }
}
