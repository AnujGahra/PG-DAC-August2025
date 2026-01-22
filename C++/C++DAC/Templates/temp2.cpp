#include <iostream>
using namespace std;


//  With templates
template <class T>
class Calculator {
public:
    T add(T a, T b) { return a + b; }
    T multiply(T a, T b) { return a * b; }
};

int main() {
    Calculator<int> intCalc;
    cout << "Int Add: " << intCalc.add(5, 3) << endl;

    Calculator<float> floatCalc;
    cout << "Float Multiply: " << floatCalc.multiply(2.5, 3.0) << endl;

    return 0;
}



// without Templates 

#include <iostream>
using namespace std;

// template <class T>
class Calculator {
public:
    int add(int a, int b) { return a + b; }
    float multiply(float a, float b) { return a * b; }
};

int main() {
    Calculator intCalc;
    cout << "Int Add: " << intCalc.add(5, 3) << endl;

    Calculator floatCalc;
    cout << "Float Multiply: " << floatCalc.multiply(2.5, 3.0) << endl;

    return 0;
}
