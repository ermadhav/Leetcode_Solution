class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);

        // Har consecutive element ke beech missing numbers ko check kar 
        for(int i=0; i<nums.length-1; i++){

            // nums[i] aur nums[i+1] ke beech ke numbers ko add kar
            for(int j = nums[i]+1; j<nums[i+1]; j++) {
                ans.add(j);
            }
        }
        return ans;
    }
}