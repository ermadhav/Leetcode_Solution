class Solution {
    public int getDecimalValue(ListNode head) {
        int num = 0;  // Initialize result variable to store decimal value
        
        // Traverse the linked list
        while (head != null) {
            // Shift the current number left (multiply by 2) and add the current node's value
            num = num * 2 + head.val;
            
            // Move to the next node
            head = head.next;
        }
        
        return num;  // Return the computed decimal value
    }
}