/*
Abstraction -> Display only essential information & hiding the details.
Types Of Abstraction:
1. Data Abstraction -> This type only show the required information about the data and ignores unnecessary details.

2. Control Abstraction -> This type only shows the required information about the implementation and ignores unnecessary details.

Note:- C++ does not have any abstract keyword like Java or C#. Instead, abstraction is implemented using pure virtual function in base classes.

Advantage of Data Abstraction:-
Avoids code duplication and increase reusability.
Can change the internal implementation of the class independently without affecting the user.
Helps to increase the security and reduces complexity and redundancy of an application or program as only important details are provided to the user.



*/

#include <iostream>
using namespace std;

class implementAbstraction
{
private:
    int a, b;

public:
    // method to set values
    void set(int x, int y)
    {
        a = x;
        b = y;
    }

    void display()
    {
        cout << "a = " << a << endl;
        cout << "b = " << b << endl;
    }
};

int main()
{
    implementAbstraction obj;
    obj.set(10, 20);
    obj.display();

    return 0;
}