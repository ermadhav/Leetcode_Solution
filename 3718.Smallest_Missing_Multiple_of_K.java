class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        
        // Array ke saare elements ko HashSet mein add kar rahe hain
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        // Sabse pehla multiple k se start hoga
        int multiple = k;
        while(set.contains(multiple)){
            multiple += k ;
        }
        return multiple;
    }
}