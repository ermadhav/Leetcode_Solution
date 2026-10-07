class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // counting the frequency of each number
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        //findinf the first unique even number
        for(int num:nums){
            if(num%2 == 0 && map.get(num) == 1){
                return num;
            }
        }
        // if no unique even number found
        return -1;
    }
}