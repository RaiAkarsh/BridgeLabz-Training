public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Contact contact=new Contact("John","Doe","123 Main St","Springfield","IL","62701","555-1234","tgtgt");
        AddContacts addContacts=new AddContacts();
        addContacts.addContact(contact);
    }
}
