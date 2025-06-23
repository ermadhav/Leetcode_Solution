class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode front = head, end = head;

        // Move 'front' to the k-th node from the start
        for (int i = 1; i < k; i++) front = front.next;
        ListNode first = front; // Save the k-th node from start

        // Move 'front' to the end, and 'end' will reach the k-th from end
        while (front.next != null) {
            front = front.next;
            end = end.next;
        }
        // 'end' is now at the k-th node from end

        // Swap the values
        int temp = first.val;
        first.val = end.val;
        end.val = temp;

        return head; // Return the modified list
    }
}
