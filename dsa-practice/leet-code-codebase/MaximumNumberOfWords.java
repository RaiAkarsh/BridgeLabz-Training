class MaximumNumberOfWords {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println("Most words in a sentence are: " + mostWordsFound(sentences));
    }
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
		
        for (String s : sentences) {
            int count = s.split(" ").length;
            if (max < count)
                max = count;
        }
        return max;
    }
}