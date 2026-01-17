public class LinearSearchSentence {
    public static void main(String[] args) {
        String[] sentences = {"I love Java", "Welcome to coding", "Binary search is fast"};
        String target = "coding";
        String result = "Not Found";
        for (String s : sentences) {
            if (s.contains(target)) {
                result = s;
                break;
            }
        }
        System.out.println(result);
    }
}