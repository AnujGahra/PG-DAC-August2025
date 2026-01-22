#include<iostream>
using namespace std;

int factNum(int n) {

    if(n < 1) {
        
        return 1;
    } else {
        return n * factNum(n - 1);
    }
}

int main() {

    int n;
    cout << "Enter a Number: ";
    cin >> n;

   int result =  factNum(n);
   cout << "Factorial of " << n << " is " << result << endl;
}