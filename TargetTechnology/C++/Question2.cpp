#include<iostream>
using namespace std;


int main() {

    int num = 123;
    // Reverse the digits of the number


    int reversedNum = 0;
    while (num != 0) {
        int digit = num % 10;
        reversedNum = reversedNum * 10 + digit;
        num /= 10;
    }
    cout << "Reversed Number: " << reversedNum << endl;
    return 0;
}