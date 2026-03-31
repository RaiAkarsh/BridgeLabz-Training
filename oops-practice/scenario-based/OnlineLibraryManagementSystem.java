import java.util.*;
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}
public class OnlineLibraryManagementSystem {
    public static void main(String[] args) {
        String[] titles = {"Java Programming","Data Structures","Cloud Computing"};
        String[] authors = {"James","Allen","Prince"};
        boolean[] available = {true,false,true};
        List<Integer> book = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            book.add(i);
        }
        displayBooks(titles, authors, available);
        searchBook(titles, "data");
        try {
            checkoutBook(titles, available, "Data Structures");
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
        displayBooks(titles, authors, available);
    }
    static void displayBooks(String[] titles, String[] authors, boolean[] available) {
        for (int i = 0; i < titles.length; i++) {
            System.out.println(
                titles[i] + "   " + authors[i] + "   " +
                (available[i] ? "Available" : "Checked Out")
            );
        }
    }
    static void searchBook(String[] titles, String keyword) {
        boolean found = false;
        for (String title : titles) {
            if (title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found: " + title);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found");
        }
    }
    static void checkoutBook(String[] titles, boolean[] available, String title) throws BookNotAvailableException {
        for (int i = 0; i < titles.length; i++) {
            if (titles[i].equalsIgnoreCase(title)) {
                if (!available[i]) {
                    throw new BookNotAvailableException(
                        "Book is already checked out"
                    );
                }
                available[i] = false;
                System.out.println("Book checked out successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }
}
