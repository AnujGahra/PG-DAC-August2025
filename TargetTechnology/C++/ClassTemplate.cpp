#include<iostream>
using namespace std;

template <class T>

class Box {
    T value;
    public:
    Box(T v)  {
        value = v;
    }

    T getValue() {
        return value;
    }   

};


int main() {
    Box<int> b1(123);
    cout << "Integer Box value: " << b1.getValue() << endl;
    Box<string> b2("Hello, Templates!");
    cout << "String Box value: " << b2.getValue() << endl;
    return 0;
}