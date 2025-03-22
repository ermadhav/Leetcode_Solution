// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;

    // Constructor for a node with a given value
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    // Constructor for a node with a value and a reference to the next node
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // Step 1: Find the (a-1)th node in list1
        ListNode prevA = list1;
        for (int i = 0; i < a - 1; i++) {
            prevA = prevA.next;
        }

        // Step 2: Find the (b+1)th node in list1
        ListNode afterB = prevA.next;
        for (int i = 0; i < (b - a + 1); i++) {
            afterB = afterB.next;
        }

        // Step 3: Connect the (a-1)th node to the head of list2
        prevA.next = list2;

        // Step 4: Find the last node of list2
        ListNode tail2 = list2;
        while (tail2.next != null) {
            tail2 = tail2.next;
        }

        // Step 5: Connect the last node of list2 to the (b+1)th node in list1
        tail2.next = afterB;

        // Return the modified list1
        return list1;
    }
}
