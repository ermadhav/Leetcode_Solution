class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = arr[0]; // Assume first element is the max
        int ans = 0; // To store index of peak

        for (int i = 0; i < arr.length; i++) {
            // Check if current element is greater than max
            // and next element is smaller (peak condition)
            if (arr[i] > max && arr[i + 1] < arr[i]) {
                max = arr[i]; // Update max
                ans = i; // Store peak index
                break; // No need to continue
            }
        }

        return ans; // Return peak index
    }
}
