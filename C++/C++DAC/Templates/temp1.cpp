#include <iostream>
using namespace std;

// Template class
template <class T>
class MyVector {
    T* arr;
    int size;

public:
    MyVector(int m) {
        size = m;
        arr = new T[size];
    }

    void setValue(int index, T value) {
        arr[index] = value;
    }

    T dotProduct(MyVector &v) {
        T d = 0;
        for (int i = 0; i < size; i++) {
            d += this->arr[i] * v.arr[i];
        }
        return d;
    }

    ~MyVector() { // destructor to free memory
        delete[] arr;
    }
};

int main() {
    // Using int data type
    MyVector<int> v1(3);
    v1.setValue(0, 4);
    v1.setValue(1, 3);
    v1.setValue(2, 1);

    MyVector<int> v2(3);
    v2.setValue(0, 1);
    v2.setValue(1, 0);
    v2.setValue(2, 1);

    int result1 = v1.dotProduct(v2);
    cout << "Dot Product (int): " << result1 << endl;

    // Using float data type
    MyVector<float> f1(3);
    f1.setValue(0, 1.5);
    f1.setValue(1, 2.5);
    f1.setValue(2, 3.0);

    MyVector<float> f2(3);
    f2.setValue(0, 0.5);
    f2.setValue(1, 1.5);
    f2.setValue(2, 2.0);

    float result2 = f1.dotProduct(f2);
    cout << "Dot Product (float): " << result2 << endl;

    return 0;
}
