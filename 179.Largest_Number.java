import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
      // Convert each integer in the array to a string
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        
        // Sort the array of strings using a custom comparator
        // Compare concatenated strings "b + a" vs "a + b"
        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is "0", return "0" (to handle edge case like [0, 0])
        if (strs[0].equals("0")) return "0";

        // Build the result string by concatenating the sorted strings
        StringBuilder result = new StringBuilder();
        for (String s : strs) {
            result.append(s);
        }
        
        // Return the final concatenated string as the largest number
        return result.toString();
    }
}