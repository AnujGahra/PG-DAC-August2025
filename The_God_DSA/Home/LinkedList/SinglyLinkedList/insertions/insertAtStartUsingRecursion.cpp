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
    int arr[] = {5, 10, 15, 20, 25};
    int size = sizeof(arr) / sizeof(arr[0]);

    // Insert at the start using recursion
    Head = CreateLinkedListAtStart(arr, 0, size, Head);

    // Print the linked list
    Node* temp = Head;
    while (temp) {
        cout << temp->data << " ";
        temp = temp->next;
    }

    return 0;
}
