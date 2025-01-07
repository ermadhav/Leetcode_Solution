class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int violations = 0;
        int violationIndex = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                violations++;
                violationIndex = i;
                if (violations > 1) {
                    return false; 
                }
            }
        }
        
        if (violations == 0) {
            return true;
        }
        
        if (violationIndex == 1 || nums[violationIndex - 2] < nums[violationIndex]) {
            return true; 
        }
        
        if (violationIndex == nums.length - 1 || nums[violationIndex - 1] < nums[violationIndex + 1]) {
            return true; 
        }
        
        return false; 
    }
}
