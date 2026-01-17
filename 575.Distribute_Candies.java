class Solution {
    public int distributeCandies(int[] candyType) {
        // Set to store unique candy types
        Set<Integer> set = new HashSet<>();

        // Add all candy types to the set
        for (int x : candyType) {
            set.add(x);
        }

        // Count of unique candy types
        int unique = set.size();

        // Sister can eat at most half of the candies
        int ans = Math.min(unique, candyType.length / 2);

        // Return the maximum number of different candies she can eat
        return ans;
    }
}
