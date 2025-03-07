class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] expected = new int[heights.length];

        // Copy heights array to expected before sorting
        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }

        // Sort the expected array (Bubble Sort from your original code)
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected.length - i - 1; j++) {
                if (expected[j] > expected[j + 1]) {
                    int temp = expected[j];
                    expected[j] = expected[j + 1];
                    expected[j + 1] = temp;
                }
            }
        }

        // Count mismatches
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}
