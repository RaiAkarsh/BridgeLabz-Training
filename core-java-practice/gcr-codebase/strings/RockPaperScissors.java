import java.util.Scanner;

public class RockPaperScissors {

    static String computerpick() {

        String[] choice = {"rock", "paper", "scissors"};
        return choice[(int)(Math.random() * 3)];
    }

    static boolean userWins(String user, String comp) {
        
        return (user.equals("rock") && comp.equals("scissors")) || (user.equals("paper") && comp.equals("rock")) || (user.equals("scissors") && comp.equals("paper"));
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter number of games");
        int n = x.nextInt();

        int userWin = 0, compWin = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("Enter choice (rock/paper/scissors)");
            String user = x.next();
            String comp = computerpick();

            if (user.equals(comp)){
                 continue;
            }
            else if (userWins(user, comp)){
                 userWin++;
            } else {
                 compWin++;
            }
        }

        System.out.println("User Wins     " + userWin);
        System.out.println("Computer Wins  " + compWin);

        System.out.println("User Win %    " + (userWin * 100.0 / n));
        System.out.println("Computer Win % " + (compWin * 100.0 / n));
    }
}
