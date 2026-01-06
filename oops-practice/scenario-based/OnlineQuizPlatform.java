import java.util.*;
class InvalidQuizSubmissionException extends Exception {
        public InvalidQuizSubmissionException(String message) {
            super(message);
        }
}
public class OnlineQuizPlatform {
    static int calculateScore(String[] correctAnswers, String[] userAnswers) throws InvalidQuizSubmissionException {
        if (correctAnswers.length != userAnswers.length) {
            throw new InvalidQuizSubmissionException("Length mismatch between correct answers and user answers.");
        }
        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
        return score;
    }

    static String determineGrade(int score, int totalQuestions) {
        double percentage = ((double) score / totalQuestions) * 100;
        if (percentage >= 90) return "A";
        else if (percentage >= 80) return "B";
        else if (percentage >= 70) return "C";
        else if (percentage >= 60) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Online Quiz Platform");
        System.out.println("Enter correct answers for the quiz:");
        String[] correctAnswers = new String[5];
        for (int i = 0; i < correctAnswers.length; i++) {
            correctAnswers[i] = x.nextLine();
        }
        System.out.println("Enter no. of users taking the quiz:");
        int userCount = x.nextInt();
        for(int i=0;i<userCount;i++){
            System.out.println("Enter answers for user " + (i+1) + ":");
            String[] userAnswers = new String[5];
            for (int j = 0; j < userAnswers.length; j++) {
                userAnswers[j] = x.next();
            }
            try {
                int score = calculateScore(correctAnswers, userAnswers);
                String grade = determineGrade(score, correctAnswers.length);
                System.out.println("User " + (i+1) + " Score: " + score + ", Grade: " + grade);
            } catch (InvalidQuizSubmissionException e) {
                System.out.println(e.getMessage());
            }
        }
    }    
}

