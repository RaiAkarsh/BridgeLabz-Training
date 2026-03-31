import java.util.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
}

public class Top5TrendingMovies {
    public static void main(String[] args) {
        List<Movie> moviesLl = List.of(
                new Movie("Uri", 9.0, 2023),
                new Movie("Border", 8.5, 2024),
                new Movie("Dhurandar", 9.5, 2022),
                new Movie("Iron Man", 8.9, 2024),
                new Movie("Avenger EndGame", 9.2, 2023)
        );
        moviesLl.stream()
                .sorted(Comparator.comparingDouble((Movie m) -> m.rating).reversed())
                .limit(5)
                .forEach(m -> System.out.println(m.name));
    }
}