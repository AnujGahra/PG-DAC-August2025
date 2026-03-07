#include<iostream>
using namespace std;


int modify(int x) {
    x = 10; // This modification will not affect the original variable 'a'
    cout << "Inside modify function: x = " << x << endl;
    return x;
};

int main() {
    int a = 5;
    cout << "Value before call by value: " << a << endl;
    
    modify(a);
    cout << "Value after call by value: " << a << endl;
    return 0;
}