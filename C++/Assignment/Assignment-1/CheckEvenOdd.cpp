// Question: 04-> Write a C++ program that checks whether a number entered by the user is even or odd.

#include <iostream>
using namespace std;

int main()
{

    int num;

    cout << "Enter the first Digit: ";
    cin >> num;

    if (num % 2 == 0)
    {
        cout << num << " is a Even Number" << endl;
    }
    else
    {
        cout << num << " is a Odd Number" << endl;
    }

    return 0;
}