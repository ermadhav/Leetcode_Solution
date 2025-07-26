class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        // Create a list to store the indices of peak elements
        List<Integer> list = new ArrayList<>();

        // Iterate through the array from the second element to the second last
        for(int i = 1; i < mountain.length - 1; i++) {
            // Check if the current element is greater than both its neighbors
            if(mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                // If it's a peak, add its index to the list
                list.add(i);
            }
        }

        // Return the list of peak indices
        return list;
    }
}
