

 class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy node to simplify handling of the head of the resulting list
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead; // Pointer to build the new linked list
        int carry = 0; // Variable to store carry from sum

        // Iterate while there are digits left in either l1 or l2, or a carry remains
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with carry from previous iteration

            // Add value from l1 if it exists
            if (l1 != null) {
                sum +=(int) l1.val;
                l1 = l1.next; // Move to next node in l1
            }
            // Add value from l2 if it exists
            if (l2 != null) {
                sum +=(int) l2.val;
                l2 = l2.next; // Move to next node in l2
            }

            // Compute new carry (sum divided by 10)
            carry = sum / 10;
            
            // Create new node with the unit digit of the sum
            current.next = new ListNode();
            
            // Move the pointer to the next node
            current = current.next;
        }

        // Return the resulting linked list (skipping the dummy head)
        return dummyHead.next;
    }
}
