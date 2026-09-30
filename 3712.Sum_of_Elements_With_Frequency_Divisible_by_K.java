class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        // count the frequencies of each no.
        for (int n:nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int sum=0;
        // check each freq of each no. if divisible by k or not 
        for(int n:map.keySet()){
            int freq =map.get(n);
            if(freq%k == 0){
                // if divisible add it to sum
                sum += n*freq;
            }
        }
        return sum;
    }
}