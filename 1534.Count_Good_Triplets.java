class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0; // Initialize counter for good triplets
        // Iterate through all possible triplets with i < j < k
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    // Check the three conditions for a "good" triplet
                    if (Math.abs(arr[i] - arr[j]) <= a &&
                        Math.abs(arr[j] - arr[k]) <= b &&
                        Math.abs(arr[i] - arr[k]) <= c) {
                        count++; // If all conditions are satisfied, increment count
                    }
                }
            }
        }

        return count; // Return the total number of good triplets
    }
}