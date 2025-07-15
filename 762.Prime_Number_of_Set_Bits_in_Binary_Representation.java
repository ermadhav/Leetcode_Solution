class Solution {
    public int countPrimeSetBits(int left, int right) {
        // Set of prime numbers up to 32 (maximum possible set bits in a 32-bit integer)
        Set<Integer> primes = Set.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31);
        
        int count = 0;

        // Loop through the range [left, right]
        for (int i = left; i <= right; i++) {
            // Count the number of 1's in the binary representation of i
            int setBits = Integer.bitCount(i);

            // If the number of set bits is a prime number, increment the count
            if (primes.contains(setBits)) {
                count++;
            }
        }

        return count;
    }
}