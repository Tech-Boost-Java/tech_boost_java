package functional;

public interface Messenger {
    void sendMessage(String message);

    void receiveMessage(String message);
}

class AnonimusExample01 {
    public static void main(String[] args) {
        Messenger messenger = new Messenger() {
            @Override
            public void sendMessage(String message) {
                System.out.println("Sending message: " + message);
            }

            @Override
            public void receiveMessage(String message) {
                System.out.println("Receiving message: " + message);
            }
        };

        messenger.sendMessage("Hello, World!");
        messenger.receiveMessage("Hello, Java!");
    }
}
