class Solution {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int n = digits.length;

        // Store last index of each digit (0-9)
        int[] last = new int[10];
        for (int i = 0; i < n; i++) {
            last[digits[i] - '0'] = i;
        }

        // Try to swap
        for (int i = 0; i < n; i++) {
            int current = digits[i] - '0';
            // Look for a larger digit from 9 down to current+1
            for (int d = 9; d > current; d--) {
                if (last[d] > i) {
                    // Swap
                    char temp = digits[i];
                    digits[i] = digits[last[d]];
                    digits[last[d]] = temp;

                    // Return result after one swap
                    return Integer.parseInt(new String(digits));
                }
            }
        }

        // If no swap improves the number, return original
        return num;
    }
}