#include<iostream>
#include<vector>
#include<string>

using namespace std;

class Chai{
    private:
        string teaName;
        int servings;

    public:
    Chai(string name, int serve): teaName(name), servings(serve) {}


    void display() const {
        cout << "teaname: " << teaName << endl;
    }
};



int main() {
    Chai msalaChai("Masala Chai", 4);
    Chai gingerChai("Ginger Chai", 8);

    msalaChai.display();
    gingerChai.display();
}