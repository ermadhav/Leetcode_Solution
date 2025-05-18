class Solution {
    public int addDigits(int num) {
        int sum = 0;

        // If the number is 0, return 0 (special case)
        if (num == 0) {
            return 0;
        }

        // If the number is divisible by 9, the result is 9
        if (num % 9 == 0) {
            sum = 9;
        }

        // If not divisible by 9, return the remainder (digital root)
        if (num % 9 != 0) {
            sum = num % 9;
        }

        // Return the result
        return sum;
    }
}
