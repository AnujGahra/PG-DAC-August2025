#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int reversedNum = 0;

    while (n != 0)
    {
        int digit = n % 10;
        reversedNum = reversedNum * 10 + digit;
        n /= 10;
    }

    cout << reversedNum;

    return 0;
}