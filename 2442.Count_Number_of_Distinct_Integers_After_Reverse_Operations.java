class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
            int rev = 0;
            int x = n;
            while(x>0){
                rev = rev * 10+x%10;
                x/= 10;
            }
            set.add(rev);
        }
        return set.size();
    }
}