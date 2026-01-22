#include<iostream>
using namespace std;


class Student {
    private:
    string name;
    int age, roll_number;
    string grade;

    // Function Getter and setter 
    public:
    void setName(string s) {
        name = s;
    }

    void setAge(int a) {
        age = a;
    }

    void setRollNumber(int a) {
        roll_number = a;
    }

    void setGrade(string g) {
        grade = g;
    }


    // Getter function
    void getname(){
        cout << name << endl;
    }

    void getage(){
        cout << age << endl;
    }

    void getrollno(){
        cout << roll_number << endl;
    }

    void getgrade(){
        cout << grade << endl;
    }

};

int main() {
    Student S1;
    // S1.name = "Anuj Kumar";
    // S1.age = 10;
    // S1.roll_number = 21;
    // S1.grade = "A+";


    // cout << S1.name << " ";


    S1.setName("Anuj Gahra");
    S1.setAge(23);
    S1.setRollNumber(07);
    S1.setGrade("A+");


    S1.getname();
    S1.getage();
    S1.getrollno();
    S1.getgrade();
}