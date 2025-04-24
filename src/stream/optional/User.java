package stream.optional;


public class User {
    private final String name;
    private final String email; // Can be null

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}