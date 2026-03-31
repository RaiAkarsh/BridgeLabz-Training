import java.lang.annotation.*;

// Custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

// Apply annotation to a class
@Author(name = "Author Name")
class Book {
}

// Main class
public class AnnotationRuntime {
    public static void main(String[] args) {

        // Get Class object
        Class<Book> cls = Book.class;
        Author author = cls.getAnnotation(Author.class);
        System.out.println("Author Name: " + author.name());
    }
}
