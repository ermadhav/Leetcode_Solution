class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prevA = list1;  // Pointer to (a-1)th node
        for (int i = 0; i < a - 1; i++) {
            prevA = prevA.next;
        }

        ListNode afterB = prevA.next;  // Pointer to (b+1)th node
        for (int i = 0; i < (b - a + 1); i++) {
            afterB = afterB.next;
        }

        prevA.next = list2;  // Link (a-1)th node to list2 head

        ListNode tail2 = list2;  // Find the last node of list2
        while (tail2.next != null) {
            tail2 = tail2.next;
        }

        tail2.next = afterB;  // Link list2's tail to (b+1)th node

        return list1;  // Return modified list1
    }
}
