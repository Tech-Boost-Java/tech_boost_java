package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListDemo {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add(3, "Collections");
        strings.addFirst("Generics");
        strings.add("List");
        strings.add("Demo");
        strings.remove("Java");
        strings.remove(2);
        strings.removeLast();
        strings.removeFirst();

        System.out.println("List size: " + strings.size());

        System.out.println("List contains 'Hello': " + strings.contains("Hello"));
        for (String str : strings) {
            System.out.println(str);
        }

        System.out.println("List is empty: " + strings.isEmpty());
        strings.clear();

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }

    }
}

class NumberList{
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.set(2, 10);

        System.out.println("List size: " + numbers.size());
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();
           if(number % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println("List size after removing even numbers: " + numbers.size());

    }
}