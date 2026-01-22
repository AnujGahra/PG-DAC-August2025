// Question: 03 -> Write a C++ program to swap two numbers without using a third variable

#include <iostream>
using namespace std;

// Function to swap numbers without using third variable
void swapNumbers(int &a, int &b)
{
    a = a + b;
    b = a - b;
    a = a - b;
}

int main()
{

    int a, b;

    cout << "Enter the first Digit: ";
    cin >> a;

    cout << "Enter the second Digit: ";
    cin >> b;

    cout << "Before swapping:  a = " << a << ", b = " << b << endl;

    swapNumbers(a, b);

    cout << "After swapping:  a = " << a << ", b = " << b << endl;

    return 0;
}
