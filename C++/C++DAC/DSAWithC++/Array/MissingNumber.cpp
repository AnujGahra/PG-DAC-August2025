#include<iostream>
using namespace std;

int main() {

    int arr[5] = {1, 2, 3, 5, 6};


    int sum = 0;
    for(int i=0; i<5; i++)
    sum += arr[i];

    // Sum of n number
    int ans = 6*(6+1)/2;

    cout << ans - sum << endl;

    return 0;
}