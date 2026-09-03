class Solution {
    public int maximizeGreatness(int[] nums) {
        int i=0, j=0;
        int greatness = 0;
        Arrays.sort(nums);
        while(i < nums.length && j < nums.length){
            // findind as many small < large pairs as possible.
            if(nums[j] > nums[i]){
                greatness++;
                i++;
                j++;
            }else{
                j++;
            }
        }          
        return greatness;
    }
}