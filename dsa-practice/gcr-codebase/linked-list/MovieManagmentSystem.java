class Node{
    String title;
    String director;
    int releaseYear;
    double rating;
    Node next;
    Node prev;
    public Node(String title, String director, int releaseYear, double rating){
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
public class MovieManagmentSystem {
    private Node head;
    public MovieManagmentSystem(){
        this.head = null;
    }
    public void addMovieFirst(String title, String director, int releaseYear, double rating){
        Node newNode = new Node(title, director, releaseYear, rating);
        if(head != null){
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }
    public void addMovieLast(String title, String director, int releaseYear, double rating){
        Node newNode = new Node(title, director, releaseYear, rating);
        if(head == null){
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }
    public void addMovieSpecify(String title, String director, int releaseYear, double rating, int position){
        Node newNode = new Node(title, director, releaseYear, rating);
        if(position == 1){
            if(head != null){
                newNode.next = head;
                head.prev = newNode;
            }
            head = newNode;
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
        if(current != null){
            newNode.next = current.next;
            newNode.prev = current;
            if(current.next != null){
                current.next.prev = newNode;
            }
            current.next = newNode;
        }
    }
    public void removeMovie(String title){
        if(head == null){
            System.out.println("Movie list is empty");
            return;
        }
        if(head.title.equals(title)){
            head = head.next;
            if(head != null){
                head.prev = null;
            }
            return;
        }
        Node current = head;
        while(current != null && !current.title.equals(title)){
            current = current.next;
        }
        if(current == null){
            System.out.println("Movie not found");
            return;
        }
        if(current.next != null){
            current.next.prev = current.prev;
        }
        if(current.prev != null){
            current.prev.next = current.next;
        }
    }
    public void searchMovie(String title,double rating){
        Node current = head;
        while(current != null){
            if(current.title.equals(title) && current.rating == rating){
                System.out.println("Movie Found: " + current.title + ", Directed by: " + current.director + ", Released in: " + current.releaseYear + ", Rating: " + current.rating);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found");
    }
    public void updateMovieRating(String title, double newRating){
        Node current = head;
        while(current != null){
            if(current.title.equals(title)){
                current.rating = newRating;
                System.out.println("Updated Rating for " + title + " to " + newRating);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found");
    }
    public void displayMoviesforward(){
        if(head == null){
            System.out.println("No movies in the list");
            return;
        }
        Node current = head;
        while(current != null){
            System.out.println("---------------------");
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Release Year: " + current.releaseYear + ", Rating: " + current.rating);
            System.out.println("---------------------");
            current = current.next;
        }
    }
    public void displayMoviesBackward(){
        if(head == null){
            System.out.println("No movies in the list");
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        while(current != null){
            System.out.println("---------------------");
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Release Year: " + current.releaseYear + ", Rating: " + current.rating);
            System.out.println("---------------------");
            current = current.prev;
        }
    }
    public static void main(String[] args){
        MovieManagmentSystem mms = new MovieManagmentSystem();
        mms.addMovieLast("Inception", "Christopher Nolan", 2010, 8.8);
        mms.addMovieFirst("The Matrix", "The Wachowskis", 1999, 8.7);
        mms.addMovieSpecify("Interstellar", "Christopher Nolan", 2014, 8.6, 2);
        mms.displayMoviesforward();
        mms.updateMovieRating("Inception", 9.0);
        mms.searchMovie("Inception", 9.0);
        mms.removeMovie("The Matrix");
        mms.displayMoviesBackward();
    }

}
