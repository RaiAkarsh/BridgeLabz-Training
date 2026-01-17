import java.util.*;

public class AddressBookMain {

    static List<String> bookNames = new ArrayList<>();
    static List<ContactService> books = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner x = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {

            System.out.println("\nMain Menu:");
            System.out.println("1. Create AddressBook");
            System.out.println("2. Select AddressBook");
            System.out.println("3. Show All AddressBooks");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            int mainChoice = x.nextInt();
            x.nextLine();

            switch (mainChoice) {

                case 1:
                    System.out.print("Enter AddressBook Name: ");
                    String name = x.nextLine();
                    bookNames.add(name);
                    books.add(new ContactService());
                    System.out.println("AddressBook '" + name + "' created.");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No AddressBook exists.");
                        break;
                    }

                    System.out.print("Enter AddressBook name to open: ");
                    String search = x.nextLine();

                    int index = bookNames.indexOf(search);

                    if (index != -1) {
                        manageContacts(books.get(index));
                    } else {
                        System.out.println("Invalid AddressBook.");
                    }
                    break;

                case 3:
                    for (String n : bookNames) {
                        System.out.println("- " + n);
                    }
                    break;

                case 4:
                    continueProgram = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void manageContacts(ContactService contactService) {

        Scanner x = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {

            System.out.println("\nMenu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Back");
            System.out.println("Choose an option: ");

            int choice = x.nextInt();
            x.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter contact details:");
                    System.out.print("First Name: ");
                    String firstName = x.nextLine();
                    System.out.print("Last Name: ");
                    String lastName = x.nextLine();
                    System.out.print("Address: ");
                    String address = x.nextLine();
                    System.out.print("City: ");
                    String city = x.nextLine();
                    System.out.print("State: ");
                    String state = x.nextLine();
                    System.out.print("Zip: ");
                    String zip = x.nextLine();
                    System.out.print("Phone Number: ");
                    String phoneNumber = x.nextLine();
                    System.out.print("Email: ");
                    String email = x.nextLine();

                    Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    contactService.addContact(contact);
                    break;

                case 2:
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
                    continueProgram = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
