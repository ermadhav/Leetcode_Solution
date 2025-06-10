class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;  // total gas - total cost
        int currentTank = 0; // gas in tank while traveling
        int start = 0;       // candidate start station
        for (int i = 0; i < gas.length; i++) {
            totalTank += gas[i] - cost[i];
            currentTank += gas[i] - cost[i];

            // If tank is negative, cannot start from 'start' to i, reset start
            if (currentTank < 0) {
                start = i + 1;   // try next station as start
                currentTank = 0; // reset current tank
            }
        }
        // If total gas is enough to cover total cost, return start, else -1
        return totalTank >= 0 ? start : -1;
    }
}