package functional.ref;

import java.util.function.Consumer;
import java.util.function.ToIntFunction;

public class InstanceMethodRefExample {
    public static void main(String[] args) {
        Consumer<String> consumerPrint = System.out::println;
        String[] texts = {"Hello", "World", "!"};
        for (String text : texts) {
            consumerPrint.accept(text);
        }

        Consumer<String> consumerPrintLambda = text -> System.out.println(text);

        ToIntFunction<String> toIntFunctionLambda = text -> text.length();

        ToIntFunction<String> toIntFunction = String::length;
        String[] strings = {"Hello", "World", "!"};
        for (String str : strings) {
            int length = toIntFunction.applyAsInt(str);
            System.out.println("Length of '" + str + "' is: " + length);
        }

    }
}
