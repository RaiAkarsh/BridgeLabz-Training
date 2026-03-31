import java.util.*;

public class OnlineVotingMain {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        Election election = new Election();

        int choice = -1;

        while (choice != 0) {

            System.out.println("1 Register Voter");
            System.out.println("2 Add Candidate");
            System.out.println("3 Cast Vote");
            System.out.println("4 View Results");
            System.out.println("0 Exit");

            choice = x.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.println("Enter Voter ID");
                        election.registerVoter(new Voter(x.nextInt()));
                        break;

                    case 2:
                        System.out.println("Enter Candidate ID and Name");
                        election.addCandidate(
                                new Candidate(x.nextInt(), x.next())
                        );
                        break;

                    case 3:
                        System.out.println("Enter Voter ID and Candidate ID");
                        election.castVote(x.nextInt(), x.nextInt());
                        break;

                    case 4:
                        election.showResults();
                        break;
                }
            } catch (DuplicateVoteException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
