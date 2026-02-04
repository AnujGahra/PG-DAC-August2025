#include<iostream>
using namespace std;


int main() {


    auto res = [] (int x) { // lamda function
        return x * x;
    };

    auto sum = [] (int a, int b) {
        return a + b;
    };

    cout << "Square of 5: " << res(5) << endl;
    cout << "Sum of 10 and 20: " << sum(10, 20) << endl;
    return 0;
}
