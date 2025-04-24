package functional.ref;

import java.util.function.Supplier;


public class ConstructorRef {
    public static void main(String[] args) {
        Supplier<StringBuilder> stringBuilderSupplier = StringBuilder::new;

        for (int i = 0; i < 5; i++) {
            StringBuilder sb = stringBuilderSupplier.get();
            sb.append("Hello ").append(i);
            System.out.println(sb.toString());
        }
    }
}
