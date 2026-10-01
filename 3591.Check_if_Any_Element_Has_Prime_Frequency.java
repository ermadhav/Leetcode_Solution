class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        // will be used to store key and frequencies
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        // check the frequency of each number
        for(int count:freq.values()){
            // 0 ans 1 cannot be prime
            if(count<2) continue;
            boolean ans = true;
            for(int i=2; i*i<= count; i++){
                if(count%i == 0){
                    ans = false;
                    break;
                }
            }
            if(ans) return true;
            
        }
        return false;
    }
}