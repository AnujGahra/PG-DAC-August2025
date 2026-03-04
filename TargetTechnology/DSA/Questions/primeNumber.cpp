#include <iostream>
using namespace std;

bool isPrime(int n) {
    if (n <= 1) return false;

    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0)
            return false;
    }
    return true;
}

int main() {
    int num;
    cin >> num;

    cout << "Prime numbers up to " << num << " are:\n";

    for (int i = 2; i <= num; i++) {
        if (isPrime(i)) {
            cout << i << " ";
        }
    }

    return 0;
}