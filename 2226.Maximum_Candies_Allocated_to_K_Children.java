class Solution {
    public int maximumCandies(int[] candies, long k) {
        long totalCandies = 0;
        long maxCandy = 0;

        for (int c : candies) {
            totalCandies += c;
            maxCandy = Math.max(maxCandy, c);
        }

        if (totalCandies < k) return 0; 
        long left = 1, right = maxCandy, best = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long count = 0;

            for (int c : candies) count += c / mid; 
            
            if (count >= k) {
                best = mid; 
                left = mid + 1;
            } else {
                right = mid - 1; 
            }
        }

        return (int) best;
    }
}
