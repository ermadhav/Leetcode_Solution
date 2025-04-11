class Solution {
    public ListNode insertionSortList(ListNode head) {
        // Dummy node acts as the starting point of the sorted list
        ListNode dummy = new ListNode(0);
        ListNode current = head;

        while (current != null) {
            // At each iteration, insert current into the sorted part
            ListNode prev = dummy;
            ListNode next = current.next;

            // Find the correct position in the sorted part (starting from dummy)
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }

            // Insert current between prev and prev.next
            current.next = prev.next;
            prev.next = current;

            // Move to the next node in the original list
            current = next;
        }

        return dummy.next;
    }
}
