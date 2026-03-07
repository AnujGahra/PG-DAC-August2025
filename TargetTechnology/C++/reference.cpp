#include<iostream>
using namespace std;

int main() {
    int a = 10;
    int b = 560;
    int &ref = a; // ref is a reference to a
    ref = b; // Modifying ref will also modify a

    cout << "Value of a: " << a << endl; // Output: 560
    cout << "Value of ref: " << ref << endl; // Output: 560

    ref = 20; // Modifying ref will also modify a

    cout << "Value of a after modification: " << a << endl; // Output: 20
    cout << "Value of ref after modification: " << ref << endl; // Output: 20

    return 0;
}