class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0); // Dummy node before head
        dummy.next = head;

        ListNode prevGroupEnd = dummy; // End of previous group
        ListNode curr = head;
        int groupSize = 1;

        while (curr != null) {
            // Count actual nodes in current group
            int count = 0;
            ListNode temp = curr;
            while (count < groupSize && temp != null) {
                temp = temp.next;
                count++;
            }

            ListNode nextGroupStart = temp; // Start of next group

            if (count % 2 == 0) {
                // Reverse current group
                ListNode prev = nextGroupStart;
                ListNode node = curr;
                for (int i = 0; i < count; i++) {
                    ListNode next = node.next;
                    node.next = prev;
                    prev = node;
                    node = next;
                }
                prevGroupEnd.next = prev;    // Connect reversed group
                prevGroupEnd = curr;         // Update prevGroupEnd
            } else {
                // No reversal, move prevGroupEnd forward
                prevGroupEnd = curr;
                for (int i = 1; i < count; i++) {
                    prevGroupEnd = prevGroupEnd.next;
                }
            }

            curr = nextGroupStart; // Move to next group
            groupSize++;
        }

        return dummy.next; // Return updated list head
    }
}
