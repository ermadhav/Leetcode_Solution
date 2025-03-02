class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Base case: if one of the lists is empty, return the other list
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Compare values of the two nodes
        if (list1.val < list2.val) {
            // If list1's value is smaller, link it to the merged result of the next nodes
            list1.next = mergeTwoLists(list1.next, list2);
            return list1; // Return list1 as it's the current smallest node
        } else {
            // If list2's value is smaller or equal, link it to the merged result of the next nodes
            list2.next = mergeTwoLists(list1, list2.next);
            return list2; // Return list2 as it's the current smallest node
        }
    }
}
