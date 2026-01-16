import java.util.*;

class Solution {
    public int[] sortEvenOdd(int[] nums) {

        int[] even = new int[(nums.length + 1) / 2];
        int[] odd  = new int[nums.length / 2];

        int e = 0, o = 0;

        for (int i = 0; i < nums.length; i++)
            if (i % 2 == 0) even[e++] = nums[i];
            else odd[o++] = nums[i];

        Arrays.sort(even);
        Arrays.sort(odd);

        // reverse odd for descending
        for (int i = 0, j = odd.length - 1; i < j; i++, j--) {
            int t = odd[i]; odd[i] = odd[j]; odd[j] = t;
        }

        e = o = 0;
        for (int i = 0; i < nums.length; i++)
            nums[i] = (i % 2 == 0) ? even[e++] : odd[o++];

        return nums;
    }
}
