package functional;

public class AnonimusExample {

    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello(String text) {
                System.out.println("Hello, World!" + text);
            }
        };
        greeting.sayHello("Anonymous class!");

        Greeting greetingLambda = message -> System.out.println("Hello, Lambda!" + message);
        greetingLambda.sayHello(" This is a lambda expression!");
        greetingLambda.sayGoodbye();
    }

}

@FunctionalInterface
interface Greeting {
    void sayHello(String text);

    default void sayGoodbye(){
        System.out.println("Goodbye!");
    }; // This method is not abstract, but it doesn't affect the functional interface status
}
