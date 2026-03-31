import java.util.Scanner;
public class StudentTestScores {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = x.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number of students");
            return;
        }
        int[] scores = new int[n];
        int sum = 0;
        System.out.println("Enter the test scores:");
        for (int i = 0; i < n; i++) {
            if (!x.hasNextInt()) {
                System.out.println("Invalid input! Enter numeric value only.");
                return;
            }
            int score = x.nextInt();
            if (score < 0) {
                System.out.println("Invalid input! Score cannot be negative.");
                return;
            }
            scores[i] = score;
            sum += score;
        }
        double average = (double) sum / n;
        System.out.println("Average Score: " + average);
        int highest = scores[0];
        int lowest = scores[0];
        for (int i = 1; i < n; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.print("Scores above average: ");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (scores[i] > average) {
                System.out.print(scores[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
    }
}
