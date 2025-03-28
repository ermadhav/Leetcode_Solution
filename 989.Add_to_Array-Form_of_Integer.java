import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>(); // List to store the final result
        int i = num.length - 1; // Start from the last digit of num
        int carry = k; // Initialize carry with k
        
        while (i >= 0 || carry > 0) { // Process until all digits and carry are handled
            if (i >= 0) {
                carry += num[i]; // Add the current digit to carry
                i--; // Move to the previous digit
            }
            result.add(carry % 10); // Extract the last digit and add to the result list
            carry /= 10; // Remove the last digit from carry
        }
        
        Collections.reverse(result); // Reverse the list to get the correct order
        return result; // Return the final list representing the sum
    }
}
