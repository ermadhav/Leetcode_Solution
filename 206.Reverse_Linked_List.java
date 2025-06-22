class Solution {
    public ListNode reverseList(ListNode head) {
        // Base case: if the list is empty or has only one node, return it as-is
        if (head == null || head.next == null) {
            return head;
        }

        // Recursively reverse the rest of the list
        ListNode rest = reverseList(head.next);

        // Set the next node's next pointer to point back to the current node
        head.next.next = head;

        // Disconnect the current node from the rest to avoid cycle
        head.next = null;

        // Return the new head of the reversed list
        return rest;
    }
}
