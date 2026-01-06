import java.util.*;
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}
public class PhoneContatOrganizer {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        List<String> contacts = new ArrayList<>();
        System.out.println("Enter contact name and phone number (or type 'exit' to finish):");
        while (true) {
            System.out.print("Name: ");
            String name = x.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Phone Number: ");
            String phoneNumber = x.nextLine();
            try {
                if (phoneNumber.length() != 10 || !phoneNumber.matches("\\d+")) {
                    throw new InvalidPhoneNumberException("Invalid phone number: " + phoneNumber);
                }
                boolean duplicate = false;
                for (String contact : contacts) {
                    if (contact.endsWith(phoneNumber)) {
                        duplicate = true;
                        break;
                    }
                }
                if (duplicate) {
                    System.out.println("Duplicate contact with phone number: " + phoneNumber);
                } else {
                    contacts.add(name + " - " + phoneNumber);
                    System.out.println("Contact added: " + name + " - " + phoneNumber);
                }
            } catch (InvalidPhoneNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
