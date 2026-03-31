import java.util.Scanner;
public class StudentScoreCard {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int countOfStudents = x.nextInt();
        int[][] marks = Marks(countOfStudents);
        double[][] results = calculate(marks);
        display(marks, results);
    }
    public static int[][] Marks(int students) {
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            marks[i][0] = 10 + (int) (Math.random() * 90); // Physics
            marks[i][1] = 10 + (int) (Math.random() * 90); // Chemistry
            marks[i][2] = 10 + (int) (Math.random() * 90); // Maths
        }
        return marks;
    }
    public static double[][] calculate(int[][] marks) {
        double[][] result = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = roundTwoDigits(average);
            result[i][2] = roundTwoDigits(percentage);
        }
        return result;
    }
    
//    ----- Display Score Card -----
    public static void display(int[][] marks, double[][] results) {
        System.out.println("\nStu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < marks.length; i++) {
            String grade = Grade(results[i][2]);
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" + (int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t" + grade);
        }
    }
    public static String Grade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }
    public static double roundTwoDigits(double value) {
        return Math.round(value * 100.0) / 100.0; // Rounding to 2 decimal places
    }
}
