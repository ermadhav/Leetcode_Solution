class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        while (current != null) {
            // Check if there is a duplicate
            while (current.next != null && current.val == current.next.val) {
                current = current.next;
            }
            
            // If prev.next is still current, there was no duplicate
            if (prev.next == current) {
                prev = prev.next;
            } else {
                // Skip all duplicates
                prev.next = current.next;
            }
            
            current = current.next;
        }
        return dummy.next;
    }
}
