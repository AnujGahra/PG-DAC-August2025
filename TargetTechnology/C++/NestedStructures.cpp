#include<iostream>
using namespace std;


struct inner {
    int a, b;
};

struct outer {
    inner in;
    int x, y;
};

int main() {
    outer obj = {{10, 30}, 40, 50};
    cout << "Inner a: " << obj.in.a << ", Inner b: " << obj.in.b << endl;
    cout << "Outer x: " << obj.x << ", Outer y: " << obj.y << endl;
    return 0;
}