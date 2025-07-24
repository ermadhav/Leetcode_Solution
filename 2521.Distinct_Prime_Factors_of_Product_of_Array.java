class Solution {
    public int distinctPrimeFactors(int[] nums) {
        // Function to count distinct prime factors in the product of nums
    public static int countDistinctPrimeFactors(int[] nums) {
        Set<Integer> factors = new HashSet<>();  // To store unique prime factors
        
        // For each number in the array
        for (int num : nums) {
            // Check possible factors from 2 up to num
            for (int i = 2; i <= num; i++) {
                // While i divides num, add i to set and divide num by i
                while (num % i == 0) {
                    factors.add(i);
                    num /= i;
                }
            }
        }
        
        return factors.size();  // Return count of distinct prime factors
    }
}