class Solution {
    public int numberOfSteps(int num) {
        int count = 0;

        // Repeat steps until num becomes 0
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2; // If even, divide by 2
            } else {
                num -= 1; // If odd, subtract 1
            }
            count++; // Increase step count
        }

        return count; // Return total steps
    }
}
