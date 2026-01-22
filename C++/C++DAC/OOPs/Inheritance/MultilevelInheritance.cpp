#include<iostream>
using namespace std;

class Vehicle {
    public:
        Vehicle() {
            cout << "The is a Vehicle" << endl;
        }
};

class FourWheeler: public Vehicle {
    public:
        FourWheeler() {
            cout << "The is a FourWheeler" << endl;
        }
};

class Car: public FourWheeler {
    public:
        Car() {
        cout << " This Vehicle is Car" << endl;
    }
};

int main() {
    Car obj;
    


    return 0;
}