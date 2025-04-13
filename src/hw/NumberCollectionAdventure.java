package hw;
import java.util.*;

public class NumberCollectionAdventure {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(Arrays.asList(5, -3, 12, 8, -7, 15, 4, 23, 0, 9));
        System.out.println("Initial: " + myCollection);

        //swap max and min
        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, maxIndex, minIndex);
        System.out.println("Swap max/min: " + myCollection);

        //insert random 3-digit number before first negative
        int firstNegativeIndex = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        if (firstNegativeIndex != -1) {
            int rand = 100 + new Random().nextInt(900);
            myCollection.add(firstNegativeIndex, rand);
        }
        System.out.println("Insert 3-digit: " + myCollection);

        //insert 0 between elements with different signs
        for (int i = 0; i < myCollection.size() - 1; i++) {
            int a = myCollection.get(i);
            int b = myCollection.get(i + 1);
            if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        System.out.println("Zeros inserted: " + myCollection);

        //copy first k to list1, rest reversed to list2
        int k = 5;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, Math.min(k, myCollection.size())));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(Math.min(k, myCollection.size()), myCollection.size()));
        Collections.reverse(list2);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        //remove last even
        boolean removed = false;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                removed = true;
                break;
            }
        }
        if (!removed) System.out.println("No even element to remove.");
        System.out.println("After remove even: " + myCollection);

        //remove element after first minimum
        int min = Collections.min(myCollection);
        int minPos = myCollection.indexOf(min);
        if (minPos < myCollection.size() - 1) {
            myCollection.remove(minPos + 1);
        }
        System.out.println("After remove after min: " + myCollection);
    }
}
