class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // If there's only one node, delete it by returning null
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Find the middle node using slow and fast pointers
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node
        if (prev != null) {
            prev.next = slow.next;
            slow.next = null; // optional: help GC
        }

        return head;
    }
}
