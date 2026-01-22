#include <iostream>
#include <fstream>
using namespace std;

int main()
{

    ofstream fout;
    fout.open("z1.txt");
    fout << "Hello India\n";
    fout << "Hii, This is Anuj Gahra\n";
    fout << "Hello Bhai\n";

    ifstream fin;
    fin.open("z1.txt");

    string line;

    while (getline(fin, line))
    {
        fout << line << endl;
    }

    fin.close();


    return 0;
}
