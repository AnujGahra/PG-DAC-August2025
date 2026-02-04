#include<iostream>

namespace MyNamespace {
    int x = 42;
}

using namespace MyNamespace;
using namespace std;


int main() {
    cout << "Value of x from MyNamespace: " << x << endl;
    MyNamespace::x;
    return 0;
}