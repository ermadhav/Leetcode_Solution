import java.util.Arrays;

public class Solution {
    public int minSum(int num) {
        // Convert the number to a character array of digits
        char[] digits = Integer.toString(num).toCharArray();
        
        // Sort the digits in ascending order to help form smaller numbers
        Arrays.sort(digits);
        
        // Initialize two empty strings to store the two numbers
        String num1 = "", num2 = "";
        
        // Distribute the sorted digits between num1 and num2 alternatively
        for (int i = 0; i < digits.length; i++) {
            if (i % 2 == 0) 
                num1 += digits[i];  // Add digit to num1 if index is even
            else 
                num2 += digits[i];  // Add digit to num2 if index is odd
        }
        
        // Convert the two strings back to integers and return their sum
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test the function with num = 2932 and print the result
        System.out.println(solution.minSum(2932));  // Output: 52
    }
}
