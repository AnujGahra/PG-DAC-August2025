#include <iostream>
#include <vector>
using namespace std;


int binarySearch(vector<int> &arr, int start, int end, int x) {
    if (end >= start) {
        int mid = start + (end - start) / 2;

        // If the element is present at the middle
        // itself
        if (arr[mid] == x)
            return mid;

        // If element is smaller than mid, then
        // it can only be present in left subarray
        if (arr[mid] > x)
            return binarySearch(arr, start, mid - 1, x);

        // Else the element can only be present
        // in right subarray
        return binarySearch(arr, mid + 1, end, x);
    }
  return -1;
}

int main() {
    vector<int> arr = { 2, 3, 4, 10, 40 };
    int target = 10;
    int n = arr.size();
    int result = binarySearch(arr, 0, n - 1, target);
    if (result == -1) cout << "Element is not present in array";
    else cout << "Element is present at index " << result;
    return 0;
}

