import java.util.Scanner;
public class ReverseStringBuilder {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = x.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        String reversed = sb.toString();
        System.out.println("Reversed string: " + reversed);
    }
}
