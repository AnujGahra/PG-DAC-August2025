import java.lang.classfile.components.ClassPrinter.ListNode;

public class IntersectionofTwoLinkedLists {

    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            
        }
    }
    
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA = headA;
        ListNode tempB = headB;

        int lengthA = 0;
        while(tempA != null) {
            lengthA++;
            tempA = tempA.next;
        } 

        int lengthB = 0;
        while(tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;

        if(lengthA > lengthB){
            int steps = lengthA - lengthB;
            for(int i = 1; i<=steps; i++){
                tempA = tempA.next;
            } 
        }
        else {
            int steps = lengthB - lengthA;
            for(int i = 1; i<=steps; i++){
                tempB = tempB.next;
            }
        }

        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;
        
    }


    // main method
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);
    
        ListNode headB = new ListNode(6);
        headB.next = headA.next.next; // Intersection at node with value 3
        
        ListNode intersection = getIntersectionNode(headA, headB);
        if(intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
