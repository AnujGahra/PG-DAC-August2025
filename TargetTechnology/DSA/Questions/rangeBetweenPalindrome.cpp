#include<iostream>
using namespace std;

bool isPalindrome(int n) {
    int original = n;
    int reversed = 0;

    while (n != 0) {
        int digit = n % 10;
        reversed = reversed * 10 + digit;
        n /= 10;
    }

    return original == reversed;
}

int main() {
    int num1, num2;
    cin >> num1 >> num2;

    for(int i = num1; i <= num2; i++) {
        if(isPalindrome(i)) {
            cout << i << " ";
        }
    }


    return 0;
}