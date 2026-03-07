#include<iostream>
using namespace std;

int main() {

    int a = 10;
    
    if(a > 5) {
        int b = 20; // b is only accessible within this block
        cout << "Inside if block: a = " << a << ", b = " << b << endl;
    }


    for(int i = 0; i < 3; i++) {
        int temp = i * 10;
        cout << " temp = " << temp << endl;
    }
}