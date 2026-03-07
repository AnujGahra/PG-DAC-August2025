#include<iostream>
using namespace std;


int getNumber() { return 42; }

int main() {
    auto x = 10.5;          // deduced as double
    decltype(getNumber()) y = 5; // deduced as int (from return type)

    cout << "x: " << x << ", y: " << y << endl;
    return 0;
}