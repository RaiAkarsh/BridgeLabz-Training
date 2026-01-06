interface Reservable {
    String reserveItem();
    String checkAvailability();
}
abstract class LibraryItem implements Reservable {
    private String title;
    private String author;
    private String itemId;
    LibraryItem(String title, String author, String itemId) {
        this.title = title;
        this.author = author;
        this.itemId = itemId;
    }
    public String reserveItem() {
        return "Reservation not available for this item type.";
    }
    public String checkAvailability() {
        return "Availability not applicable for this item type.";
    }
    abstract  int getLoanDuration();
     void  getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Availability: " + checkAvailability());
        System.out.println("Reserve Item: " + reserveItem());
        System.out.println("---------------------------");

        
    }
}
class Book extends LibraryItem {
    Book(String title, String author, String itemId) {
        super(title, author, itemId);
    }
    @Override
    int getLoanDuration() {
        return 14; 
    }
    @Override
    public String reserveItem() {
        return "Book reserved successfully.";
    }
    @Override
    public String checkAvailability() {
        return "Book is available.";
    }
}
class Magazine extends LibraryItem {
    Magazine(String title, String author, String itemId) {
        super(title, author, itemId);
    }
    @Override
    int getLoanDuration() {
        return 7; 
    }
    @Override
    public String reserveItem() {
        return "Magazine reservation not available.";
    }
    @Override
    public String checkAvailability() {
        return "Magazine is currently checked out.";
    }
}
class DVD extends LibraryItem {
    DVD(String title, String author, String itemId) {
        super(title, author, itemId);
    }
    @Override
    int getLoanDuration() {
        return 5; 
    }
    @Override
    public String reserveItem() {
        return "DVD reserved successfully.";
    }
    @Override
    public String checkAvailability() {
        return "DVD is available.";
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "B001");
        LibraryItem magazine = new Magazine("National Geographic", "Various", "M001");
        LibraryItem dvd = new DVD("Inception", "Christopher Nolan", "D001");

        book.getItemDetails();
        magazine.getItemDetails();
        dvd.getItemDetails();
    }
}
