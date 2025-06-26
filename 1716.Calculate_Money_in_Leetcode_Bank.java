class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;           // Number of full weeks
        int days = n % 7;            // Remaining days
        int total = 0;

        // Sum of full weeks
        for (int i = 0; i < weeks; i++) {
            total += 7 * (i + 1) + (0 + 6) * 7 / 2;  // (start of week + sum of 0..6)
            // Simplified: total += 7 * (i + 1) + 21;
        }

        // Sum of extra days (starting from next week's Monday)
        for (int i = 0; i < days; i++) {
            total += weeks + 1 + i;
        }

        return total;
    }
}
