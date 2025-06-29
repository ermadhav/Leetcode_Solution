class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head; // slow pointer
        ListNode fast = head; // fast pointer

        // Step 1: Check if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;           // move slow by 1
            fast = fast.next.next;      // move fast by 2

            if (slow == fast) {         // cycle detected
                // Step 2: Find the start of the cycle
                ListNode entry = head;  // start from head
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry; // cycle starts here
            }
        }

        return null; // no cycle
    }
}