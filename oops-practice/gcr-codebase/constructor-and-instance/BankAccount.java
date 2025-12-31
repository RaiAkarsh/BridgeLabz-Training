class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;
    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(long accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(9876543210L, "Akarsh", 25000);
        sa.displayAccount();

        sa.setBalance(30000);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
