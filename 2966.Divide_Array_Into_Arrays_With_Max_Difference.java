class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);

        // n/3 groups banenge aur har group mein 3 elements honge
        int[][] ans = new int[nums.length/3][3];
        // Har baar 3 elements ko ek group mein lenge
        for(int i=0; i<nums.length; i +=3){

            // Group ke smallst aur largst element ka difference check karenge agar difference k se bada hai, toh valid group nahi ban sakta
            if(nums[i+2]-nums[i]>k){
                return new int[0][0]; // return emoty array
            }
            // Current 3 elements ko answer mein store karo
            ans[i/3][0] = nums[i];
            ans[i/3][1] = nums[i+1];
            ans[i/3][2] = nums[i+2];
        }
        return ans;
    }
}