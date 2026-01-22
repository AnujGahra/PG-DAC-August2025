#include<iostream>
using namespace std;


int searchElement(int arr[], int x) {
    // your code here
    for(int i = 0; i<5; i++) {
        if(arr[i]== x){
            return i;
        }
    }
    return -1;
}


int main() {

    int arr[5] = {23, 45, 23, 56, 23};
    int x;
    cout << "Enter a number what do you want to find in array: ";
    cin >> x;

    int index = searchElement(arr, x);
    cout << "Element found at index: "<< index << endl;


    return 0;
}