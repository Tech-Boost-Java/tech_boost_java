package practicalTasks;
import java.util.Arrays;
import java.util.function.Consumer;
public class App {
    static Consumer<double[]> cons = arr -> {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 2) {
                arr[i] *= 0.8;
            } else {
                arr[i] *= 0.9;
            }
        }
    };

    public static double[] getChanged(double[] initialArray, Consumer<double[]> operation) {
        double[] copy = initialArray.clone();
        operation.accept(copy);
        return copy;
    }

    public static void main(String[] args) {
        double[] original = {1.0, 2.0, 3.0, 4.0};

        double[] modified = App.getChanged(original, App.cons);

        System.out.println("Original array: " + Arrays.toString(original));
        System.out.println("Modified array: " + Arrays.toString(modified));
    }
}
