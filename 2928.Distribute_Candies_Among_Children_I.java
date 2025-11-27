class Solution {
    public int distributeCandies(int n, int limit) {
        // 'ways' will count all valid distributions of candies
        int ways = 0;

        // Try all possible values for the first child (a)
        for (int a = 0; a <= limit; a++) {

            // Try all possible values for the second child (b)
            for (int b = 0; b <= limit; b++) {

                // Compute candies left for the third child (c)
                int c = n - a - b;

                // Check if c is a valid amount (between 0 and limit)
                if (c >= 0 && c <= limit) {
                    ways++;  // Count this valid distribution
                }
            }
        }

        // Return the total number of valid ways to distribute candies
        return ways;
    }
}
