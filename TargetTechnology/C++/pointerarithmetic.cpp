#include<iostream>
using namespace std;


int main() {
    int arr[3] = {2, 3, 4};

    int* ptr = arr;

    cout << *(ptr + 2) << endl;


    cout << *(ptr + 5) << endl; // out of bond accessing that why undefined behavior

    return 0;
}