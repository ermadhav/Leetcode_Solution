class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);  // Sort the array
        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;  // Start with a very large value

        // First, find the minimum difference
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];  // Calculate the difference
            minDiff = Math.min(minDiff, diff);  // Update minDiff
        }

        // Now, collect all pairs with the minimum difference
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];  // Calculate the difference again
            if (diff == minDiff) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));  // Add pair to result
            }
        }

        return result;
    }
}
