class Solution {
    public boolean isThree(int n) {
        int count = 0; // Initialize a counter to count the number of divisors

        // Loop from 1 to n to check all possible divisors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // If i divides n evenly, it's a divisor
                count++;      // Increment the count of divisors
            }
        }

        // Return true only if n has exactly 3 divisors
        return count == 3;
    }
}
