class Solution {
    public int[] replaceElements(int[] arr) {
        // Loop through each element except the last one
        for (int i = 0; i < arr.length - 1; i++) {
            int max = Integer.MIN_VALUE; // Initialize max for current position
            // Find the maximum element to the right of current element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max; // Replace current element with max found
        }
        arr[arr.length - 1] = -1; // Last element is always -1
        return arr;
    }
}
