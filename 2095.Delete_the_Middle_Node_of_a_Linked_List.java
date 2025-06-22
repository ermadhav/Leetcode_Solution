class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // Edge case: if list has only one node, return null
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Use two pointers to find the middle node
        while (fast != null && fast.next != null) {
            prev = slow;            // track node before slow
            slow = slow.next;       // move slow by 1
            fast = fast.next.next;  // move fast by 2
        }

        // Now, 'slow' is the middle node
        prev.next = slow.next; // delete the middle node
        slow.next = null;      // optional: helps garbage collection

        return head;
    }
}
