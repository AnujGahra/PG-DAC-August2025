package interq;

public class Customer {
    private String name;
    private String address;
    private String id;
    private String phone;
    private Account account; // Association (Customer HAS-A Account)

    public Customer(String name, String address, String id, String phone, Account account) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.phone = phone;
        this.account = account;
    }

    public void disp() {
        System.out.println("===== Customer Details =====");
        System.out.println("Name    : " + name);
        System.out.println("Address : " + address);
        System.out.println("ID      : " + id);
        System.out.println("Phone   : " + phone);
        account.displayAccountInfo();
        try {
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest (2 yrs, 5%): " + interest);
        } catch (NegativeBalanceException e) {
            System.out.println("Interest Calculation Error: " + e.getMessage());
        }
    }
}
