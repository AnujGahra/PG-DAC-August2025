#include <iostream>
#include <pair>
using namespace std;

int main()
{
    pair<string, int> p;
    // Two method insert
    // 1st
    // p = make_pair("Satyarth", 21);
    // 2nd
    // p.first = "Satyarth";
    // p.second = 21;

    //  add name, age, weight in pair
    pair<string, pair<int, int>> p;
    p.first = "Satyarth";
    p.second.first = 21;
    p.second.second = 70;

    p = make_pair("Satyarth", make_pair(21, 70));

    // cout << p.first << " " << p.second << endl;

    cout << p.first << " " << p.second.first << " " << p.second.second << endl;
}
