#include<iostream>
#include<list>
using namespace std;

int main() {

    list<int> lst;

    // add elements to the list
    lst.push_back(10);
    lst.push_back(20);
    lst.push_back(30);

    for(int val : lst) {
        cout << val << " ";
    }
    cout << "\nSize: " << lst.size() << endl;
    // front and back
    cout << "Front element: " << lst.front() << endl;
    cout << "Back element: " << lst.back() << endl;


    // insert at front
    lst.push_front(0);
    cout << "After push_front(0): ";
    for(int val : lst) {
        cout << val << " ";
    }


    return 0;

}