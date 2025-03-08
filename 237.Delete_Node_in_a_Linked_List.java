class Solution {
    public void deleteNode(ListNode node) {
        
        // Copy the value of the next node into the current node
        node.val = node.next.val;
        
        // Update the next pointer to skip the next node
        node.next = node.next.next;
    }
}
