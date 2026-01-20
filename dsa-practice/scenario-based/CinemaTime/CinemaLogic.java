import java.util.*;

class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String msg) {
        super(msg);
    }
}

public class CinemaLogic {
    private List<String> titles = new ArrayList<>();
    private List<String> times = new ArrayList<>();

    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid Time Format");
        }
        titles.add(title);
        times.add(time);
    }

    public void searchMovie(String keyword) {
        boolean found = false;
        try {
            for (int i = 0; i < titles.size(); i++) {
                if (titles.get(i).contains(keyword)) {
                    System.out.println(titles.get(i) + " at " + times.get(i));
                    found = true;
                }
            }
            if (!found) {
                throw new IndexOutOfBoundsException();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Movie not found");
        }
    }

    public void displayAllMovies() {
        for (int i = 0; i < titles.size(); i++) {
            System.out.println(titles.get(i) + " at " + times.get(i));
        }
    }

    public void printReport() {
        String[] t1 = titles.toArray(new String[0]);
        String[] t2 = times.toArray(new String[0]);

        for (int i = 0; i < t1.length; i++) {
            System.out.println(t1[i] + " at " + t2[i]);
        }
    }

    private boolean isValidTime(String time) {
        try {
            String[] p = time.split(":");
            int h = Integer.parseInt(p[0]);
            int m = Integer.parseInt(p[1]);
            return h >= 0 && h < 24 && m >= 0 && m < 60;
        } catch (Exception e) {
            return false;
        }
    }
}
