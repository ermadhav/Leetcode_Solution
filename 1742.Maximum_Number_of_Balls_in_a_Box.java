class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] box = new int[100]; // stores count of balls in each box
        int max = 0;              // tracks the maximum balls in any box
        
        for (int i = lowLimit; i <= highLimit; i++) {
            int s = 0, n = i;
            
            // calculate sum of digits (box number)
            while (n > 0) { 
                s += n % 10; 
                n /= 10; 
            }
            
            // place ball in box and update max
            max = Math.max(max, ++box[s]);
        }
        return max; // return box with most balls
    }
}
