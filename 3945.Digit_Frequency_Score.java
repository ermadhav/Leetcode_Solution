class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Number ke har digit ko check karo
        while(n>0){

            // last digit nikalo
            int digit = n%10;
            // digit ki freq incrs karo
            map.put(digit, map.getOrDefault(digit, 0) + 1);
            // last digit remove karo
            n /= 10;
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int digit = entry.getKey();
            int freq  = entry.getValue();

            ans += digit*freq;
        }
        return ans;
    }
}