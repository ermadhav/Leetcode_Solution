class Solution {
    public int maximumCandies(int[] candies, long k) {
        long totalCandies = 0;  // Stores the total number of candies available
        long maxCandy = 0;  // Stores the maximum number of candies in a single pile

        // Compute total candies and find the largest candy pile
        for (int c : candies) {
            totalCandies += c;  
            maxCandy = Math.max(maxCandy, c);
        }

        // If total candies are less than k, it's impossible to give at least 1 candy per child
        if (totalCandies < k) return 0;

        long left = 1, right = maxCandy, best = 0;  // Define binary search range

        while (left <= right) {
            long mid = left + (right - left) / 2;  // Middle value to test as possible max candies per child
            long count = 0;  // Stores how many children can be served with 'mid' candies

            // Count how many children can be served if each gets 'mid' candies
            for (int c : candies) {
                count += c / mid;  // Each pile contributes c / mid children
            }

            if (count >= k) {  
                // If we can serve at least k children, it's a valid distribution
                best = mid;  // Store the best valid mid value so far
                left = mid + 1;  // Try to increase mid to see if we can give more candies per child
            } else {
                // If we cannot serve enough children, reduce the number of candies per child
                right = mid - 1;
            }
        }

        return (int) best;  // Return the maximum candies each child can get
    }
}
