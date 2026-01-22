#include<iostream>
#include<fstream>
using namespace std;


int main() {

    // File ko open krana
    // ofstream fout; // for write file
    // fout.open("zoom.txt");

    // Write kar sakta hoo
    ofstream fout("gfg.txt", ios:: in); // for write file
    fout << "Hello India";

    fout.close(); // Resource release kr paau
}