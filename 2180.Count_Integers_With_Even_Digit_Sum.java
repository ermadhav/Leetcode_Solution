class Solution {
    public int countEven(int num) {
        int count = 0;  // This will store the count of numbers with even digit sums

        // Loop from 1 to num
        for (int i = 1; i <= num; i++) {
            String s = Integer.toString(i);  // Convert the current number to a string
            int sum = 0;  // Reset sum for each number

            // Loop through each character (digit) in the string
            for (int j = 0; j < s.length(); j++) {
                // Convert character to digit and add to sum
                sum += Character.getNumericValue(s.charAt(j));
            }

            // If the digit sum is even, increment the count
            if (sum % 2 == 0) {
                count++;
            }
        }

        return count;  // Return the total count
    }
}