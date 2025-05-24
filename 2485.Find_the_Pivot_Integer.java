class Solution {
    public int pivotInteger(int n) {
        // Go through each number from 1 to n
        for (int i = 1; i <= n; i++) {
            // Sum from 1 to i
            int left = (i * (i + 1)) / 2;

            // Sum from i to n
            int right = (n * (n + 1)) / 2 - (i * (i - 1)) / 2;

            // If both sums are equal, return i
            if (left == right) return i;
        }

        // If no such number found, return -1
        return -1;
    }
}
