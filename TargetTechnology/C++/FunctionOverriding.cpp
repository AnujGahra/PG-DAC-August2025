#include<iostream>
using namespace std;

class Animal{
    public:
        virtual void sound() {
            cout << "Animals make a sound" << endl;
        }
};

class Dog: public Animal {
    public:
        void sound() override {
            cout << "Dogs bark" << endl;
        }
};


int main() {
    Animal* a;
    Dog d;
    
    a = &d;

    a->sound();


    return 0;
    
}