class Solution {
    public int reinitializePermutation(int n) {
        int pos = 1;    // Track the position of index 1 after operations
        int count = 0;  // Count the number of operations

        do {
            // Apply the transformation rule to the position
            if (pos % 2 == 0)
                pos /= 2;
            else
                pos = n / 2 + (pos - 1) / 2;

            count++;  // Increment operation count
        } while (pos != 1);  // Repeat until position returns to 1

        return count;  // Minimum number of operations needed
    }
}
