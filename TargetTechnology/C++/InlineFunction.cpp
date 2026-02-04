#include<iostream>
using namespace std;

inline int getSum(int a, int b) {
    return a + b;
}

int main() {

    int num1 = 10, num2 = 20;
    cout << "Sum: " << getSum(num1, num2) << endl;
    return 0;

}