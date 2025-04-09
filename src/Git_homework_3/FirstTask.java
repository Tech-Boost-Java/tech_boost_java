package Git_homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FirstTask {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();

        // Populate with 10 random numbers (0-99)
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(100));
        }

        // Swap min and max
        Collections.swap(myCollection,
                myCollection.indexOf(Collections.max(myCollection)),
                myCollection.indexOf(Collections.min(myCollection)));

        // Insert random on first negative
        int insertValue = random.nextInt(100, 1000);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, insertValue);
                break;
            }
        }

        // Insert random on sign change
        int signChangeValue = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i-1) * myCollection.get(i) < 0) {
                myCollection.add(i, signChangeValue);
                break;
            }
        }

        // Split into two lists (first k and reversed)
        int k = 3;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(list1);
        Collections.reverse(list2);

        // Remove evens
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                break;
            }
            if(i == 0){
                System.out.println("There is no even  number in list");
            }
        }

        // Remove next after min if exists
        if (!myCollection.isEmpty()) {
            int minIndex = myCollection.indexOf(Collections.min(myCollection));
            if (minIndex != -1 && minIndex < myCollection.size() - 1) {
                myCollection.remove(minIndex + 1); // Remove next element after min
            } else {
                System.out.println("Min is at the end; nothing to remove after it.");
            }
        }
    }
}