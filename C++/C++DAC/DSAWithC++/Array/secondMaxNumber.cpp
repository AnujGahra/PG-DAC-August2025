#include<iostream>
using namespace std;


int secondLargestNumber(int arr[]) {

    // Largest elements

    int ans = -1;
    for(int i =0; i<6; i++){
        if(arr[i] > ans)
        ans = arr[i];
    }

    // Second largest
    int second = -1;
    for(int i=0; i<6; i++){
        if(arr[i] != ans)
        second = max(second, arr[i]);
    }

    return second;
};

int main() {

    int arr[6] = {12, 3, 45, 567, 23, 12};

    int result = secondLargestNumber(arr);
    cout << "Second largest element is: " << result << endl;

    return 0;
}