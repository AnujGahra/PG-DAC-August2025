#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next;

    Node(int val)
    {
        data = val;
        next = NULL;
    }
};

Node *CreateLinkedList(int arr[], int index, int size)
{
    // Base Case
    if (index == size)
    {
        return NULL;
    }

    Node *temp;
    temp = new Node(arr[index]);

    temp->next = CreateLinkedList(arr, index + 1, size);

    return temp;
}

int main()
{
    Node *Head;
    Head = NULL;

    int arr[] = {3, 6, 9, 12, 15};

    Head = CreateLinkedList(arr, 0, 5);


    // Head = NULL;
    // Delete a Node at Start
    // if (Head != NULL)
    // {
    //     Node *temp = Head;
    //     Head = Head->next;
    //     delete temp;
    // }


    // Delete a Node at End
    // if (Head != NULL)
    // {
    //     // Only one node
    //     if (Head->next == NULL)
    //     {
    //         Node *temp = Head;
    //         delete temp;
    //         Head = NULL;
    //     }
    //     else
    //     {
    //         // More than 1 node
    //         Node *curr = Head;
    //         Node *prev = NULL;
    //         while (curr->next != NULL)
    //         {
    //             prev = curr;
    //             curr = curr->next;
    //         }
    //         prev->next = curr->next;
    //         delete curr;
    //     }


    // Delete a Particular Node
    int key = 9;
    if (Head != NULL)
    {
        // If the node to be deleted is the head node
        if (Head->data == key)
        {
            Node *temp = Head;
            Head = Head->next;
            delete temp;
        }
        else
        {
            Node *curr = Head;
            Node *prev = NULL;
            while (curr != NULL && curr->data != key)
            {
                prev = curr;
                curr = curr->next;
            }
            // If the key was found in the linked list
            if (curr != NULL)
            {
                prev->next = curr->next;
                delete curr;
            }
        }
    }


    // using recursion 
    // if(x == 1) {
    //     Node *temp = curr-> next;
    //     delete curr;
    //     return temp;
    // }

    // curr -> next = deleteNode(curr-> next, x - 1);
    // return curr;



    // Delete without head pointer
    void deleteNode(Node *curr) {
        Node *temp = curr->next;
        curr->data = temp->data;
        curr->next = temp->next;
        delete temp;
    }



        

    // Print the linked list
    Node *temp;
    temp = Head;
    while (temp)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }

    return 0;
}
