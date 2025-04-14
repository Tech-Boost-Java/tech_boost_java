import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class HW71 {


    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();

        Random rand = new Random();
        for(int i = 0; i <= 10; i++) {
            myCollection.add(rand.nextInt(201)-100);
        }
        System.out.println("myCollection: " + myCollection);

        int max = Collections.max(myCollection);
        int min = Collections.min(myCollection);
        int indexOfMax = 0;
        for(int i = 0; i <= 100; i++) {
            if(myCollection.get(i).equals(max)) {
                indexOfMax = i;
                break;
            }
        }
        int indexOfMin = 0;
        for(int i = 0; i <= 100; i++) {
            if(myCollection.get(i).equals(min)) {
                indexOfMin = i;
                break;
            }
        }
        System.out.println("Max:"+ max);
        System.out.println("Min:"+ min);
        myCollection.set(indexOfMin, max);
        myCollection.set(indexOfMax, min);
        System.out.println("replace min and max: " + myCollection);

        int randomNum = rand.nextInt(900)+100;
        for(int i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i) < 0) {
                myCollection.add(i, randomNum);
                break;
            }
        }
        System.out.println("2 myCollection: " + myCollection);

        for(int i = 0; i < myCollection.size() - 1; i++) {
            int curr = myCollection.get(i);
            int next = myCollection.get(i+1);
            if((curr < 0 && next >= 0) || (curr >= 0 && next < 0)) {
                myCollection.add(i+1, 0);
                i++;
            }
        }
        System.out.println("3 myCollection: " + myCollection);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Random random = new Random();
        int k = random.nextInt(myCollection.size()-1) + 1;
        for(int i = 0; i < k; i++) {
            list1.add(myCollection.get(i));
        }
        for(int i = myCollection.size()-1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        System.out.println("4 before myCollection: " + myCollection);
        boolean evennumb = false;
        for(int i = myCollection.size() -1; i >= 0 ; i--) {
            if(myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                evennumb = true;
                break;
            }
        }
        if(!evennumb) {
            System.out.println("MyCollection does not contain even numbers");
        }
        System.out.println("4 after myCollection: " + myCollection);

        System.out.println("5 before myCollection: " + myCollection);
        for(int i = 1; i< myCollection.size()-1; i++) {
            int prev = myCollection.get(i-1);
            int curr = myCollection.get(i);
            if(curr < prev && i+1 < myCollection.size()) {
                myCollection.remove(i+1);
                break;
            }
        }
        System.out.println("5 after myCollection: " + myCollection);
    }
}
