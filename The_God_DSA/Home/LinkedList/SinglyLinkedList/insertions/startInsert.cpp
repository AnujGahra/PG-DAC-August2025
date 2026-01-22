#include <iostream>
using namespace std;

class Node
{
public:
    int data;

    Node *next;

    Node(int value)
    {
        data = value;
        next = NULL;
    }
};

int main()
{
    Node *Head;
    Head = NULL;
    // Head = new Node(4);

    // cout << Head->data << endl;
    // cout << Head->next << endl;

    int arr[] = {1, 2, 3, 4, 5};

    // Insert the node at begining

    // Linked List doesn't exist
    for (int i = 0; i < 5; i++)
    {
        if (Head == NULL)
        {
            Head = new Node(arr[i]);
        }

        // Linked List exists
        else
        {
            Node *temp;
            temp = new Node(arr[i]);
            temp->next = Head;
            Head = temp;
        }
    }

    // Print the linked list
    Node *temp = Head;
    while (temp != NULL)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }

    return 0;
}