package homework.hw2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task1 {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        System.out.println("Enter set1 (through spaces): ");
        String[] input1 = scanner.nextLine().split(" ");
        Collections.addAll(set1, input1);

        System.out.println("Enter set1 (through spaces): ");
        String[] input2 = scanner.nextLine().split(" ");
        Collections.addAll(set2, input2);

        scanner.close();

        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersect: " + intersect(set1, set2));
    }
}
