package homework_pres;

public class SmallestNum {
    public static int findSmallest(int num1, int num2, int num3){
        int[] numbers = {num1, num2, num3};
        int smallest = numbers[0];
        for(int i : numbers){
            if(i < smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
}
