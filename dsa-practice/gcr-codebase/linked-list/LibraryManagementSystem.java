class Node {
    String bookTitle;
    String author;
    String genre;
    int bookID;
    boolean isAvailable;
    Node next;
    Node prev;

    public Node(String bookTitle, String author, String genre, int bookID, boolean isAvailable) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}
public class LibraryManagementSystem {
    private Node head;
    
    public LibraryManagementSystem(){
        this.head = null;
    }
    public void addBookFirst(String bookTitle, String author, String genre, int bookID, boolean isAvailable){
        Node newNode = new Node(bookTitle, author, genre, bookID, isAvailable);
        if(head != null){
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }
    public void addBookLast(String bookTitle, String author, String genre, int bookID, boolean isAvailable){
        Node newNode = new Node(bookTitle, author, genre, bookID, isAvailable);
        if(head == null){
            head = newNode;
        } 
        else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }
    public void addBookSpecify(String bookTitle, String author, String genre, int bookID, boolean isAvailable, int position){
        Node newNode = new Node(bookTitle, author, genre, bookID, isAvailable);
        if(position == 1){
            addBookFirst(bookTitle, author, genre, bookID, isAvailable);
            return;
        }
        Node current = head;
        for(int i = 1; i < position - 1; i++){
            if(current == null){
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        if(current.next != null){
            current.next.prev = newNode;
        }
        current.next = newNode;
    }
    public void deleteBook(int bookID){
        if(head == null){
            System.out.println("Library is empty");
            return;
        }
        Node current = head;
        while(current != null && current.bookID != bookID){
            current = current.next;
        }
        if(current == null){
            System.out.println("Book ID not found");
            return;
        }
        if(current.prev != null){
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if(current.next != null){
            current.next.prev = current.prev;
        }
    }
    public void searchBookByTitle(String bookTitle){
        Node current = head;
        while(current != null){
            if(current.bookTitle.equalsIgnoreCase(bookTitle)){
                System.out.println("Book Found: " + current.bookTitle + " by " + current.author);
                return ;
            }
            current = current.next;
        }
        System.out.println("Book with title " + bookTitle + " not found");
    }
    public void searchBookByAuthor(String author){
        Node current = head;
        while(current != null){
            if(current.author.equalsIgnoreCase(author)){
                System.out.println("Book Found: " + current.bookTitle + " by " + current.author);
                return ;
            }
            current = current.next;
        }
        System.out.println("Book by author " + author + " not found");
    }
    public void updateAvailabilityStatus(int bookID, boolean isAvailable){
        Node current = head;
        while(current != null){
            if(current.bookID == bookID){
                current.isAvailable = isAvailable;
                System.out.println("Updated availability status for Book ID " + bookID);
                return;
            }
            current = current.next;
        }
        System.out.println("Book ID " + bookID + " not found");
    }
    public void displayBooksForward(){
        Node current = head;
        while(current != null){
            System.out.println("-----------------------------");
            System.out.println("Book ID: " + current.bookID + ", Title: " + current.bookTitle + ", Author: " + current.author + ", Genre: " + current.genre + ", Available: " + current.isAvailable);
            System.out.println("-----------------------------");
            current = current.next;
        }
    }
    public void displayBooksReverse(){
        Node current = head;
        if(current == null){
            return;
        }
        while(current.next != null){
            current = current.next;
        }
        while(current != null){
            System.out.println("-----------------------------");
            System.out.println("Book ID: " + current.bookID + ", Title: " + current.bookTitle + ", Author: " + current.author + ", Genre: " + current.genre + ", Available: " + current.isAvailable);
            System.out.println("-----------------------------");
            current = current.prev;
        }
    }
    public int countBooks(){
        int count = 0;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        library.addBookFirst("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 1, true);
        library.addBookLast("1984", "George Orwell", "Dystopian", 2, true);
        library.addBookSpecify("To Kill a Mockingbird", "Harper Lee", "Fiction", 3, true, 2);
        
        System.out.println("Books in Forward Order:");
        library.displayBooksForward();
        
        System.out.println("\nBooks in Reverse Order:");
        library.displayBooksReverse();
        
        System.out.println("\nTotal Books: " + library.countBooks());
        
        library.searchBookByTitle("1984");
        library.searchBookByAuthor("Harper Lee");
        library.updateAvailabilityStatus(2, false);
        
        System.out.println("\nAfter updating availability status:");
        library.displayBooksForward();
        
        library.deleteBook(1);
        System.out.println("\nAfter deleting Book ID 1:");
        library.displayBooksForward();
    }

}
