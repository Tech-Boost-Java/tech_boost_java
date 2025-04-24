package stream.optional;

/**
 * The Event class represents an event in the system.
 * It contains information about the event's ID, title, creator, and contact information.
 */
public class Event {
    private final String id;
    private final String title;
    private final User creator;
    private final ContactInfo contactInfo;

    public Event(String id, String title, User creator, ContactInfo contactInfo) {
        this.id = id;
        this.title = title;
        this.creator = creator;
        this.contactInfo = contactInfo;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public User getCreator() {
        return creator;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }
}
