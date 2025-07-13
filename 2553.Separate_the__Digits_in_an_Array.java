import java.util.Arrays;

class Solution {
    public int[] separateDigits(int[] nums) {
        // StringBuilder to store all digits as a single string
        StringBuilder sb = new StringBuilder();

        // Iterate through each number in the array
        for (int num : nums) {
            // Append the number to the StringBuilder (converted to string automatically)
            sb.append(num);
        }

        // Convert the StringBuilder to a String containing all digits
        String str = sb.toString();

        // Create an integer array to hold the separated digits
        int[] arr = new int[str.length()];

        // Convert each character in the string to its numeric digit
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0'; // '0' is subtracted to get the actual digit value
        }

        // Return the array of separated digits
        return arr;
    }
}
