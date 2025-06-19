class Solution {
    public int binaryGap(int n) {
        int last = -1, max = 0; // last: position of previous 1, max: longest distance
        for (int i = 0; n > 0; n >>= 1, i++) { // loop through each bit
            if ((n & 1) == 1) { // if current bit is 1
                if (last != -1) max = Math.max(max, i - last); // update max distance
                last = i; // update last 1's position
            }
        }
        return max; // return the longest distance
    }
}