#include<iostream>
using namespace std;


class Base{
    public:
        Base() {
            cout << "Base class Constructor called..." << endl;
        }

       virtual ~Base() {
            cout << "Base class destructor called..." << endl;
        }

};

class Derived: public Base{
    
    public:
         Derived() {
            cout << "Derived class Constructor called..." << endl;
        }

        ~Derived() {
            cout << "Derived class destructor called..." << endl;
        }
};


int main() {

    Base *ptr = new Derived();

    delete ptr;

    return 0;
}