import java.util.*;
import java.util.stream.*;

class Book {
    private String genre;
    private int pages;

    Book(String genre, int pages) {
        this.genre = genre;
        this.pages = pages;
    }

    String getGenre() { 
        return genre; 
    }
    int getPages() { 
        return pages; 
    }
}

public class LibraryBookStatistics {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Fiction", 300));
        books.add(new Book("Fiction", 500));
        books.add(new Book("Science", 400));
        books.add(new Book("Science", 600));

        Map<String, IntSummaryStatistics> stats =books.stream().collect(Collectors.groupingBy(Book::getGenre,Collectors.summarizingInt(Book::getPages)));

        System.out.println(stats);
    }
}
