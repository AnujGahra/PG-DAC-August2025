#include <iostream>
using namespace std;

struct MyStruct {
    int x;

    void show() {
        cout << "Struct x = " << x << endl;
    }
};

class MyClass {
    int y;

public:
    MyClass(int val) {
        y = val;
    }

    void show() {
        cout << "Class y = " << y << endl;
    }
};

int main() {

    MyStruct s;
    s.x = 10;
    s.show();

    MyClass c(20);
    c.show();

    return 0;
}