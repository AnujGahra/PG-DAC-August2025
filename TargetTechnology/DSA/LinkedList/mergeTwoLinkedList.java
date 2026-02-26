public class mergeTwoLinkedList {


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode head = new ListNode(100);
        ListNode temp = head;

        while(temp1 != null && temp2 != null) {
            if(temp1.val < temp2.val) {
                ListNode a = new ListNode(temp1.val);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            } else {
                ListNode a = new ListNode(temp2.val);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }

        // Append any remaining nodes from either list
        if(temp1 != null) {
            temp.next = temp1;
        } else {
            temp.next = temp2;
        }

        return head.next; // Return the actual head of merged list (skip dummy node)
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);

        ListNode mergedHead = mergeTwoLists(head1, head2);

        // Print the merged linked list
        printList(mergedHead);
    }
}
