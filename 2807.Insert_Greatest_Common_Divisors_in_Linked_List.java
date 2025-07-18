class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        // If the list is empty or has only one node, nothing to insert, return as is
        if (head == null || head.next == null) return head;

        // Start from the head of the list
        ListNode curr = head;

        // Traverse the list until the second last node
        while (curr != null && curr.next != null) {
            // Calculate gcd of current node value and next node value
            int gcdValue = gcd(curr.val, curr.next.val);
            
            // Create a new node with the gcd value
            ListNode gcdNode = new ListNode(gcdValue);

            // Insert the gcd node between current node and next node
            gcdNode.next = curr.next;
            curr.next = gcdNode;

            // Move current pointer to the node after the inserted gcd node
            curr = gcdNode.next;
        }

        // Return the modified list head
        return head;
    }

    // Helper method to compute gcd of two integers using Euclidean Algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;    // Store b temporarily
            b = a % b;       // Update b to remainder of a divided by b
            a = temp;        // Update a to previous value of b
        }
        return a;            // When b is zero, a contains the gcd
    }
}