package stream.optional;


import static stream.optional.EventSystem.processContactEmail;
import static stream.optional.EventSystem.processCreatorEmail;

public class EventSystemApp {
    public static void main(String[] args) {

        User user1 = new User("Alice", "alice@event.com");
        User user2 = new User("Bob", null);
        ContactInfo contact1 = new ContactInfo("support@event.com");
        ContactInfo contact2 = new ContactInfo("invalid-email");

        Event event1 = new Event("1", "Team Meeting", user1, contact1);
        Event event2 = new Event("2", "Workshop", user2, contact2);
        Event event3 = new Event("3", "Conference", user1, null);

        System.out.println(processCreatorEmail(event1)); // Виведе: Creator Contact: alice@event.com
        System.out.println(processCreatorEmail(event2)); // Виведе: No valid creator email provided
        System.out.println(processContactEmail(event1)); // Виведе: Event Contact: support@event.com
        System.out.println(processContactEmail(event2)); // Виведе: No valid contact email provided
        System.out.println(processContactEmail(event3)); // Виведе: No valid contact email provided
    }
}
