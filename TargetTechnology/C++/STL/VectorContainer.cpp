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


    return 0;

}