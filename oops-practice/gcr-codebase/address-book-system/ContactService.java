import java.util.*;
public class ContactService {
    List<Contact> contactList=new ArrayList<>();

    void addContact(Contact contact){
        contactList.add(contact);
    }
    void editContact(String firstName, String field, String newValue) {
        for (Contact contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                switch (field.toLowerCase()) {
                    case "firstname":
                        contact.setFirstName(newValue);
                        System.out.println("First Name updated to: " + newValue);
                        break;
                    case "lastname":
                        contact.setLastName(newValue);
                        System.out.println("Last Name updated to: " + newValue);
                        break;
                    case "address":
                        contact.setAddress(newValue);
                        System.out.println("Address updated to: " + newValue);
                        break;
                    case "city":
                        contact.setCity(newValue);
                        System.out.println("City updated to: " + newValue);
                        break;
                    case "state":
                        contact.setState(newValue);
                        System.out.println("State updated to: " + newValue);
                        break;
                    case "zip":
                        contact.setZip(newValue);
                        System.out.println("Zip updated to: " + newValue);
                        break;
                    case "phonenumber":
                        contact.setPhoneNumber(newValue);
                        System.out.println("Phone Number updated to: " + newValue);
                        break;
                    case "email":
                        contact.setEmail(newValue);
                        System.out.println("Email updated to: " + newValue);
                        break;
                    default:
                        System.out.println("Invalid field: " + field);
                }
                return; 
            }
        }
        System.out.println("Contact with first name " + firstName + " not found.");
    }

    void deleteContact(String firstName){
        for(Contact contact:contactList){
            if(contact.getFirstName().equalsIgnoreCase(firstName)){
                contactList.remove(contact);
                System.out.println("Contact with first name " + firstName + " deleted.");
                return;
            }
        }
        System.out.println("Contact with first name " + firstName + " not found.");
    }
}
