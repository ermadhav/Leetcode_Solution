class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target); // same for + or -
        int sum = 0, steps = 0;

        // move until sum >= target and difference is even
        while (sum < target || (sum - target) % 2 != 0) 
            sum += ++steps;

        return steps; // min moves
    }
}