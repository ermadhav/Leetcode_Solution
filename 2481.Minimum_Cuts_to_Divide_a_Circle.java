class Solution {
    public int numberOfCuts(int n) {
        // If there's only 1 slice, no cuts are needed
        if (n == 1) return 0;
        
        // If n is even, number of cuts is n/2
        if (n % 2 == 0) return n / 2;
        
        // If n is odd, number of cuts equals n
        return n;
    }
}
