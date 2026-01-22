package interq;

public class BankApp {
    public static void main(String[] args) {
        // Create first account and customer
        Account acc1 = new Account("Savings", "SB123456", 10000.0);
        Customer cust1 = new Customer("Anuj Kumar", "Lucknow, India",
                                      "CUST001", "9876543210", acc1);
        cust1.disp();

        System.out.println();

        // Create second account with negative balance to test exception
        Account acc2 = new Account("Current", "CR456789", -5000.0);
        Customer cust2 = new Customer("Ravi Verma", "Delhi, India",
                                      "CUST002", "9123456780", acc2);
        cust2.disp();
    }
}
