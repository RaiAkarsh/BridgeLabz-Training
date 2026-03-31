import java.util.*;

public class ExamMain {
    public static void main(String[] args) {

        ExamLogic exam = new ExamLogic();

        exam.visitQuestion(1);
        exam.visitQuestion(2);
        exam.visitQuestion(3);

        exam.submitAnswer(1, "A");
        exam.submitAnswer(2, "B");
        exam.submitAnswer(3, "C");

        Map<Integer, String> correct = new HashMap<>();
        correct.put(1, "A");
        correct.put(2, "C");
        correct.put(3, "C");

        exam.lastVisited();

        System.out.println(exam.evaluate(correct));
    }
}
