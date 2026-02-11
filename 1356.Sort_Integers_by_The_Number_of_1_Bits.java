class Solution {
    public int[] sortByBits(int[] arr) {
        
        // Convert int[] to Integer[] for custom sorting
        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        // Sort numbers based on number of set bits (1s in binary)
        Arrays.sort(nums, (a, b) -> {
            int countA = Integer.bitCount(a); // Count 1s in a
            int countB = Integer.bitCount(b); // Count 1s in b
            
            // If bit counts are same, sort by number value
            if (countA == countB) {
                return a - b;
            }
            
            // Otherwise sort by bit count
            return countA - countB;
        });
        
        // Copy sorted values back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }
        
        return arr; // Return sorted array
    }
}
