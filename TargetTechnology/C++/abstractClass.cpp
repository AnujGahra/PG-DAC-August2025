#include<iostream>
using namespace std;

class Shape{
    public:
        virtual void draw() = 0;
};

class Circle: public Shape{
    public:
        void draw() override{
            cout << "Drwaing Circle" << endl;
        };
};


int main() {
    Shape* ptr = new Circle();
    ptr->draw();
    delete ptr;
}