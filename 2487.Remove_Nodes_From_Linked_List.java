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
    public ListNode removeNodes(ListNode head) {

        // Reverse the list to check nodes from right to left
        head = reverse(head);

        int max = head.val;   // Store max value seen so far
        ListNode curr = head;

        // Traverse the reversed list
        while(curr != null && curr.next != null){

            // Remove node if it is smaller than max
            if(curr.next.val < max){
                curr.next = curr.next.next;
            }
            else{
                // Update max if current node is greater
                curr = curr.next;
                max = curr.val;
            }
        }

        // Reverse again to restore original order
        return reverse(head);
    }

    // Function to reverse the linked list
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
