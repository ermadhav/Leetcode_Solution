class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);  // check if the least significant bit is 1
            n = n >>> 1;       // unsigned right shift by 1 to process the next bit
        }
        return count;
    }
}
