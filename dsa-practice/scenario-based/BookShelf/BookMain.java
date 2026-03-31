public class BookMain {
    public static void main(String[] args) {

        BookLogic library = new BookLogic();

        Book b1 = new Book("Clean Code", "Robert Martin");
        Book b2 = new Book("Clean Code", "Robert Martin"); // duplicate allowed

        library.addBook("Programming", b1);
        library.addBook("Programming", b2);

        library.display();

        library.borrowBook("Programming", b1);

        library.display();
    }
}
