class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prevA = list1;
        for (int i = 0; i < a - 1; i++) {
            prevA = prevA.next;
        }

        ListNode afterB = prevA.next;
        for (int i = 0; i < (b - a + 1); i++) {
            afterB = afterB.next;
        }

        prevA.next = list2;

        ListNode tail2 = list2;
        while (tail2.next != null) {
            tail2 = tail2.next;
        }

        tail2.next = afterB;

        return list1;
    }
}
