class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int mod = 0; // stores current prefix value modulo 5

        for(int bit : nums){
            mod = (mod * 2 + bit) % 5; // update modulo after adding new bit
            result.add(mod == 0); // check if divisible by 5
        }

        return result;
    }
}
