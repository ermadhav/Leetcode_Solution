class Solution {
    public int sumOfMultiples(int n) {
        int ans = 0; // Variable to store the sum of multiples
        for(int i = 1; i <= n; i++) { // Loop through all numbers from 1 to n
            // Check if i is divisible by 3, 5, or 7
            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                ans += i; // Add i to the sum if it's a multiple of 3, 5, or 7
            }
        }
        return ans; // Return the final sum
    }
}
