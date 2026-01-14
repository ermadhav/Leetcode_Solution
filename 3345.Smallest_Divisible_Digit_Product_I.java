class Solution {
    public int smallestNumber(int n, int t) {

        while (true) {
            int num = n;
            int prod = 1;

            // calculate product of digits
            while (num != 0) {
                int digit = num % 10;
                prod *= digit;
                num = num / 10;
            }

            // check divisibility
            if (prod % t == 0) {
                return n;
            }

            n++; // try next number
        }
    }
}
