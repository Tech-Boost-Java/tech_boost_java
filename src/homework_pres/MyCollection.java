package homework_pres;

import java.util.*;

public class MyCollection{
    private List<Integer> myCollection;
    private int a;

    public MyCollection(int a) {
        this.myCollection = new ArrayList<>();
        this.a = a;
    }
    public void sortColl(){
        int maxElIndex = 0;
        int minElIndex = 0;
        for (int i = 0; i < a; i++) {
            if(myCollection.get(i) > myCollection.get(maxElIndex)){
                i = maxElIndex;
            }
            if(myCollection.get(i) < myCollection.get(maxElIndex)){
                i = minElIndex;
            }
        }
        int temp = myCollection.get(minElIndex);
        myCollection.set(minElIndex, myCollection.get(maxElIndex));
        myCollection.set(maxElIndex, temp);
    }
    public void fillColl(){
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            myCollection.add(random.nextInt(11) - 2);
        }
    }
    public List<Integer> insertBeforeNegative(){
        Random random = new Random();
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if(myCollection.get(i) < 0){
                myCollection.add(i,100 + random.nextInt(999));
                break;
            }

        }
        return myCollection;
    }
    public List<Integer> insertZero(){
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if((myCollection.get(i) < 0 && myCollection.get(i + 1) > 0) || (myCollection.get(i) > 0 && myCollection.get(i + 1) < 0)){
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        return myCollection;
    }
    public void copyMyCollection(int k) {
        List<Integer> list1 = new ArrayList<>(k);
        List<Integer> list2 = new ArrayList<>(k);

        if (k < myCollection.size()) {
            for (int i = 0; i < k; i++) {
                list1.add(myCollection.get(i));
            }
            for (int i = k; i < myCollection.size(); i++) {
                list2.add(myCollection.get(i));
            }
            Collections.reverse(list2);
        }
        System.out.println("list1: " + list1);
        System.out.println("list2: " +list2);
    }

    public void removeLastPositive(){
        int last = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i) != 0 && myCollection.get(i) % 2  == 0){
                last = i;
            }
            else{
                System.out.println("massage");
            }
        }
        myCollection.remove(last);
        System.out.println("collection with removed last even: " + myCollection);
    }
    public void follTheFirstMin(){
        int minElIndex = 0;
        int i;
        for (i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i) < myCollection.get(minElIndex)){
                minElIndex = i;
                break;
            }
            break;
        }
        minElIndex++;
        if(minElIndex != myCollection.size() - 1){
            myCollection.remove(minElIndex);
        }
        System.out.println("We removed the element following the first minimum:" + myCollection);
    }

    public List<Integer> getMyCollection() {
        return myCollection;
    }

}

