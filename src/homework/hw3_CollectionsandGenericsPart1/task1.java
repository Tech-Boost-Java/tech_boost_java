package homework.hw3_CollectionsandGenericsPart1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            myCollection.add(scanner.nextInt());
        }
        // 1
        int minValue = Integer.MAX_VALUE, maxValue = Integer.MIN_VALUE;
        int minIndex = 0, maxIndex = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < minValue) {
                minValue = myCollection.get(i);
                minIndex = i;
            }
            if (myCollection.get(i) > maxValue) {
                maxValue = myCollection.get(i);
                maxIndex = i;
            }
        }

        int temp = myCollection.get(minIndex);
        myCollection.set(minIndex, myCollection.get(maxIndex));
        myCollection.set(maxIndex, temp);

        System.out.println("Modified list after step 1: " + myCollection);

        // 2
        Random rand = new Random();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, rand.nextInt(900) + 100);
                break;
            }
        }
        System.out.println("Modified list after step 2: " + myCollection);

        // 3
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) >= 0 && myCollection.get(i + 1) < 0) || (myCollection.get(i) < 0 && myCollection.get(i + 1) >= 0)) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        System.out.println("Modified list after step 3: " + myCollection);

        // 4
        System.out.println("Splitting the list into two parts based on k");
        System.out.println("Enter number k: ");
        int k = scanner.nextInt();

        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>();
        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        // 5
        boolean removed = false;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("No even numbers in collection");
        }
        System.out.println("Modified list after step 5: " + myCollection);

        // 6
        int elementAfterMin = myCollection.indexOf(myCollection.stream().min(Integer::compareTo).get());
        if (elementAfterMin != myCollection.size() - 1) {
            myCollection.remove(elementAfterMin + 1);
        }

        System.out.println("Modified list after step 6: " + myCollection);
    }

}
