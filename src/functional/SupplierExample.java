package functional;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100);

        System.out.println("Random number: " + randomNumberSupplier.get());
        System.out.println("Random number: " + randomNumberSupplier.get());
    }
}
