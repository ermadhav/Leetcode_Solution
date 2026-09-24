class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        // store the sum of first three elements for comparing
        int ans = nums[0]+nums[1]-nums[2];
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                for (int k=j+1;k<nums.length;k++) {
                    int a=0, b=0, c=0;
                    a = nums[i];
                    b = nums[j];
                    c = nums[k];
                    
                    ans = Math.max(ans, a+b-c);
                    ans = Math.max(ans, b+c-a);
                    ans = Math.max(ans, c+a-b);
                }
            }
        }
        return ans;
    }
}