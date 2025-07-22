class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        // Pick as many 1s as possible (to maximize sum)
        int ones = Math.min(numOnes, k);
        k -= ones; // reduce k by number of 1s picked

        // Pick as many 0s as needed (sum stays same)
        k -= Math.min(numZeros, k); // reduce k by zeros picked

        // Remaining k items must be -1s, subtract them from sum
        return ones - k;
    }
}