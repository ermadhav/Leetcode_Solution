class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;      // Calculate carry
            a = a ^ b;              // Sum without carry
            b = carry << 1;         // Shift carry
        }
        return a;
    }
}