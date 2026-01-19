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
            System.out.println("4. Search Person by City or State");
            System.out.println("5. Count Persons by City or State");
            System.out.println("6. Exit");
            System.out.println("Choose an option: ");

            int mainChoice = x.nextInt();
            x.nextLine();

            switch (mainChoice) {

                case 1:
                    System.out.println("Enter Address Book Name: ");
                    String name = x.nextLine();
                    addressBooks.add(new AddressBook(name));
                    System.out.println("AddressBook '" + name + "' created.");
                    break;

                case 2:
                    if (addressBooks.isEmpty()) {
                        System.out.println("No AddressBook exists.");
                        break;
                    }

                    System.out.println("Enter AddressBook name to open: ");
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
                    System.out.println("Enter City or State to search: ");
                    String location = x.nextLine();
                    searchAcrossAllBooks(location);
                    break;

                case 5:
                    System.out.println("Enter City or State to count: ");
                    String countLocation = x.nextLine();
                    countAcrossAllBooks(countLocation);
                    break;

                case 6:
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
            System.out.println("Choose option: ");

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
                    System.out.print("Enter field to edit:(firstname, lastname, address, city, state, zip, phonenumber, email) ");
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

    static void searchAcrossAllBooks(String location) {

        boolean found = false;

        for (AddressBook book : addressBooks) {

            System.out.println("\nAddressBook: " + book.getBookName());

            book.getContactService().searchByCityOrState(location);
            found = true;
        }

        if (!found) {
            System.out.println("No contacts found.");
        }
    }

    static void countAcrossAllBooks(String location) {

        int total = 0;

        for (AddressBook book : addressBooks) {

            int count = 0;

            for (Contact contact : book.getContactService().contactList) {

                if (contact.getCity().equalsIgnoreCase(location)
                        || contact.getState().equalsIgnoreCase(location)) {
                    count++;
                }
            }

            System.out.println("AddressBook: " + book.getBookName() + " → " + count + " contacts");
            total += count;
        }

        System.out.println("Total contacts in " + location + " across all AddressBooks: " + total);
    }
}
