import java.util.List;

class Solution {
    public ListNode deleteDuplicates(List head) {
        ListNode curr = head;  // Pointer to traverse the linked list
        
        while (curr != null && curr.next != null) { // Traverse until the end
            if (curr.val == curr.next.val) { 
                // If duplicate found, skip the next node
                curr.next = curr.next.next;
            } else {
                // Move to the next node
                curr = curr.next;
            }
        }
        return head;  // Return the updated list without duplicates
    }
}
