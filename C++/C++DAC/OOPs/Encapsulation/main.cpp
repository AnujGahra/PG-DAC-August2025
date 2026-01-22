#include<iostream>
using namespace std;


class Customer {
    string name;
    int account_number, balance, age;
    public:
    Customer(string name, int account_number, int balance, int age) {
        this->name = name;
        this->account_number = account_number;
        this->balance = balance;
        this->age = age;
    }

    void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            cout << "Invalid Amount" << endl;
        }
    }

    void withdraw(int amount) {
        if(amount <= balance && amount > 0) {
            balance -= amount;;
        } else {
            cout << "" << endl;
        }
    }

    void display() {
        cout << name << " " << account_number << " " << balance << endl;
    }


};


int main() {
    Customer A1("Rohit", 1, 1000, 3);
    Customer A2("Mohit", 2, 1800, 4);
    Customer A3("Mohan", 3, 3000, 8);
    A1.deposit(10);
    A1.display();

}