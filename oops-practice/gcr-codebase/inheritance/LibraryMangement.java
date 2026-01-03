class Book{
    String title;
    int publcationYear;
    public Book(String title, int publcationYear){
        this.title = title;
        this.publcationYear = publcationYear;
    }
    public void displayInfo(){
        System.out.println("Title: " + title + ", Publication Year: " + publcationYear);
    }
}
class Author extends Book{
    String name;
    String bio;
    public Author(String title, int publcationYear, String name, String bio){
        super(title, publcationYear);
        this.name = name;
        this.bio = bio;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author Name: " + name + ", Bio: " + bio);
    }
}
public class LibraryMangement {
    public static void main(String[] args) {
        Author author = new Author("The Great Gatsby", 1925, "F. Scott Fitzgerald", "American novelist and short story writer.");
        author.displayInfo();
    
}
}
