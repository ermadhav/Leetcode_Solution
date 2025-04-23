class Solution {
    public int minMoves(int[] nums) {
        // Sort the array using bubble sort to bring the smallest element to the front
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                // Swap if the current element is smaller than the previous one
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }

        // After sorting, the first element is the smallest
        int first = nums[0];

        // Calculate the sum of all elements
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        // Minimum number of moves = total sum - (min element * number of elements)
        int ans = sum - (first * nums.length);

        // Return the total number of moves required
        return ans;
    }
}
