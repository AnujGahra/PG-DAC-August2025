#include<iostream>
using namespace std;

int main() {
    
    int*p = new int; // Dynamically allocate memory for an integer
    *p = 42; // Assign a value to the allocated memory
    delete p; // Deallocate the memory to prevent memory leaks

    int* arr = new int[5]; // Dynamically allocate memory for an array of integers
    delete[] arr; // Deallocate the array memory

    return 0;
}