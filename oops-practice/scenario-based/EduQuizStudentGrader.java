import java.util.Scanner;
public class EduQuizStudentGrader {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the correct answers for the quiz ");
        char[] correctAnswers = new char[10];
        for (int i = 0; i < 10; i++) {
            correctAnswers[i] = x.next().charAt(0);
        }
        System.out.println("Enter the student's answers for the quiz ");
        char[] studentAnswers = new char[10];       
        for (int i = 0; i < 10; i++) {
            studentAnswers[i] = x.next().charAt(0);
        }
        int score = calculate(correctAnswers, studentAnswers);
        double percentage = (score / 10.0) * 100;
        System.out.println("Score: " + score + "/10");
        System.out.println("Percentage: " + percentage + "%");
        if (percentage >= 50) {
            System.out.println("Result: PASS");
        }
        else {
            System.out.println("Result: FAIL");
        }
    }
    public static int calculate(char[] correct, char[] student) {
        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (Character.toLowerCase(correct[i]) == Character.toLowerCase(student[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
                score++;
            }
            else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }
        return score;
    }
}
