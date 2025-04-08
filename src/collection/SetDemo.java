package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // Create a set of integers
        Set<Integer> set = new HashSet<>();// HashSet allows duplicates and is unordered
        // Set<Integer> set = new LinkedHashSet<>(); // LinkedHashSet maintains insertion order

        // Add elements to the set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(null); // Adding null is allowed in HashSet

        // Print the size of the set
        System.out.println("Size of the set: " + set.size());

        // Check if the set contains a specific element
        System.out.println("Set contains 3: " + set.contains(null));

        // Remove an element from the set
        set.remove(2);

        // Print the elements in the set
        System.out.println("Elements in the set: " + set);

        // Clear the set
       set.clear();

        // Check if the set is empty
      System.out.println("Set is empty: " + set.isEmpty());
    }
}
