import java.time.LocalDate;
public class PolicyClass implements Comparable<PolicyClass> {
    int policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    public PolicyClass(int policyNumber, String holderName, LocalDate expiryDate,
                       String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    @Override
    public int compareTo(PolicyClass p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    @Override
    public boolean equals(Object o) {
        PolicyClass p = (PolicyClass) o;
        return this.policyNumber == p.policyNumber;
    }

    @Override
    public int hashCode() {
        return policyNumber;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + holderName + " | " + expiryDate + " | " + coverageType + " | " + premium;
    }
}
