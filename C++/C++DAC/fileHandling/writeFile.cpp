#include <iostream>
#include <fstream>

using namespace std;

int main()
{
    ofstream hout("anuj.txt");
    cout << "Enter your name: ";
    string name;
    cin >> name;

    hout << name;

    return 0;
}

