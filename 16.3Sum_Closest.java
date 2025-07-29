import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Step 1: sort array for two-pointer technique
        int closest = nums[0] + nums[1] + nums[2]; // initial guess (first 3 numbers)

        // Step 2: iterate through array, fixing one number at a time
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1; // two pointers

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r]; // current triplet sum

                // Step 3: update closest if this sum is nearer to target
                if (Math.abs(sum - target) < Math.abs(closest - target))
                    closest = sum;

                // Step 4: move pointers to get closer to target
                if (sum < target) 
                    l++;   // need a bigger sum
                else     
                    r--;   // need a smaller sum
            }
        }
        return closest; // Step 5: return the best sum found
    }
}
