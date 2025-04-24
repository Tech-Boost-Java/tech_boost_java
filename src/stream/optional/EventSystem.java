package stream.optional;

import java.util.Optional;

/**
 * Class representing an event system that processes event data.
 */
public class EventSystem {
    // Method to get the email of the event creator
    public static Optional<String> getCreatorEmail(Event event) {
        return Optional.ofNullable(event.getCreator())
                .map(User::getEmail)
                .filter(email -> email != null && email.contains("@event.com"));
    }

    // Method to get the email from the contact information
    public static Optional<String> getContactEmail(Event event) {
        return Optional.ofNullable(event.getContactInfo())
                .map(ContactInfo::email)
                .filter(email -> email != null && email.contains("@event.com"));
    }

    public static String processCreatorEmail(Event event) {
        return getCreatorEmail(event)
                .map(email -> "Creator Contact: " + email.toLowerCase())
                .orElse("No valid creator email provided");
    }

    public static String processContactEmail(Event event) {
        return getContactEmail(event)
                .map(email -> "Event Contact: " + email.toLowerCase())
                .orElse("No valid contact email provided");
    }


}