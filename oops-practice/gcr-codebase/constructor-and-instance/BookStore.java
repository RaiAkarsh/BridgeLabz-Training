class Book {
    String title;
    String author;
    double price;
    // Default constructor
    Book() {
        title = "";
        author = "";
        price = 0.0;
    }
    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display() {
        System.out.println(title + " | " + author + " | " + price);
    }
}
public class BookStore {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("1984", "George Orwell", 299.99);
        book1.display();
        book2.display();
    }
}