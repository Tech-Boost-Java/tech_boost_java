package stream.optional;

public record ContactInfo(String email) {
}
// This is the same class as above but using a traditional Java class definition.
//public class ContactInfo {
//    private final String email;
//
//    public ContactInfo(String email) {
//        this.email = email;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//}