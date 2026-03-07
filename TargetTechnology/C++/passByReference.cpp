#include <iostream>
using namespace std;

int modify(int &x)
{
    x = 40;
    return x;
}

int main()
{
    int a = 5;
    cout << "Value before call by reference: " << a << endl;

    modify(a);
    cout << "Value after call by reference: " << a << endl;
    return 0;
}