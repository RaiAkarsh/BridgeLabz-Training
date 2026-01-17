import java.util.*;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        boolean continueProgram = true;
        ContactService contactService=new ContactService();
        while(continueProgram) {
            System.out.println("Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");
            Scanner x=new Scanner(System.in);
            int choice=x.nextInt();
            x.nextLine();
            switch (choice) {
                case 1:
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
                    contactService.addContact(contact);
                    break;
                case 2: // edit the given contact based on first name , field to be edited and new value
                    System.out.print("Enter First Name of the contact to edit: ");
                    String editFirstName = x.nextLine();
                    System.out.print("Enter field to edit (firstname, lastname, address, city, state, zip, phonenumber, email): ");
                    String field = x.nextLine();
                    System.out.print("Enter new value: ");
                    String newValue = x.nextLine();
                    contactService.editContact(editFirstName, field, newValue);
                    break;
                case 3:
                    System.out.print("Enter First Name of the contact to delete: ");
                    String deleteFirstName = x.nextLine();
                    contactService.deleteContact(deleteFirstName);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    continueProgram = false;
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
