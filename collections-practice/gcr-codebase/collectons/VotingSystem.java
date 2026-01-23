import java.util.*;
public class VotingSystem {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        HashMap<String, Integer> voteCount = new HashMap<>();
        LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();

        System.out.println("Enter total number of votes:");
        int totalVotes = x.nextInt();

        System.out.println("Enter candidate name for each vote:");
        for (int i = 0; i < totalVotes; i++) {
            String candidateName = x.next();
            voteCount.put(candidateName, voteCount.getOrDefault(candidateName, 0) + 1);
            voteOrder.put(candidateName, voteCount.get(candidateName));
        }

        TreeMap<String, Integer> sortedResult = new TreeMap<>(voteCount);

        System.out.println("----- Voting Order (Insertion Order) -----");
        System.out.println(voteOrder);

        System.out.println("----- Final Result (Sorted by Candidate Name) -----");
        System.out.println(sortedResult);
    }
}
