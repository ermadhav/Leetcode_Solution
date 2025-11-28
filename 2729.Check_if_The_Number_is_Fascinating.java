class Solution {
    public boolean isFascinating(int n) {
        int n2 = n * 2;
        int n3 = n * 3;

        // Concatenate n, 2*n, and 3*n into one string
        String s = "" + n + n2 + n3;

        // A fascinating number must have exactly 9 digits
        if (s.length() != 9) return false;

        // Check digit frequency
        int[] freq = new int[10];

        for (char c : s.toCharArray()) {
            int digit = c - '0';
            if (digit == 0) return false;     // No zeros allowed
            freq[digit]++;

            if (freq[digit] > 1) return false; // Digits 1–9 must appear exactly once
        }

        // All digits 1–9 must appear once
        for (int i = 1; i <= 9; i++) {
            if (freq[i] != 1) return false;
        }

        return true;
    }
}
