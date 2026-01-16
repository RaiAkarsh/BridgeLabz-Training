import java.util.*;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner x=new Scanner(System.in);
        System.out.println("Enter contact details:");
        System.out.print("First Name: ");
        String firstName=x.nextLine();
        System.out.print("Last Name: ");
        String lastName=x.nextLine();
        System.out.print("Address: ");
        String address=x.nextLine();
        System.out.print("City: ");
        String city=x.nextLine();
        System.out.print("State: ");
        String state=x.nextLine();
        System.out.print("Zip: ");
        String zip=x.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber=x.nextLine();
        System.out.print("Email: ");
        String email=x.nextLine();
        
        Contact contact=new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);
        AddContacts addContacts=new AddContacts();
        addContacts.addContact(contact);
        // edit the given contact based on first name , field to be edited and new value
        addContacts.editContact("John","address","456 Elm St");
    }
}
