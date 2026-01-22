// Question: 09-> Write a C++ program to check if a given number is palindromic (reads the same forward and backward).

#include<iostream>
using namespace std;

int main() {


    int num;

    cout << "Enter the number: ";
    cin >> num;

    int original = num;
    int reversed = 0;

    while (num != 0) {
        int digit = num % 10;       // get last digit
        reversed = reversed * 10 + digit;  // append digit
        num /= 10;                  // remove last digit
    }

    // check palindrome
    if (original == reversed) {
        cout << original << " is a Palindrome." << endl;
    } else {
        cout << original << " is NOT a Palindrome." << endl;
    }

    return 0;
}