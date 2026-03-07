#include <iostream>
using namespace std;

class customDelete {
public:

    customDelete() { // constructor
        cout << "Constructor called" << endl;
    }

    ~customDelete() { // destructor
        cout << "Destructor called" << endl;
    }

    void operator delete(void* ptr) { // custom delete operator
        cout << "Custom delete called" << endl;
        free(ptr);
    }
};

int main() {

    customDelete* t = new customDelete();

    delete t;

}