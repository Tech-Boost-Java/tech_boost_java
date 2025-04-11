import java.util.Scanner;

public class SmallestNumber {
    int[] number = new int[3];
    String[] counter = {"first", "second", "third"};

    public void inputNumber() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < number.length; i++) {
            boolean isChecked = false;
            while (!isChecked) {
                try {
                    System.out.print("Input the " + counter[i] + " number: ");
                    int value = sc.nextInt();
                    this.number[i] = value;
                    isChecked = true;
                } catch (Exception e) {
                    System.out.println("Please enter an integer!");
                }
                sc.nextLine();
            }
        }
        sc.close();
    }

    private int getSmallestNumber() {
        int minI = 0;
        for (int i = 0; i < number.length; i++) {
            if (this.number[minI] > this.number[i]) {
                minI = i;
            }
        }
        return this.number[minI];
    }

    public void printResult() {
        int res = this.getSmallestNumber();
        System.out.println("The smallest number is " + res);
    }
}

