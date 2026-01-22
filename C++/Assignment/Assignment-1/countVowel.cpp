#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    int vowelCount = 0;

    cout << "Enter a string: ";
    getline(cin, str);  // allows input with spaces

    for (int i = 0; i < str.length(); i++) {
        char ch = tolower(str[i]); // convert to lowercase for simplicity
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowelCount++;
        }
    }

    cout << "Number of vowels: " << vowelCount << endl;

    return 0;
}
