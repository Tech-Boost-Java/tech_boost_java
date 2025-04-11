package Homework_collections1;

import java.util.*;

public class ex1 {
    private static void fillCollection(List<Integer> collection, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            collection.add(random.nextInt(201) - 100); // -100 to 100
        }
    }

    private static void swapMaxAndMin(List<Integer> collection) {
        if (collection == null || collection.size() <= 1) {
            return;
        }

        int minIndex = 0;
        int maxIndex = 0;
        int min = collection.get(0);
        int max = collection.get(0);

        for (int i = 1; i < collection.size(); i++) {
            int current = collection.get(i);

            if (current < min) {
                min = current;
                minIndex = i;
            }

            if (current > max) {
                max = current;
                maxIndex = i;
            }
        }

        Collections.swap(collection, minIndex, maxIndex);
    }

    private static void insertBeforeFirstNegative(List<Integer> collection) {
        Random random = new Random();
        int randomThreeDigit = random.nextInt(900) + 100; // 100 to 999

        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) < 0) {
                collection.add(i, randomThreeDigit);
                return;
            }
        }
    }

    private static void insertZeroBetweenDifferentSigns(List<Integer> collection) {
        if (collection == null || collection.size() <= 1) {
            return;
        }

        for (int i = 0; i < collection.size() - 1; i++) {
            int current = collection.get(i);
            int next = collection.get(i + 1);

            if ((current >= 0 && next < 0) || (current < 0 && next >= 0)) {
                collection.add(i + 1, 0);
                i++;
            }
        }
    }

    private static void splitList(List<Integer> collection, int k, List<Integer> list1, List<Integer> list2) {
        if (collection == null) {
            return;
        }

        for (int i = 0; i < k; i++) {
            list1.add(collection.get(i));
        }

        for (int i = collection.size() - 1; i >= k; i--) {
            list2.add(collection.get(i));
        }
    }

    private static boolean removeLastEven(List<Integer> collection) {
        if (collection == null || collection.isEmpty()) {
            System.out.println("Collection is empty, no even element to remove.");
            return false;
        }

        int lastEvenIndex = -1;

        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) % 2 == 0) {
                lastEvenIndex = i;
            }
        }

        if (lastEvenIndex != -1) {
            collection.remove(lastEvenIndex);
            return true;
        } else {
            System.out.println("No even elements found in the collection.");
            return false;
        }
    }

    private static void removeAfterFirstMin(List<Integer> collection) {
        if (collection == null || collection.size() <= 1) {
            return;
        }

        int minValue = Collections.min(collection);
        int minIndex = collection.indexOf(minValue);

        if (minIndex < collection.size() - 1) {
            collection.remove(minIndex + 1);
        } else {
            System.out.println("Minimum element is the last one, nothing to remove.");
        }
    }

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        fillCollection(myCollection, 10);
        System.out.println(myCollection);

        swapMaxAndMin(myCollection);
        System.out.println(myCollection);

        insertBeforeFirstNegative(myCollection);
        System.out.println(myCollection);

        insertZeroBetweenDifferentSigns(myCollection);
        System.out.println(myCollection);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        splitList(myCollection, 3, list1, list2);
        System.out.println(list1);
        System.out.println(list2);

        removeLastEven(myCollection);
        System.out.println(myCollection);

        removeAfterFirstMin(myCollection);
        System.out.println(myCollection);
    }
}
