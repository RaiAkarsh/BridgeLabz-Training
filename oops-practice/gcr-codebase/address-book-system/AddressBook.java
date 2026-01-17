public class AddressBook {
    private String bookName;
    private ContactService contactService;

    public AddressBook(String bookName) {
        this.bookName = bookName;
        this.contactService = new ContactService();
    }

    public String getBookName() {
        return bookName;
    }

    public ContactService getContactService() {
        return contactService;
    }
    //setters 
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }
}
