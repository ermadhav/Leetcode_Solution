class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> factors = new HashSet<>();
        for(int num : nums){
            for(int i=2; i<= num;i++){
                while(num%i==0){
                    factors.add(i);
                    num /= i;
                }
            }
        }
        return factors.size();
    }
}