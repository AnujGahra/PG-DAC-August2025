#include<iostream>
using namespace std;


template <typename T> 
T area_react(T a, T b) {
    T result = a * b;
    return result;
}


int main() {
    int x1 = area_react<int>(10.5, 5);
    double x2 = area_react<double>(10.5, 5);
    float x3 = area_react<float>(10.5, 5);
    cout << x1 << ", " << x2 << ", " << x3 << endl;
}