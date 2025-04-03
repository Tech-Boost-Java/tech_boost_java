package str;
/**
 * StringBuilderDemo
 * This class demonstrates the StringBuilder class in Java
 * StringBuilder is mutable
 * StringBuilder is faster than StringBuffer
 * StringBuilder is not thread-safe
 * StringBuilder is not synchronized
*
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        sb.append(" World");//appends the string to the end of the string
        System.out.println("After add: " + sb);
        sb.insert(5, " Java");//inserts the string at the specified index
        System.out.println("After insert: " + sb);
        sb.delete(5, 10);//deletes the string from the specified index
        System.out.println("After delete" + sb);
        sb.reverse();//reverses the string
        System.out.println(sb);
    }
}
