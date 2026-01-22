#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;

    Node(int val) {
        data = val;
        next = NULL;
    }
};

Node* CreateLinkedListAtStart(int arr[], int index, int size, Node* prev) {
    // Base case
    if (index == size) {
        return prev;
    }

    Node* temp = new Node(arr[index]);
    temp->next = prev;

    return CreateLinkedListAtStart(arr, index + 1, size, temp);
}

int main() {

    Node* Head = NULL;
    int arr[] = {10, 20, 35, 40, 50};
    int size = sizeof(arr) / sizeof(arr[0]);

    // Create linked list
    Head = CreateLinkedListAtStart(arr, 0, size, Head);

    // Insert at particular position
    int x = 3;        // position (1-based)
    int value = 30;

    Node* temp = Head;
    x--;

    while (x--) {
        temp = temp->next;
    }

    Node* temp2 = new Node(value);
    temp2->next = temp->next;
    temp->next = temp2;

    // Print the linked list
    temp = Head;
    while (temp) {
        cout << temp->data << " ";
        temp = temp->next;
    }

    return 0;
}
