class Solution {
    public int findMinFibonacciNumbers(int k) {
        int a = 1, b = 1, count = 0;
        
        // Generate the largest Fibonacci number <= k
        while (b <= k) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        
        // Subtract Fibonacci numbers from k starting from the largest
        while (k > 0) {
            if (a <= k) {
                k -= a;   // Use this Fibonacci number
                count++;  // Increase count
            } else {
                // Move to the previous Fibonacci number by reversing the sum
                int temp = b - a;
                b = a;
                a = temp;
            }
        }
        
        return count; // Return the minimum count
    }
}