class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    void display() {
        System.out.println(title + " | " + author + " | Available: " + available);
    }
}
public class LibraryBookTest {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("To Kill a Mockingbird", "Harper Lee", 150.0);
        LibraryBook book2 = new LibraryBook("The Great Gatsby", "F. Scott Fitzgerald", 200.0);
        book1.display();
        book2.display();
        book1.borrowBook();
        book1.display();
        book1.borrowBook();
    }
}