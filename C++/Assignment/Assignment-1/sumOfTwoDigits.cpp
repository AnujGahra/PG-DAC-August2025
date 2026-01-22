// Question: 01 -> Write a C++ program that takes two integer inputs from the user and prints their sum.

#include<iostream>
using namespace std;

int main() {
    int a, b;

    cout<<"Enter the first Digit: ";
    cin>>a;

    cout << "Enter the second Digit: ";
    cin>>b;

    cout << "The sum of " << a << " and " << b << " is " << a+b << endl;

    return 0;
}