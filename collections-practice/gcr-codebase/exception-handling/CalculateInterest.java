public class CalculateInterest {
    public static void main(String[] args) {
        try {
            double interest = calculate(50000, 15, 4);
            System.out.println("Interest : " + interest);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
    public static double calculate(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException();
        }
        return (amount * rate * years) / 100;
    }
}
