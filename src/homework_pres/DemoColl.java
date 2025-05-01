package homework_pres;

public class DemoColl {
    public static void main(String[] args) {MyCollection myCollection = new MyCollection(10);
        myCollection.fillColl();
        System.out.println("Collection: " + myCollection.getMyCollection());
        System.out.println("Added negative: " + myCollection.insertBeforeNegative());
        System.out.println("Added zero: " + myCollection.insertZero());
        myCollection.copyMyCollection(8);
        myCollection.removeLastPositive();
        myCollection.follTheFirstMin();
    }
}

