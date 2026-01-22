#include<iostream>
#include<vector>
using namespace std;    


// Check if array is sorted
bool isSorted(vector<int> & arr, int n) {

    // Base case: An array of size 0 or 1 is sorted
    if(n == 0 || n == 1) {
        return true;
    }
 
    // Check if the first two elements are in order
    if(arr[0] > arr[1]) {
        return false;
    }

    return arr[n-1] >= arr[n-2] && isSorted(arr, n - 1);
}

int main() {

    vector<int> arr = {1, 2, 3, 4, 5};

    if(isSorted(arr, arr.size())) {
        cout << "Array is sorted." << endl;
    } else {
        cout << "Array is not sorted." << endl;
    }

    return 0;


}