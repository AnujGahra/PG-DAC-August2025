#include <iostream>
#include <cmath>  
using namespace std;

int main() {
    int num, original, sum = 0;

    cout << "Enter a number: ";
    cin >> num;

    original = num;

    // Count number of digits
    int n = 0;
    int temp = num;
    while (temp != 0) {
        temp /= 10;
        n++;
    }

    
    temp = num;
    while (temp != 0) {
        int digit = temp % 10;
        sum += pow(digit, n);
        temp /= 10;
    }

    // Check if number is Armstrong
    if (sum == original) {
        cout << original << " is an Armstrong number." << endl;
    } else {
        cout << original << " is NOT an Armstrong number." << endl;
    }

    return 0;
}
