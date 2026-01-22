package CircularLinkedList;


public class palindromeLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to check palindrome in circular linked list
    public static boolean isPalindrome(Node head) {

        // Empty or single node list
        if (head == null || head.next == head) {
            return true;
        }

        // Step 1: Count nodes
        int count = 1;
        Node temp = head.next;
        while (temp != head) {
            count++;
            temp = temp.next;
        }

        // Step 2: Copy elements into array
        int[] arr = new int[count];
        temp = head;
        for (int i = 0; i < count; i++) {
            arr[i] = temp.data;
            temp = temp.next;
        }

        // Step 3: Check palindrome
        int i = 0, j = count - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    // Helper function to create circular linked list
    public static Node createCircularList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        curr.next = head; // make circular
        return head;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1};

        Node head = createCircularList(arr);

        if (isPalindrome(head)) {
            System.out.println("Circular Linked List is Palindrome");
        } else {
            System.out.println("Circular Linked List is NOT Palindrome");
        }
    }
}

