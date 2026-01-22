#include<iostream>
#include<fstream>
using namespace std;


int main() {


    ifstream fin;
    // file open
    fin.open("zoom.txt");

    // fr read kro
    char c;
    // fin >> c;
    c = fin.get(); // include spaces
    while(!fin.eof()) {
        cout << c;
        // fin>>c;
        c = fin.get();
    }

    fin.close();
}