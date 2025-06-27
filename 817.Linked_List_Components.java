import java.util.*;

class Solution {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n); // Add nums to set for quick lookup

        int count = 0;
        while (head != null) {
            // Count if current is in set and next is not (end of component)
            if (set.contains(head.val) &&
               (head.next == null || !set.contains(head.next.val)))
                count++;
            head = head.next;
        }
        return count;
    }
}
