#include<iostream>
using namespace std;

int main() {
    

    int * a = new int(10);
    int *b = a; // shallow copy

    *b = 30;

     cout << "a = " << *a << ", b = " << *b << endl;  // both 20

    // Deep Copy
    int *x = new int(50);
    int *y = new int(*x); // deep copy: new memory with same value


    *y = 30;      // changing y does not affect x
    cout << "\nDeep Copy:" << endl;
    cout << "x = " << *x << ", y = " << *y << endl;  // x=10, y=30

    delete a; // free memory
    // delete b;  // dangerous in shallow copy (same memory as a)
    delete x;
    delete y;


     return 0;
}