class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int nextAvailable = Integer.MIN_VALUE;
        int count = 0;
        
        for (int num : nums) {
            int low = num - k;
            int high = num + k;
            
            // Move nextAvailable to be at least low
            if (nextAvailable < low) {
                nextAvailable = low;
            }
            
            // If nextAvailable is within the allowed range, use it
            if (nextAvailable <= high) {
                count++;
                nextAvailable++; // next distinct number must be higher
            }
        }
        
        return count;
    }
}