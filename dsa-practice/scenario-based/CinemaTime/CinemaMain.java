import java.util.*;

public class CinemaMain {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        CinemaLogic cinema = new CinemaLogic();

        while (true) {
            System.out.println("\n1. Add Movie");
            System.out.println("2. Search Movie");
            System.out.println("3. Display All Movies");
            System.out.println("4. Print Report");
            System.out.println("5. Exit");

            int choice = x.nextInt();
            x.nextLine();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter title: ");
                        String title = x.nextLine();
                        System.out.print("Enter time (HH:MM): ");
                        String time = x.nextLine();
                        cinema.addMovie(title, time);
                        System.out.println("Movie Added");
                    } catch (InvalidTimeFormatException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter keyword: ");
                    String key = x.nextLine();
                    cinema.searchMovie(key);
                    break;

                case 3:
                    cinema.displayAllMovies();
                    break;

                case 4:
                    cinema.printReport();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
