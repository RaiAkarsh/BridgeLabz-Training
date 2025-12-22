import java.util.Scanner;
public class VoteEligibility {
    public static int[] ages(int n) {
        
        int[] age = new int[n];

        for (int i = 0; i < n; i++) {

            age[i] = (int)(Math.random() * 100);
        }
        return age;
    }

    public static String[][] vote(int[] age) {

        String[][] table = new String[age.length][2];

        for (int i = 0; i < age.length; i++) {

            table[i][0] = String.valueOf(age[i]);

            if(age[i] >= 18) {
                table[i][1] = "true";
            } else {
                table[i][1] = "false";
            }
        }
        return table;
    }

    public static void main(String[] args) {

        int[] age = ages(10);
        String[][] table = vote(age);

        System.out.println("Age Can Vote");

        for (int i = 0; i < table.length; i++) {

            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }
}


