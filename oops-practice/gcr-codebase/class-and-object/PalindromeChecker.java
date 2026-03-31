class PalindromeChecker {
    String text;
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker();
        p1.text = "A man a plan a canal Panama";
        PalindromeChecker p2 = new PalindromeChecker();
        p2.text = "Hello";
        p1.display();
        p2.display();
    }
    boolean isPalindrome() {
        String clean = text.replaceAll(" ", "").toLowerCase();
        String reverse = "";

        for (int i = clean.length() - 1; i >= 0; i--) {
            reverse += clean.charAt(i);
        }
        return clean.equals(reverse);
    }
    void display() {
        if (isPalindrome())
            System.out.println(text + " is palindrome");
        else
            System.out.println(text + " is not Palindrome");
    }
}
