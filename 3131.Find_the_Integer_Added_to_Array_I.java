class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int x=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0; i < nums1.length; i++){
             x = nums2[i] - nums1[i];
        }
        return x;
    }
}