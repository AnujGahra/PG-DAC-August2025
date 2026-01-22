#include<iostream>
using namespace std;

int main() {
    int a = 10;
    // print the address of a 
    cout << &a << endl; // address of a
    int *ptr = &a;
    cout << ptr << endl; // address of a
    cout << *ptr << endl; // value of a
    cout << sizeof(ptr) << endl;

    // int b = 20;
    // int p = &b;
    // cout << p << endl;

    int b = 30;
    ptr = &b;
    cout << ptr << endl;
    cout << *ptr << endl;
    
    
}