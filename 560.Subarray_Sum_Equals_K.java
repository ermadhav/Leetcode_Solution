import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case: sum 0 occurs once

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num; // running sum
            count += map.getOrDefault(sum - k, 0); // check if (sum - k) seen before
            map.put(sum, map.getOrDefault(sum, 0) + 1); // update sum frequency
        }

        return count;
    }
}
