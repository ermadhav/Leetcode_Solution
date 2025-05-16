class Solution {
    // Method to compute the nth Fibonacci number using recursion
    public int fib(int n) {
        // Base case: if n is 0 or 1, return n
        if(n < 2){
            return n;
        }
        // Recursive case: return the sum of the two preceding Fibonacci numbers
        return fib(n - 1) + fib(n - 2);
    }
}
