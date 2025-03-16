class Solution {
    public int climbStairs(int n) {
        // Base cases
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        // Variables to store the number of ways to reach step n-1 and n-2
        int first = 1, second = 2;
        
        // Iterating from 3 to n
        for (int i = 3; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }

        // The result will be in second after the loop
        return second;
    }
}