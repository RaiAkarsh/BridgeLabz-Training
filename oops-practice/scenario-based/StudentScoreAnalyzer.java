import java.util.Scanner;
class StudentScoreAnalyzer {
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
    public static int findMax(int[] scores) {
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }
    public static int findMin(int[] scores) {
        int min = scores[0];
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = x.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number of students");
            return;
        }
        int[] scores = new int[n];
        System.out.println("Enter the test scores (0-100):");
        for (int i = 0; i < n; i++) {
            int score = x.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("InvalidScoreException: Score must be between 0 and 100.");
                return;
            }
            scores[i] = score;
        }
        double average = calculateAverage(scores);
        int highest = findMax(scores);
        int lowest = findMin(scores);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
