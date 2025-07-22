class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int ones = Math.min(numOnes, k);
        k -= ones;
        k -= Math.min(numZeros, k);
        return ones-k;
    }
}