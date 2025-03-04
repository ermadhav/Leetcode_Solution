class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node that points to the original head
        // This helps handle edge cases where the head itself needs to be removed
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        // Pointer to traverse the list
        ListNode current = dummy;
        
        // Iterate through the linked list
        while (current.next != null) {
            // If the next node contains the value to be removed, skip it
            if (current.next.val == val) {
                current.next = current.next.next; // Remove the node by bypassing it
            } else {
                // Move to the next node
                current = current.next;
            }
        }
        
        // Return the new head of the linked list (dummy.next)
        return dummy.next;
    }
}
