package arr;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {2, -5, 7, -4, 8};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }
}