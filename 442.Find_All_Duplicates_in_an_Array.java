import java.util.ArrayList;
import java.util.List;

class Solution {
    // Method to find duplicate numbers in the array
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;

        // Cyclic sort: Place each number at its correct index (nums[i] -> index nums[i]-1)
        while (i < nums.length) {
            int correct = nums[i] - 1;
            // If the number is not at the correct index and not already a duplicate
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct); // Swap to place the number at its correct index
            } else {
                i++; // Move to the next index if it's already in the correct place or a duplicate
            }
        }

        // After sorting, collect all numbers that are not at the correct index
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            // If a number is not at the index it should be (index + 1), it is a duplicate
            if (nums[index] != index + 1) {
                ans.add(nums[index]);
            }
        }

        return ans; // Return the list of duplicates
    }

    // Helper method to swap two elements in the array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
