class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // count freq of even no.
        for(int n:nums){
            if(n%2 == 0){
                map.put(n, map.getOrDefault(n, 0)+1);
            }
        }


        int maxFreq = 0;
        int ans = -1;

        // finding the most freq even no.
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            // Higher frequency OR same frequency with smaller number
            if(freq > maxFreq || (freq == maxFreq && num < ans)){
                maxFreq = freq;
                ans = num;
            }
        }
        return ans;
    }
}