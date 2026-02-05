#include<iostream>
using namespace std;
#include<vector>


int main() {
    vector<int> vec;

    vec.push_back(10);
    vec.push_back(20);
    vec.push_back(30);
    vec.push_back(40);
    vec.push_back(50);


    vec.emplace_back(60);
    cout << "Size: " << vec.size() << endl;
    cout << "Capacity: " << vec.capacity() << endl;

    for(int val : vec) {
        cout << val << " ";
    }

    vec.pop_back();
    cout << "\nAfter pop_back, Size: " << vec.size() << endl;
    cout << "After pop_back, Capacity: " << vec.capacity() << endl;
    for(int val : vec) {
        cout << val << " ";
    }


    cout << endl;

    cout << "val at idx 2 " << vec[2] << " or " << vec.at(2) << endl;

    // front
    cout << "Front element: " << vec.front() << endl;
    // back
    cout << "Back element: " << vec.back() << endl;
    


    return 0;

}