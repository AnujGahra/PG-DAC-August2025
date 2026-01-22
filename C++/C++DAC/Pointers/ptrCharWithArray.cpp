#include<iostream>
using namespace std;

int main() {
    char arr[5] = "1234";
    char *ptr = arr;

    cout << arr << endl; // output will be value of arr
    cout << ptr << endl; // output will be value of arr

    cout << (void*)arr << endl; // output will be address
    cout << (void*)ptr << endl; // output will be address


    char name = 'a';
    cout << name;
    char *ptr1 = &name;
    cout << ptr1 << endl;
    cout << *ptr1 << endl; //value
    cout << (void*) &name << endl; // address

    cout << (void*) ptr1 << endl;
}