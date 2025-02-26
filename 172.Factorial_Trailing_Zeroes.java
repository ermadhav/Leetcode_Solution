class Solution {
    public int trailingZeroes(int n) {
        int count = 0; // Initialize count to store the number of trailing zeroes

        // Loop to count factors of 5 in n!
        while (n > 0) {
            n /= 5; // Divide n by 5 to count multiples of 5
            count += n; // Add the quotient to count (number of times 5 is a factor)
        }

        return count; // Return the total count of trailing zeroes
    }
}
