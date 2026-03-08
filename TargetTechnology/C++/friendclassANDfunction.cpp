#include <iostream>
using namespace std;

class A {
private:
    int secret = 42;

public:
    // Friend function
    friend void revealSecret(A obj);

    // Friend class
    friend class B;
};

// Friend function can access private data
void revealSecret(A obj) {
    cout << "Friend function accessed secret: " << obj.secret << endl;
}

// Friend class can access private data
class B {
public:
    void showSecret(A obj) {
        cout << "Friend class accessed secret: " << obj.secret << endl;
    }
};

int main() {
    A a;
    B b;

    revealSecret(a);  // Using friend function
    b.showSecret(a);  // Using friend class

    
    return 0;
}