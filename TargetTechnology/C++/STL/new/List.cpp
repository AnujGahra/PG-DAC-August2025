#include<iostream>
#include <list>
using namespace std;


int main() {

    list<int> l;
    l.push_back(1);
    l.push_back(2);
    l.push_back(3);

    // print list
    for (int i : l) {
        cout << i << " ";
    }
    cout << endl;

    // pop back
    l.pop_back();

    // print list
    for (int i : l) {
        cout << i << " ";
    }
    cout << endl;

    for(auto it = l.begin(); it != l.end(); it++) {
        cout << *it << " ";
    }
    cout << endl;
}