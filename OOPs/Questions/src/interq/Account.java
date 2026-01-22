package interq;

public class Account {
    private String accountType;
    private String accountNumber;
    private double balance;

    public Account(String accountType, String accountNumber, double balance) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Simple interest calculation (rate=5%, time=2 years)
    public double calculateInterest() throws NegativeBalanceException {
        if (balance < 0) {
            throw new NegativeBalanceException(
                "Balance is negative. Cannot calculate interest."
            );
        }
        double rate = 5.0;
        int time = 2;
        return (balance * rate * time) / 100.0;
    }

    public void displayAccountInfo() {
        System.out.println("---- Account Details ----");
        System.out.println("Account Type   : " + accountType);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }
}
