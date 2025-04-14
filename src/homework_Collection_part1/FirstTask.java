package homework_Collection_part1;

import java.util.*;

public class FirstTask {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter 10 integer numbers: ");
        List<Integer> myCollection = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            myCollection.add(scanner.nextInt());
        }
        int indexMax = myCollection.indexOf(Collections.max(myCollection));
        int indexMin = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, indexMin, indexMax);

        System.out.println("My collection after swap maximum and minimum elements:\n" + myCollection);

        Random random = new Random();

        int indexFirstNegative = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                indexFirstNegative = i;
            }
        }

        if (indexFirstNegative != -1) {
            myCollection.add(indexFirstNegative, random.nextInt(100, 999));

        }

        System.out.println("My collection after inserting random number before the first negative element:\n" + myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) * myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }

        System.out.println("My collection after inserting a zero between all two elements whit different signs:\n" + myCollection);

        System.out.print("Enter number k in renge 1 to " + myCollection.size() + ": ");
        int k = scanner.nextInt();

        if (k <= 0 || k > myCollection.size()) {
            System.out.println("Invalid number");
        } else {
            List<Integer> list1 = myCollection.subList(0, k);
            List<Integer> list2 = myCollection.subList(k, myCollection.size()).reversed();

            System.out.println("List1: " + list1);
            System.out.println("List2: " + list2);
        }

        List<Integer> evenElement = myCollection.stream().filter(element -> element % 2 == 0).toList();

        if (evenElement.isEmpty())
            System.out.println("My collection doesn't contain any even elements");
        else {
            myCollection.remove(evenElement.getLast());
            System.out.println("My collection after removing last even elements:\n" + myCollection);
        }

        indexMin = myCollection.indexOf(Collections.min(myCollection));

        if (indexMin == myCollection.size() - 1)
            System.out.println("Minimal element is last one. Nothing to remove");
        else {
            myCollection.remove(indexMin + 1);
            System.out.println("My collection after removing element following the minimal element:\n" + myCollection);
        }
        scanner.close();
    }
}
