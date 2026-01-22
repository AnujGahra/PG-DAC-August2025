#include<iostream>
using namespace std;


int sumNums(int n) {

    if(n < 1) {
        
        return 0;
    } else {
        return n + sumNums(n - 1);
    }
}
int main() {

    int n;
    cout << "Enter a Number: ";
    cin >> n;

   int result =  sumNums(n);
   cout << "Sum of first " << n << " numbers is " << result << endl;

   return 0;
}