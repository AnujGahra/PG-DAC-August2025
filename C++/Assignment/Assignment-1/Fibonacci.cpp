// Question: 10-> Write a C++ program to print the Fibonacci series up to n terms.

#include <iostream>
using namespace std;

int main() {
    int n;

    cout << "Enter the number of terms: ";
    cin >> n;

    int t1 = 0, t2 = 1;

    cout << "Fibonacci Series up to " << n << " terms: ";

    for (int i = 1; i <= n; i++) {
        cout << t1 << " ";   // print current term
        int next = t1 + t2;  // calculate next term
        t1 = t2;             // move forward
        t2 = next;
    }

    cout << endl;
    return 0;
}
