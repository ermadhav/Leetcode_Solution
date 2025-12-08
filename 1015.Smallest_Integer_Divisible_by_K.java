class Solution {
    public int smallestRepunitDivByK(int k) {
        // If k is divisible by 2 or 5, it's impossible to form such a number
        if (k % 2 == 0 || k % 5 == 0) return -1; 

        int remainder = 0;
        // Try numbers of length from 1 to k
        for (int length = 1; length <= k; length++) {
            // Build remainder for number made of '1's
            remainder = (remainder * 10 + 1) % k;
            // If remainder is 0, we found the length
            if (remainder == 0) return length; 
        }
        // No such number found
        return -1;
    }

