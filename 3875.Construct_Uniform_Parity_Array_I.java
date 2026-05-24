class Solution {
    public boolean uniformArray(int[] nums1) {
        if(nums1.length <= 2){
            return true;
        }
        int diff = nums1[1]- nums1[0];
        for(int i=2; i<nums1.length; i++){
            if(nums1[i] - nums1[i-1] != diff){
                return false;
            }
        }
        return true;
    }
}