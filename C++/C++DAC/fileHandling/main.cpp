#include <iostream>
#include <fstream>
using namespace std;

/*
The useful classes for working with files in C++ are:
1. fstreambase
2. ifstream -> derived from fstreambase 
3. ofstream -> derived from fstreambase
*/

int main() {
    string st = "Anuj Gahra";

    // Step 1: Write to the file using ofstream
    ofstream out("sample.txt"); // opens file for writing
    out << st;
    out.close(); // close after writing

    // Step 2: Read from the same file using ifstream
    string st2;
    ifstream in("sample.txt"); // opens file for reading
    in >> st2;
    in.close();

    cout << "Content read from file: " << st2 << endl;

    return 0;
}
