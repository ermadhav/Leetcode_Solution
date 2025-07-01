class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Base case: no need to reverse if k <= 1 or list is empty
        if (k <= 1 || head == null) {
            return head;
        }

        // Dummy node to simplify edge cases (e.g., reversing at head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // This points to the node before the current group
        ListNode groupPrev = dummy;

        while (true) {
            // Step 1: Find the k-th node from groupPrev
            ListNode kth = groupPrev;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }
            // If fewer than k nodes remain, stop
            if (kth == null) break;

            // Step 2: Reverse k nodes
            ListNode groupNext = kth.next;       // Node after the k-group
            ListNode prev = groupNext;           // Start with the node after the group
            ListNode curr = groupPrev.next;      // First node in the group

            // Reverse the k nodes
            for (int i = 0; i < k; i++) {
                ListNode temp = curr.next;       // Temporarily store next node
                curr.next = prev;                // Reverse the pointer
                prev = curr;                     // Move prev forward
                curr = temp;                     // Move curr forward
            }

            // Step 3: Connect the reversed group with previous part
            ListNode temp = groupPrev.next;      // temp is the start of the group before reversal
            groupPrev.next = prev;               // Link the previous group to new head (prev)
            groupPrev = temp;                    // Move groupPrev to the end of the reversed group
        }

        // Return the new head of the list
        return dummy.next;
    }
}
