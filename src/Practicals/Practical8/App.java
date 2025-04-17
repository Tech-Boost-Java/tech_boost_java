package Practicals.Practical8;

import java.util.function.Consumer;

public class App {

    private static Consumer<double[]> cons = array -> {
        for ( int i = 0; i < array.length; i++ ) {
            if ( array[i] > 2)
                array[i] *= 0.8;
            else
                array[i] *= 0.9;
        }
    };

    public static double[] getChanged(double[] initialArray, Consumer<double[]> cons) {
        double[] newArray = initialArray.clone();
        cons.accept(newArray);
        return newArray;
    }

    public static void main(String[] args) {
        double[] original = {1.5, 2.0, 2.5, 3.0};
        double[] changed = getChanged(original, cons);

        System.out.println("Original:");
        for (double d : original) {
            System.out.print(d + " ");
        }

        System.out.println("\nChanged:");
        for (double d : changed) {
            System.out.print(d + " ");
        }
    }

}

