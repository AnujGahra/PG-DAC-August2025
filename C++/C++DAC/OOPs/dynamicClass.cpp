#include<iostream>
using namespace std;

class Student {
    public:
    string name;
    int age, roll_number;
    string grade;
};


int main() {
    Student *S = new Student;  //Dynamic way to create an object
    (*S).name = " Anuj Kumar";
    (*S).age = 21;
    (*S).roll_number = 07;
    (*S).grade = "A+";

    cout << S->name << " ";
    cout << S->age << " ";
    cout << S->roll_number << " ";
    cout << S->grade << " ";
}