#include<iostream>
using namespace std;

namespace MathOps{
    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}


int main() {

    int x = 5, y = 10;

     // Access functions using namespace scope resolution
    cout << "Addition: " << MathOps::add(x, y) << endl;
    cout << "Multiplication: " << MathOps::multiply(x, y) << endl;

    return 0;
}