class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

interface TransferService {
    void transfer(double amount) throws InsufficientBalanceException;
}

class Wallet {
    double balance = 0;
    void addMoney(double amt) {
        balance += amt;
    }
    void withdraw(double amt) throws InsufficientBalanceException {
        if (balance < amt)
            throw new InsufficientBalanceException("Insufficient Balance");
        balance -= amt;
    }
}

class WalletTransfer implements TransferService {
    Wallet wallet;

    WalletTransfer(Wallet wallet) {
        this.wallet = wallet;
    }

    public void transfer(double amount) throws InsufficientBalanceException {
        wallet.withdraw(amount);
    }
}
