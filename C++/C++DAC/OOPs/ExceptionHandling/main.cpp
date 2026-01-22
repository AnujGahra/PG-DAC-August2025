#include <iostream>
using namespace std;

class Customer {
    string name;
    int balance, account_number;

public:
    // Constructor to initialize values
    Customer(string name, int balance, int account_number) {
        this->name = name;
        this->balance = balance;
        this->account_number = account_number;
    }

    // Function to withdraw money
    void withdraw(int amount) {
        try {
            if (amount > balance) {
                // Throw an exception if balance is insufficient
                throw runtime_error("Insufficient balance!");
            }
            balance -= amount;
            cout << "Withdrawal successful! Remaining balance: " << balance << endl;
        } 
        catch (const runtime_error &e) {
            // Handle the exception here
            cout << "Error: " << e.what() << endl;
        }
    }

    // Function to display customer details
    void display() {
        cout << "Customer Name: " << name << endl;
        cout << "Account Number: " << account_number << endl;
        cout << "Balance: " << balance << endl;
    }
};

int main() {
    // Create a customer object
    Customer c1("Anuj Kumar", 5000, 12345);

    cout << "=== Customer Details ===" << endl;
    c1.display();

    cout << "\nTrying to withdraw 2000..." << endl;
    c1.withdraw(2000); // ✅ Works fine

    cout << "\nTrying to withdraw 4000..." << endl;
    c1.withdraw(4000); // ❌ Will throw an exception

    return 0;
}
