package homework3;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
public class task1 {
    public static void main( String[] args ){
        List<Integer> myCollection = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        //Swap the maximum and minimum elements in the list.
        int num;
        for(int i = 0; i < 10; i++){
            num = scan.nextInt();
            myCollection.add(num);
        }
        int min = Collections.min(myCollection);
        int max = Collections.max(myCollection);
        int minIndex = myCollection.indexOf(min);
        int maxIndex = myCollection.indexOf(max);
        myCollection.set(minIndex, max);
        myCollection.set(maxIndex, min);
        //Insert a random three-digit number before the first negative element of the list
        Random random = new Random();
        int value = random.nextInt(900) + 100;
        for(int i = 0; i < myCollection.size(); i++){
            if(myCollection.get(i) < 0) {
                myCollection.add(i, value);
                break;
            }
        }
        //Insert a zero between all neighboring elements collection myCollection with different signs
        for(int i = 0; i < myCollection.size(); i++){
            if(myCollection.get(i) < 0 && myCollection.get(i - 1)>=0){
                myCollection.add(i, 0);
                i++;
            }
        }
        //Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.
        List<Integer> list1 = new ArrayList<>();
        System.out.print("Enter number: ");
        int num3 = scan.nextInt();
        for(int i = 0; i < num3; i++){
            int temp = myCollection.get(i);
            list1.add(i, temp);
        }
        System.out.print("List1: ");
        for(int nums1 : list1){
            System.out.print(nums1 + " ");
        }
        System.out.println("");
        int j = 0;
        List<Integer> list2 = new ArrayList<>();
        for(int i = myCollection.size() - 1; i >= num3; i--){
            int num4 = myCollection.get(i);
            list2.add(j, num4);
            j++;
        }
        System.out.print("List2: ");
        for(int nums2 : list2){
            System.out.print(nums2 + " ");
        }
        System.out.println("");
        System.out.print("myCollection: ");
        for(int nums : myCollection){
            System.out.print(+ nums + " ");
        }
        //In a list myCollection remove the last even element
        boolean p = false;
        for (int i = myCollection.size(); i>=0 ; i--) {
            if(myCollection.get(i) % 2 == 0){
                myCollection.remove(i);
                p = true;
            }
        }
        if(!p){
            System.out.println("Does not have a paired element");
        }
    }
}

