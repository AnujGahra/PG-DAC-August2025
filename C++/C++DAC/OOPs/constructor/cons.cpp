#include<iostream>
using namespace std;

class Customer {
    string name;
    int account_number;
    int balance;

    public:
    // Default customer
    Customer() {
        cout << "Hello Cons" << endl;
    }
};


int main () {
    Customer A1;
}