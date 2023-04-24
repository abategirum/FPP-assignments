package lab12;

public class CustomerAccount {
    private String cus_name;
    private String acc_no;
    private double balance;

    public CustomerAccount(String cus_name, String acc_no, double balance) {
        this.cus_name = cus_name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) throws WithdrawAmountExceededException, BalanceBelowMinimumException {
        if (amount > balance) {
            throw new WithdrawAmountExceededException("Withdraw amount cannot exceed balance.");
        }
        balance -= amount;
        if (balance < 100) {
            throw new BalanceBelowMinimumException("Balance cannot be below 100$.");
        }
        return true;
    }

    public double getBalance() {
        return balance;
    }
}

class WithdrawAmountExceededException extends Exception {
    public WithdrawAmountExceededException(String message) {
        super(message);
    }
}

class BalanceBelowMinimumException extends Exception {
    public BalanceBelowMinimumException(String message) {
        super(message);
    }
}
