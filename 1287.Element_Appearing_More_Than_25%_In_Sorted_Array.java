class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length, quarter = n / 4;
        
        // Iterate through the array, stopping at n - quarter to avoid out-of-bounds errors
        for (int i = 0; i < n - quarter; i++) {
            // Since the array is sorted, if arr[i] appears more than 25% times,
            // it must be present at arr[i + quarter]
            if (arr[i] == arr[i + quarter]) return arr[i];
        }
        
        return -1; // This case should never occur as per the problem statement
    }
}
