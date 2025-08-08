/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode sortList(ListNode head) {
        // Base case: If the list is empty or contains only one node, it is already sorted
        if (head == null || head.next == null) return head;

        // Step 1: Use slow & fast pointers to find the middle of the list
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;        // Keep track of the node before the midpoint
            slow = slow.next;   // Move slow pointer by 1
            fast = fast.next.next; // Move fast pointer by 2
        }

        // Step 2: Split the list into two halves
        prev.next = null; // This cuts the linked list into two halves

        // Step 3: Recursively sort both halves
        ListNode left = sortList(head);  // Sort left half
        ListNode right = sortList(slow); // Sort right half

        // Step 4: Merge the sorted halves
        return merge(left, right);
    }

    // Helper function to merge two sorted linked lists
    private ListNode merge(ListNode a, ListNode b) {
        // Create a dummy node to simplify merging logic
        ListNode dummy = new ListNode(0), tail = dummy;

        // Merge while both lists have elements
        while (a != null && b != null) {
            if (a.val < b.val) {  // Pick the smaller value
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next; // Move the tail pointer
        }

        // Attach any remaining nodes from 'a' or 'b'
        tail.next = (a != null) ? a : b;

        // Return the merged sorted list (skipping the dummy node)
        return dummy.next;
    }
}
