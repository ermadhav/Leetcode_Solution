class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Store values to be removed in a HashSet for quick lookup
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        // Use a dummy node to handle edge cases (like deleting the head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        // Traverse the list and remove matching nodes
        while (curr.next != null) {
            if (set.contains(curr.next.val)) {
                // Skip the node if its value is in the set
                curr.next = curr.next.next;
            } else {
                // Move to the next node
                curr = curr.next;
            }
        }

        // Return the new head of the list
        return dummy.next;
    }
}
