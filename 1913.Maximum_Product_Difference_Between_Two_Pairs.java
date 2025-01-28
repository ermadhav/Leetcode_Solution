class Solution {
    public int maxProductDifference(int[] nums) {
        // int[] sortedArray = Array.sort(nums)

        for(int i=0; i<nums.length-1; i++){
            int smallest =i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[smallest] > nums[j]){
                    smallest = j;
                }
            }
            int temp = nums[smallest];
            nums[smallest] = nums[i];
            nums[i] = temp;
        }
        int l= nums.length;
        int ans = Math.abs((nums[0]*nums[1])-(nums[l-1]*nums[l-2]));
        return ans;
    }
}