// Question: 08-> Write a C++ program to take n elements in an array and print them in reverse order.

#include <iostream>
using namespace std;

int main()
{

    int n;

    cout << "Enter how many numbers: ";
    cin >> n;

    int arr[n]; // array of size n

    cout << "Enter " << n << " numbers: ";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    // print array before reverse
    cout << "Array: ";
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }

    cout << endl;

    // reverse array
    cout << "Reverse Array: ";
    for (int i = n - 1; i >= 0; i--)
    {
        cout << arr[i] << " ";
    }

    cout << endl;

    return 0;
}