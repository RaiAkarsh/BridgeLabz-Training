import java.util.*;
public class AddContacts {
    List<Contact> contactList=new ArrayList<>();

    void addContact(Contact contact){
        contactList.add(contact);
    }
    void editContact(String firstName, String field, String newValue) {
        for (Contact contact : contactList) {
            if (contact.getFirstName().equals(firstName)) {
                switch (field.toLowerCase()) {
                    case "firstname":
                        contact.setFirstName(newValue);
                        break;
                    case "lastname":
                        contact.setLastName(newValue);
                        break;
                    case "address":
                        contact.setAddress(newValue);
                        break;
                    case "city":
                        contact.setCity(newValue);
                        break;
                    case "state":
                        contact.setState(newValue);
                        break;
                    case "zip":
                        contact.setZip(newValue);
                        break;
                    case "phonenumber":
                        contact.setPhoneNumber(newValue);
                        break;
                    case "email":
                        contact.setEmail(newValue);
                        break;
                    default:
                        System.out.println("Invalid field: " + field);
                }
                return; 
            }
        }
        System.out.println("Contact with first name " + firstName + " not found.");
    }
}
