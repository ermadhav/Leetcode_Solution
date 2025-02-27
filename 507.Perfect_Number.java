class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false; // Perfect numbers must be greater than 1

        int sum = 1; // 1 is always a divisor of any number
        for (int i = 2; i * i <= num; i++) { // Iterate from 2 to sqrt(num)
            if (num % i == 0) { // If i is a divisor of num
                sum += i; // Add i to the sum
                if (i != num / i) { // Avoid adding the same divisor twice
                    sum += num / i; // Add the corresponding divisor
                }
            }
        }
        return sum == num; // Return true if sum equals num
    }
}
