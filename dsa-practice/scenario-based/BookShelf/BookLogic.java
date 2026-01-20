import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

public class BookLogic {

    // genre → list of books
    private Map<String, LinkedList<Book>> catalog = new HashMap<>();

    // Add book (duplicates allowed)
    public void addBook(String genre, Book book) {
        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        System.out.println("Added: " + book + " to " + genre);
    }

    // Borrow book (remove one occurrence)
    public void borrowBook(String genre, Book book) {
        LinkedList<Book> books = catalog.get(genre);

        if (books != null && books.remove(book)) {
            System.out.println("Borrowed: " + book);
        } else {
            System.out.println("Book not available");
        }
    }

    // Display catalog
    public void display() {
        System.out.println("\nLibrary Catalog:");
        for (String genre : catalog.keySet()) {
            System.out.println(genre + " : " + catalog.get(genre));
        }
    }
}
