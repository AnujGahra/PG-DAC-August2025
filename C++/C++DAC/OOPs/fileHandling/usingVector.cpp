#include <iostream>
#include <fstream>
#include <vector>
#include <algorithm> // ✅ Needed for sort()

using namespace std;

int main()
{
    vector<int> arr(5);
    cout << "Enter 5 numbers: ";

    for (int i = 0; i < 5; i++)
    {
        cin >> arr[i];
    }

    // ✅ Open file in write mode
    ofstream fout("zero.txt");

    // ✅ Write original data
    fout << "Original data:\n";
    for (int i = 0; i < 5; i++)
    {
        fout << arr[i] << " ";
    }
    fout << "\n";

    // ✅ Sort the array
    sort(arr.begin(), arr.end());

    // ✅ Write sorted data
    fout << "Sorted data:\n";
    for (int i = 0; i < 5; i++)
    {
        fout << arr[i] << " ";
    }
    fout << "\n";

    // ✅ Close file
    fout.close();

    cout << "Data written to zero.txt successfully!" << endl;

    return 0;
}
