import java.util.*; // Import necessary classes

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Create a list to store the result
        List<Integer> ans = new ArrayList<>();
        
        // Sort the array to ensure target indices are in sorted order
        Arrays.sort(nums);
        
        // Iterate through the sorted array
        for (int i = 0; i < nums.length; i++) {
            // If current element equals the target, add its index to the result
            if (nums[i] == target) {
                ans.add(i);
            }
        }
        
        // Return the list of target indices
        return ans;
    }
}
