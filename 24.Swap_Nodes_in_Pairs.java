class Solution {
    public ListNode swapPairs(ListNode head) {

        // If list has 0 or 1 node, no need to swap
        if (head == null || head.next == null) return head;

        ListNode first = head; 
        ListNode sec = head.next; 
        ListNode prev = null;

        // New head after first swap
        head = sec;

        while (first != null && sec != null) {
            ListNode third = sec.next; // Store next pair
            sec.next = first;          // Swap
            first.next = third;        // Connect to next part

            if (prev != null) {
                prev.next = sec;       // Connect previous pair to current
            }

            prev = first;              // Move prev to end of current pair
            first = third;             // Move to next pair
            sec = (first != null) ? first.next : null; // Get next second node
        }

        return head; // Return new head
    }
}
