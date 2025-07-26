class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;      // Running sum
    int minSum = 0;   // Minimum running sum
    
    for (int num : nums) {
        sum += num;               // Update sum
        minSum = Math.min(minSum, sum);  // Track min sum
    }
    
    return 1 - minSum;  // Minimum startValue to keep sum ≥ 1
    }
}