import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Map<Integer, Integer> freq = new HashMap<>(); // To store frequency of elements in current window

        for (int i = 0; i < n; i++) {
            // Add current element to frequency map
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);

            // Remove the element that moves out of the sliding window
            if (i >= k) {
                freq.put(nums[i - k], freq.get(nums[i - k]) - 1);
                if (freq.get(nums[i - k]) == 0) freq.remove(nums[i - k]);
            }

            // Once the first full window is formed (size k)
            if (i >= k - 1) {
                // Convert frequency map to a list for sorting
                List<int[]> list = new ArrayList<>();
                for (var e : freq.entrySet())
                    list.add(new int[]{e.getKey(), e.getValue()});

                // Sort by frequency (descending), then by value (descending)
                list.sort((a, b) -> b[1] == a[1] ? b[0] - a[0] : b[1] - a[1]);

                // Compute x-sum using top x most frequent elements
                int sum = 0, cnt = 0;
                for (var e : list) {
                    sum += e[0] * e[1];
                    if (++cnt == x) break; // Stop after taking x elements
                }

                // Store result for this window
                ans[i - k + 1] = sum;
            }
        }
        return ans;
    }
}
