import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        
        // Initialize an ArrayList to store the result
        List<String> answer = new ArrayList<>();
        
        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } 
            // Check if the number is only divisible by 3
            else if (i % 3 == 0) {
                answer.add("Fizz");
            } 
            // Check if the number is only divisible by 5
            else if (i % 5 == 0) {
                answer.add("Buzz");
            } 
            // If none of the above conditions are met, add the number as a string
            else {
                answer.add(String.valueOf(i));
            }
        }
        
        // Return the final list containing the FizzBuzz sequence
        return answer;
    }
}
