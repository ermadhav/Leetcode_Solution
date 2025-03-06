class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { 
        this.val = val; 
        this.next = null; 
    }
}

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // If the list is empty or has only one node, return as is.
        }

        ListNode odd = head; // Pointer for odd-indexed nodes
        ListNode even = head.next; // Pointer for even-indexed nodes
        ListNode evenHead = even; // Store the start of the even list

        while (even != null && even.next != null) {
            odd.next = even.next; // Link the current odd node to the next odd node
            odd = odd.next; // Move odd pointer

            even.next = odd.next; // Link the current even node to the next even node
            even = even.next; // Move even pointer
        }

        odd.next = evenHead; // Attach even list at the end of the odd list
        return head; // Return the reordered list
    }
}
