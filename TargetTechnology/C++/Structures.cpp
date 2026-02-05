// Structures are used to group related variables of different types under a single name.
#include <iostream>
using namespace std;

struct Point{
    int x, y;
};

int main() {
    Point p = {10, 20};

    cout << "Point coordinates: (" << p.x << ", " << p.y << ")" << endl;

    p.x = 30;
    p.y = 40;
    cout << "Updated Point coordinates: (" << p.x << ", " << p.y << ")" << endl;
    return 0;
}