#include<iostream>
using namespace std;


int main() {
    int arr[5] = {1, 2, 3, 4, 5};
    int *ptr = arr;

    // Print the address of first element
    cout << arr << endl;
    cout << arr + 0 << endl;
    cout << &arr[0] << endl;
    cout << ptr << endl;


    // print the addess of second element pr 1 index
    cout << arr+1 << endl;
    cout << &arr[1] << endl;


    // Print the value of 0 index
    cout << arr[0] << endl;
    cout << *arr << endl;
    cout << *(arr+0) << endl;
    cout << * ptr << endl;


    // print all addresses
    for(int i=0; i<5; i++) {
        cout << arr+i << endl;
    }


    // Print all value

    for(int i=0; i<5; i++) {
        cout << *(arr+i) << " ";
    }
    cout << endl;


    // Print all values using ptr
    for(int i=0; i<5; i++) {
        cout << ptr[i] << " ";
    }
    cout << endl;


    // print all the address using ptr
    for(int i=0; i<5; i++) {
        cout << ptr+i << endl;
    }


    // Arithmetic operation

    for(int i = 0; i<5; i++) {
        cout << *ptr << " "; // print all the values
        ptr++;
    }

    cout << endl;


    ptr = ptr + 3;
    cout << *ptr << endl;

    ptr = ptr - 2;
    cout << *ptr << endl;
}