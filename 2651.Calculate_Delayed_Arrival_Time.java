class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        // Calculate the raw arrival time by adding delay to the original arrival time
        int num = arrivalTime + delayedTime;
        
        // If the time goes beyond 24 hours (i.e., next day), wrap it around using 24-hour clock format
        if (num >= 24) {
            num = num - 24;
        }

        // Return the adjusted arrival time
        return num;
    }
}


