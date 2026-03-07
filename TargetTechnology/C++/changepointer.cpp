#include<iostream>
using namespace std;


void wrongUpdate(int *p) {
    // int x = 100;
    // p = &x; // Changing the pointer locally, not the original address
    *p = 100; // This will change the value at the original address, but it's not what we intended to do here
}

int main() {
    int x = 10;

    int *ptr = &x; // p points to x

     wrongUpdate(ptr); // This will not change the value of x

     cout << "Value: " << *ptr << endl; // Will still print 10
    return 0;
}