class Solution {
    public int mirrorDistance(int n) {

        int original = n;   // save original number
        int reverse = 0;    // store reversed number

        while (n != 0) {
            int digit = n % 10;              // get last digit
            reverse = reverse * 10 + digit; // add digit to reverse
            n = n / 10;                      // remove last digit
        }

        int num = Math.abs(original - reverse); // find distance
        return num;                             // return result
    }
}
