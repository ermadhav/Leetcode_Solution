class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0; // To store the highest altitude
        int alt = 0; // Current altitude, starts at 0

        // Iterate through each gain value
        for (int g : gain) {
            alt += g; // Update current altitude
            max = Math.max(max, alt); // Update max if current altitude is higher
        }

        return max; // Return the highest altitude reached
    }
}