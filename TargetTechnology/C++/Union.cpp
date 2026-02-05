#include<iostream>
using namespace std;


union A
{
    int x;
    char y;
};

union B
{
    float a;
    double b;
};

int main() {
    A objA;
    B objB;

    objA.x = 10;
    cout << "Value of x in union A: " << objA.x << endl;

    objA.y = 'A';
    cout << "Value of y in union A: " << objA.y << endl;

    objB.a = 3.14f;
    cout << "Value of a in union B: " << objB.a << endl;

    objB.b = 2.71828;
    cout << "Value of b in union B: " << objB.b << endl;

    return 0;
}
