class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length, zeros = 0;

        // Count total number of zeros in the array
        for (int x : arr) if (x == 0) zeros++;

        // Traverse from the end and shift elements to the right
        for (int i = n - 1, j = n + zeros - 1; i >= 0; i--, j--) {

            // Copy element if target index is within array bounds
            if (j < n) arr[j] = arr[i];

            // If element is zero, duplicate it
            if (arr[i] == 0) {
                j--;
                if (j < n) arr[j] = 0;
            }
        }
    }
}
