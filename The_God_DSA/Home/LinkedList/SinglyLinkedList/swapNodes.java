package SinglyLinkedList;

class swapNodes {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Recursive function to swap nodes in pairs
    public static ListNode swapPairs(ListNode head) {

        // Base case: 0 or 1 node
        if (head == null || head.next == null)
            return head;

        // Second node
        ListNode temp = head.next;

        // Recursive call for remaining list
        head.next = swapPairs(temp.next);

        // Swap current pair
        temp.next = head;

        // Return new head of this pair
        return temp;
    }

    // Helper method to create linked list
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // Helper method to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = createList(arr);

        System.out.print("Before: ");
        printList(head);

        head = swapPairs(head);

        System.out.print("After:  ");
        printList(head);
    }
}
