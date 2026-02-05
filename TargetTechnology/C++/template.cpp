#include <iostream>
using namespace std;

template <typename T>
T sum(T a, T b)
{
    return a + b;
}

int main()
{
    cout << "Sum of 10 and 20: " << sum<int>(10, 20) << endl;
    cout << "Sum of 5.5 and 4.5: " << sum<double>(5.5, 4.5) << endl;
    return 0;
}