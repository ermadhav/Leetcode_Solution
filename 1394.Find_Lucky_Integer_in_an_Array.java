class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num :arr) freq.put(num, freq.getOrDefault(num, 0)+1);

        int res =-1;
        for(int num : freq.keySet()){
            if(num == freq.get(num)){
                res = Math.max(res, num);
            }
        }
        return res;
    }
}