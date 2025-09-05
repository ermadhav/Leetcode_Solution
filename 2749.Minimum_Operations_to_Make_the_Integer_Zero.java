class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        if (num1 == 0)
            return 0; // already zero
        for (int k = 1; k <= 60; k++) { // try k ops
            long x = (long) num1 - (long) k * num2; // remaining after k*num2
            if (x < 0)
                break; // too small
            if (Long.bitCount(x) <= k && k <= x)
                return k; // valid
        }
        return -1; // impossible
    }
}