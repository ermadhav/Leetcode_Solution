import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // Step 1: sort array for two-pointer technique
        int n = nums.length;

        // First loop: pick the 1st number
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicates for 1st number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Second loop: pick the 2nd number
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicates for 2nd number
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // Two pointers for the remaining 2 numbers
                int l = j + 1, r = n - 1;

                while (l < r) {
                    // Use long to prevent overflow for large inputs
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];

                    if (sum == target) {
                        // Found a valid quadruplet
                        res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));

                        // Skip duplicates for the 3rd number
                        while (l < r && nums[l] == nums[l + 1]) l++;
                        // Skip duplicates for the 4th number
                        while (l < r && nums[r] == nums[r - 1]) r--;

                        // Move both pointers inward after processing
                        l++; r--;
                    } 
                    else if (sum < target) {
                        // If sum is too small, move left pointer right
                        l++;
                    } 
                    else {
                        // If sum is too large, move right pointer left
                        r--;
                    }
                }
            }
        }
        return res; // Return all unique quadruplets
    }
}
