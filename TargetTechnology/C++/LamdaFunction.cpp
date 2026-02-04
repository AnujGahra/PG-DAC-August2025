#include<iostream>
using namespace std;


int main() {


    auto res = [] (int x) { // lamda function
        return x * x;
    };

    cout << "Square of 5: " << res(5) << endl;
    return 0;
}
