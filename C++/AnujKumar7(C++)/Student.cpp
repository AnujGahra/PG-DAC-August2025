#include <iostream>
using namespace std;

// Base Class
class Student {
protected:
    string name;
    int rollNo;

public:
    void getStudentDetails() {
        cout << "Enter student name: ";
        getline(cin, name);
        cout << "Enter roll number: ";
        cin >> rollNo;
    }

    void displayStudentDetails() {
        cout << "\nName       : " << name;
        cout << "\nRoll No    : " << rollNo;
    }
};

// Base class 2
class Marks {
protected:
    int m1, m2, m3;

public:
    void getMarks() {
        cout << "\nEnter marks of 3 subjects: ";
        cin >> m1 >> m2 >> m3;
    }

    int totalMarks() {
        return m1 + m2 + m3;
    }
};

// Derived class (Multiple Inheritance)
class Result : public Student, public Marks {
public:
    void displayResult() {
        int total = totalMarks();
        float percentage = total / 3.0f;

        displayStudentDetails();
        cout << "\nTotal Marks: " << total;
        cout << "\nPercentage : " << percentage << "%";
    }
};

int main() {
    Result r;

    r.getStudentDetails();
    r.getMarks();
    r.displayResult();

    return 0;
}
