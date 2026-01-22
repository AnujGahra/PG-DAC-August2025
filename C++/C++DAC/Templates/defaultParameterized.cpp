#include<iostream>
using namespace std;


template <class T1 = int, class T2=float, class T3=char>
class Gahra {
    public:
        T1 a;
        T2 b;
        T3 c;

        Gahra(T1 x, T2 y, T3 z) {
            a = x;
            b = y;
            c = z;
        };

        void display() {
            cout << a << endl;
            cout << b << endl;
            cout << c << endl;
        };
};

int main() {
    Gahra<> g(4, 6.4, 'n');
    g.display();
    cout << endl;
    Gahra < float, char, char> g1(1.6, 'o', 'c');
    g1.display();


    return 0;
}