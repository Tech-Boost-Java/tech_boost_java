package functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });
        Collections.sort(names, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

        System.out.println("Sorted names by length: ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
