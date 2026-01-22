#include <iostream>
using namespace std;

void rotateArray(int arr[], int n, int d) {
    d = d % n; // in case d > n
    int temp[d];

    // Step 1: Store first d elements in temp
    for (int i = 0; i < d; i++)
        temp[i] = arr[i];

    // Step 2: Shift rest of the elements to the left
    for (int i = d; i < n; i++)
        arr[i - d] = arr[i];

    // Step 3: Copy temp[] elements to end
    for (int i = 0; i < d; i++)
        arr[n - d + i] = temp[i];
}

int main() {
    int n, d;
    cout << "Enter size of array: ";
    cin >> n;

    int arr[n];
    cout << "Enter array elements: ";
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    cout << "Enter number of rotations: ";
    cin >> d;

    rotateArray(arr, n, d);

    cout << "Rotated Array: ";
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";

    return 0;
}
