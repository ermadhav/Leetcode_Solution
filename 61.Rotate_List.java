class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Edge cases: negative k, empty list, or single node
        if(k < 0 || head == null || head.next == null){
            return head;
        }

        // Find the length and last node of the list
        int length = 1;
        ListNode lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            length++;
        }

        // Make the list circular
        lastNode.next = head;

        // Calculate effective rotations
        int rotations = k % length;
        int skip = length - rotations;

        // Find the new last node after rotation
        ListNode newLast = head;
        for(int i = 0; i < skip - 1; i++){
            newLast = newLast.next;
        }

        // Set the new head and break the circle
        head = newLast.next;
        newLast.next = null;

        return head;
    }
}