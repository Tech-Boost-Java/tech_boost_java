package homework.homework8;

import java.util.LinkedList;
import java.util.Random;

public class ListOfNums {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        Random randNum = new Random();
        for(int i = 0; i < 10; i++){
            myList.add(randNum.nextInt(21) - 10);
        }

        int max = 0, min = 0;
        for(Integer number : myList){
            if (number > max) max = number;
            if (number < min) min = number;
        }
        System.out.println(myList);

        int indexMin = myList.indexOf(min);
        int indexMax = myList.indexOf(max);
        Integer temp = min;
        myList.set(indexMin, max);
        myList.set(indexMax, temp);
        System.out.println(myList);

        int randThreeDigNum = randNum.nextInt(900) + 100;
        for(Integer number : myList){
            if(number < 0 && myList.indexOf(number) != 0) {
                myList.set(myList.indexOf(number) - 1, randThreeDigNum);
                break;
            }
        }
        System.out.println(myList);

        for(int i = 1; i < myList.size() - 1; i++){
            if((myList.get(i - 1) < 0 && myList.get(i + 1) > 0) || ((myList.get(i - 1) > 0 && myList.get(i + 1) < 0))) {
                myList.set(i, 0);
            }
        }
        System.out.println(myList);

        int k = 3;
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        for(int i = 0; i < k; i++){
            list1.add(myList.get(i));
        }
        for(int i = k; i < myList.size(); i++){
            list2.add(myList.get(i));
        }
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        for(int i = myList.size() - 1; i >= 0; i--){
            if(myList.get(i) % 2 == 0) {
                myList.remove(i);
                break;
            } else if (i == 0) System.out.println("There are no zeros in the list");
        }
        System.out.println(myList);

        int minEl = 0;
        for(Integer number : myList){
            if (number < minEl) minEl = number;
        }
        if(myList.indexOf(minEl) != myList.size() - 1) myList.remove(myList.indexOf(minEl) + 1);
        System.out.println(myList);
    }
}
