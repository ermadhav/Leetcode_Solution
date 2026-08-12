class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>();

        // Add every number of array to the set

        for(int num: nums){
            set.add(num);
        }

        int count = 0;

        // har no. ko triplet ke starting element se compare kara hai
        for(int num:nums){

            
            if(set.contains(num+diff) && set.contains(num+2*diff)){
                count++;
            }
        }
        
        return count;
    }
}