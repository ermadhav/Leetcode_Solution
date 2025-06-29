class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head; // slow pointer moves 1 step
        ListNode fast = head; // fast pointer moves 2 steps

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move slow by 1
            fast = fast.next.next;     // move fast by 2

            if (slow == fast) {        // if they meet, cycle exists
                return true;
            }
        }

        return false; // if loop ends, no cycle
    }
}
