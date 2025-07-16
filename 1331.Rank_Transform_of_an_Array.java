class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // Clone the original array to sort without modifying it
        int[] sorted = arr.clone();
        Arrays.sort(sorted); // Sort the cloned array

        // Map to store the rank of each unique number
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        // Assign ranks to unique elements in sorted order
        for (int num : sorted) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++); // Assign rank and increment
            }
        }

        // Replace each element in the original array with its rank
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr; // Return the ranked array
    }
}