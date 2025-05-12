class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
         // Step 1: Give each child at least one candy
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // Step 2: Left to Right - if right child has higher rating than left, give more candies
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Right to Left - if left child has higher rating than right, give more candies
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Step 4: Sum up all candies
        int totalCandies = 0;
        for (int c : candies) {
            totalCandies += c;
        }

        return totalCandies;
    }
}