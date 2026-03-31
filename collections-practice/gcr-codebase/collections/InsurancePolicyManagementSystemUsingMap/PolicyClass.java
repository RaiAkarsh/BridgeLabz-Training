import java.time.LocalDate;
public class PolicyClass {
    int policyNumber;
    String holderName;
    LocalDate expiryDate;

    public PolicyClass(int policyNumber, String holderName, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return policyNumber + " | " + holderName + " | " + expiryDate;
    }
}
