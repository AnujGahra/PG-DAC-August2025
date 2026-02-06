#include<iostream>
#include<fstream>
using namespace std;


int main() {

    ofstream fout("text.txt");
    fout<< "Hello World " ;

    fout.close();
}