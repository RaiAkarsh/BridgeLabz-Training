import java.util.*;

class DuplicateVoteException extends Exception {
    DuplicateVoteException(String msg) {
        super(msg);
    }
}

abstract class ElectionService {
    abstract void castVote(int voterId, int candidateId) throws DuplicateVoteException;
}

class Voter {
    int voterId;
    boolean voted = false;

    Voter(int voterId) {
        this.voterId = voterId;
    }
}

class Candidate {
    int candidateId;
    String name;
    int votes = 0;

    Candidate(int candidateId, String name) {
        this.candidateId = candidateId;
        this.name = name;
    }
}

class Election extends ElectionService {
    List<Voter> voter= new ArrayList<>();
    List<Candidate> candidates = new ArrayList<>();

    void registerVoter(Voter voterId){
        voter.add(voterId);
    }

    void addCandidate(Candidate candidate){
        candidates.add(candidate);
    }

    @Override
    void castVote(int voterId, int candidateId) throws DuplicateVoteException {
        Voter vote = null;
        for (Voter v : voter) {
            if (v.voterId == voterId) {
                vote = v;
                break;
            }
        }
        if(vote.voted){
            throw new DuplicateVoteException("Voter has already voted.");
        } 
        else {
            for (Candidate c : candidates) {
                if (c.candidateId == candidateId) {
                    c.votes++;
                    vote.voted = true;
                    return;
                }
            }
        }
    }
    void showResults(){
        for(Candidate c : candidates){
            System.out.println("Candidate ID: " + c.candidateId + ", Name: " + c.name + ", Votes: " + c.votes);
        }
    }
}
