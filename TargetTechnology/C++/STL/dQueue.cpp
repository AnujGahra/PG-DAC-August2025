#include<iostream>
#include<deque>
using namespace std;


int main() {
    deque<int> dq = {1, 2, 3, 4, 5};

    // all deque operation one by one 
    dq.push_back(6); // add element at the end
    dq.push_front(0); // add element at the front
    
    for(int val : dq) {
        cout << val << " ";
    }

    cout << "\nSize: " << dq.size() << endl;
    cout << "Front element: " << dq.front() << endl;
    cout << "Back element: " << dq.back() << endl;

    dq.pop_back(); // remove element from the end
    dq.pop_front(); // remove element from the front
    cout << "After pop operations: ";
    for(int val : dq) {
        cout << val << " ";
    }

    cout << endl;


    // clear
    dq.clear();
    cout << "After clear, Size: " << dq.size() << endl;


    // empty
    if(dq.empty()) {
        cout << "Deque is empty" << endl;
    } else {
        cout << "Deque is not empty" << endl;
    }

    
    return 0;


}
