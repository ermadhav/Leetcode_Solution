class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head; // Edge case: if list is empty or no need to reverse
        
        ListNode dummy = new ListNode(); // Dummy node to handle edge cases
        dummy.next = head;
        ListNode prev = dummy;
        
        // Move `prev` to the node before `left`
        for (int i = 0; i < left - 1; i++) prev = prev.next;
        
        ListNode curr = prev.next; // `curr` points to the start of the sublist
        ListNode next;
        
        // Reverse nodes from position `left` to `right`
        for (int i = 0; i < right - left; i++) {
            next = curr.next; 
            curr.next = next.next; // Remove `next` from its current position
            next.next = prev.next; // Insert `next` at the beginning of the sublist
            prev.next = next; // Update `prev` to point to the new head of the sublist
        }
        
        return dummy.next; // Return the new head of the list
    }
}
