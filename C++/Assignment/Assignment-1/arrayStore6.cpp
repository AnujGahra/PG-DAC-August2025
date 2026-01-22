// Write a C++ program that takes n numbers as input, stores them in an array, and finds the largest number.


#include <iostream>
using namespace std;

int main() {
    int n;

    cout << "Enter how many numbers: ";
    cin >> n;

    int arr[n];  // array of size n

    cout << "Enter " << n << " numbers: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    // Assume first number is largest
    int largest = arr[0];

    for (int i = 1; i < n; i++) {
        if (arr[i] > largest) {
            largest = arr[i];
        }
    }

    cout << "The largest number is: " << largest << endl;

    return 0;
}
