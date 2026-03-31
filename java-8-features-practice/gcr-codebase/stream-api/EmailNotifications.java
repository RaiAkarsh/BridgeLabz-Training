import java.util.*;

public class EmailNotifications {
    public static void main(String[] args) {
        List<String> emailsList = List.of("akarsh@gmail.com", "krish@gmail.com", "arsh@gmail.com");
        emailsList.forEach(email -> sendEmailNotification(email));
    }
    public static void sendEmailNotification(String email) {
        System.out.println("Sent " + email);
    }
}