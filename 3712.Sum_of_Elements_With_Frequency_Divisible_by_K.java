class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int n:nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int sum=0;
        for(int n:map.keySet()){
            int freq =map.get(n);
            if(freq%k == 0){
                sum += n*freq;
            }
        }
        return sum;
    }
}