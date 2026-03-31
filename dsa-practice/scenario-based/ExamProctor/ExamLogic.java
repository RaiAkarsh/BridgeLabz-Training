import java.util.*;

public class ExamLogic {

    private Stack<Integer> navigation = new Stack<>();
    private Map<Integer, String> answers = new HashMap<>();

    public void visitQuestion(int qId) {
        navigation.push(qId);
    }

    public void submitAnswer(int qId, String answer) {
        answers.put(qId, answer);
    }

    public int evaluate(Map<Integer, String> correctAnswers) {
        int score = 0;
        for (int qId : answers.keySet()) {
            if (answers.get(qId).equals(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }

    public void lastVisited() {
        if (!navigation.isEmpty()) {
            System.out.println(navigation.peek());
        }
    }
}
