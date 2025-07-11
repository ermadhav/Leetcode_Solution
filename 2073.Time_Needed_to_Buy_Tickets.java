class Solution {
    public int minRequiredToBuy(int[] tickets, int k) {
        int min = 0;  // Variable to store total min taken
        
        // Iterate over each person in the queue
        for(int i = 0; i < tickets.length; i++) {
            if(i <= k) {
                // For people in front of or at position k,
                // add the minimum of their tickets or tickets[k]
                min += Math.min(tickets[i], tickets[k]);
            } else {
                // For people behind position k,
                // add the minimum of their tickets or (tickets[k] - 1)
                min += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        
        return min;  // Return total min taken for person k to finish
    }
}
