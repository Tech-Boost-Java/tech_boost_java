package homeworks.Collection_HW;

import java.util.*;

public class CollectionsHW1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(-100, 100));
        }
        System.out.println("Filled myCollection\n" + myCollection);

        int maxValue = Collections.max(myCollection);
        int minValue = Collections.min(myCollection);
        myCollection.set(myCollection.indexOf(maxValue), minValue);
        myCollection.set(myCollection.indexOf(minValue), maxValue);
        System.out.println("MyCollection with swapped min and max values\n" + myCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                if (i == 0) {
                    myCollection.addFirst(random.nextInt(100, 1000));
                }
                else {
                    myCollection.add(i, random.nextInt(100, 1000));
                }
                break;
            }
        }
        System.out.println("MyCollection with random three-digit number before first negative element\n" + myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            int current = myCollection.get(i);
            int next = myCollection.get(i + 1);

            if ((current < 0 && next >= 0) || (current >= 0 && next < 0)) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        System.out.println("MyCollection with 0 between neighboring elements with different signs\n" + myCollection);

        System.out.print("\nEnter k: ");
        int k = scanner.nextInt();
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()).reversed());
        System.out.println("Sublists with different order\n" + "list1: " + list1 + "\nlist2: " + list2);

        int lastEvenNumberIndex = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) % 2 == 0) { // The myCollection.get(i) % 2 == 0 && i != 0 is also possible
                lastEvenNumberIndex = i;
            }
        }
        if (lastEvenNumberIndex == -1) {System.out.println("myCollection doesn't contain even numbers");}
        else {myCollection.remove(lastEvenNumberIndex);}
        System.out.println("MyCollection without last even number(0 is also even)\n" + myCollection);

        int minValueIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
           if (myCollection.get(i) < myCollection.get(minValueIndex)) {
               minValueIndex = i;
           }
        }
        if (minValueIndex != myCollection.size() - 1) {myCollection.remove(minValueIndex + 1);}
        System.out.println("MyCollection without element following the first minimum\n" + myCollection);


        scanner.close();
    }
}

/*
1. Declare collection myCollection of 10 integers and fill it (from the console or random).
Swap the maximum and minimum elements in the list.
Insert a random three-digit number before the first negative element of the list
Insert a zero between all neighboring elements collection myCollection with different signs
Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.
In a list myCollection remove the last even element (if there are even elements in the list). If there is no such element, display a message.
Remove from the list myCollection the element following the first minimum. If the minimum element is the last one, nothing needs to be removed.
Use one or more of the next: List, ArrayList, LinkedList
 */
