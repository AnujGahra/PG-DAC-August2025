#include<iostream>
#include<set>
using namespace std;


int main() {
    set<int> s;
    s.insert(1);
    s.insert(2);
    s.insert(3);
    s.insert(4);
    s.insert(5);

    // print set
    for (int i : s) {
        cout << i << " ";
    }
    cout << endl;

    // erase element
    s.erase(3);

    // print set
    for (int i : s) {
        cout << i << " ";
    }
    cout << endl;
}