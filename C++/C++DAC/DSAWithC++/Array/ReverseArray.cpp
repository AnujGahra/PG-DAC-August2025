#include<iostream>
using namespace std;

int main() {
    int arr[5] = {12, 34, 45, 56, 78};

    // for(int i=4; i>=0; i--){
    //     cout << arr[i] << " ";
    // }

    int start = 0, end = 4;

    while(start<end){
        swap(arr[start], arr[end]);
        start++;
        end--;
    };

    for(int i=0; i<5; i++){
        cout << arr[i] << " ";
    }

}