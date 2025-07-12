class Solution {
    public int countOperations(int num1, int num2) {
        int count = 0; // Initialize a counter to track the number of operations

        // Continue looping until either num1 or num2 becomes 0
        while (num1 != 0 && num2 != 0) {
            // If num1 is greater than or equal to num2, subtract num2 from num1
            if (num1 >= num2) {
                num1 = num1 - num2;
            } else {
                // If num2 is greater than num1, subtract num1 from num2
                num2 = num2 - num1;
            }

            count++; // Increment the operation count after each subtraction
        }

        // Return the total number of operations performed
        return count;
    }
}
