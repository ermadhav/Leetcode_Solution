class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Map to store number and its last index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            
            // Check if number already exists and index difference is within k
            if(map.containsKey(nums[i]) && i - map.get(nums[i]) <= k){
                return true;
            }
            
            // Update the index of the current number
            map.put(nums[i], i);
        }
        
        // No nearby duplicate found
        return false;
    }
}
