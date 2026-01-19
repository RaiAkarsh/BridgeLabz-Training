import java.util.*;

public class AddressBookMain {

    static List<AddressBook> addressBooks = new ArrayList<>();

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        boolean continueProgram = true;

        System.out.println("Welcome to Multi Address Book Program");

        while (continueProgram) {

            System.out.println("\nMain Menu:");
            System.out.println("1. Create New Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. Show All Address Books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int mainChoice = x.nextInt();
            x.nextLine();

            switch (mainChoice) {

                case 1:
                    System.out.print("Enter Address Book Name: ");
                    String name = x.nextLine();
                    addressBooks.add(new AddressBook(name));
                    System.out.println("Address Book '" + name + "' created.");
                    break;

                case 2:
                    if (addressBooks.isEmpty()) {
                        System.out.println("No AddressBook exists.");
                        break;
                    }

                    System.out.print("Enter AddressBook name to open: ");
                    String searchBook = x.nextLine();

                    AddressBook selectedBook = null;

                    for (AddressBook book : addressBooks) {
                        if (book.getBookName().equalsIgnoreCase(searchBook)) {
                            selectedBook = book;
                            break;
                        }
                    }

                    if (selectedBook != null) {
                        manageContacts(selectedBook.getContactService());
                    } else {
                        System.out.println("Invalid AddressBook.");
                    }
                    break;

                case 3:
                    for (AddressBook book : addressBooks) {
                        System.out.println("- " + book.getBookName());
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
        boolean manage = true;

        while (manage) {

            System.out.println("\nContact Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Back");
            System.out.print("Choose option: ");

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
                    String phone = x.nextLine();
                    System.out.print("Email: ");
                    String email = x.nextLine();

                    contactService.addContact(new Contact(firstName, lastName, address, city, state, zip, phone, email));
                    break;

                case 2:
                    System.out.print("Enter First Name of the contact to edit: ");
                    String editFirstName = x.nextLine();
                    System.out.print("Enter field to edit:(firstName, lastName, address, city, state, zip, phone, email) ");
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
                    manage = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
