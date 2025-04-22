import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class list_homework1 {
    /*
Declare collection myCollection of 10 integers and fill it (from the console or random).
Swap the maximum and minimum elements in the list.
Insert a random three-digit number before the first negative element of the list
Insert a zero between all neighboring elements collection myCollection with different signs
Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.
In a list myCollection remove the last even element (if there are even elements in the list). If there is no such element, display a message.
Remove from the list myCollection the element following the first minimum. If the minimum element is the last one, nothing needs to be removed.
Use one or more of the next: List, ArrayList, LinkedList
    * */
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(50) - 25);
        }

        System.out.println(myCollection);

        int maxListInteger = Collections.max(myCollection);
        int minListInteger = Collections.min(myCollection);
        int indexMax = myCollection.indexOf(maxListInteger);
        int indexMin = myCollection.indexOf(minListInteger);

        Collections.swap(myCollection, indexMax, indexMin);

        System.out.println(myCollection);

        for (int num : myCollection) {
            if (num < 0) {
                int indexOfFirstNegative = myCollection.indexOf(num);
                myCollection.add(indexOfFirstNegative, random.nextInt(-999, 999));
                break;
            }
        }

        System.out.println(myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            int x = myCollection.get(i);
            int y = myCollection.get(i + 1);
            if ((x < 0 && y > 0) || (x > 0 && y < 0)) {
                myCollection.add(i+1, 0);
                i++;
            }
        }

        System.out.println(myCollection);

        int k = 4;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, Math.min(k, myCollection.size())));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(Math.min(k, myCollection.size()), myCollection.size() ));
        list2 = list2.reversed();

        System.out.println(list1);
        System.out.println(list2);

        int lastEvenNumberIndex = -1;

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) % 2 == 0) {
                lastEvenNumberIndex = i;
            }
        }

        if (lastEvenNumberIndex != -1) {
            myCollection.remove(lastEvenNumberIndex);
        } else {
            System.out.println("No even number");
        }

        minListInteger = Collections.min(myCollection);
        indexMin = myCollection.indexOf(minListInteger);

        if (indexMin < myCollection.size() - 1) {
            myCollection.remove(indexMin + 1);
        }

        System.out.println(myCollection);


    }
}
