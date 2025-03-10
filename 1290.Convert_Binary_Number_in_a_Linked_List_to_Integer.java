class ListNode {

    int val;  // Value of the node (either 0 or 1)
    ListNode next;  // Pointer to the next node in the list
    
    // Constructor to initialize the node with a value
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    
    // Constructor to initialize the node with a value and the next node reference
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
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