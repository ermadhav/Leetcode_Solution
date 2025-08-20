class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // ans = total bottles drunk
        int ans = numBottles; 
        // empty = empty bottles after drinking
        int empty = numBottles;  

        // keep exchanging empty bottles for new full ones
        while (empty >= numExchange) {
            // get new full bottles by exchanging
            int newBottles = empty / numExchange;
            ans += newBottles;  // drink these new bottles
            // update empty bottles: leftover + newly emptied
            empty = empty % numExchange + newBottles; 
        }
        return ans; // total bottles drunk
    }
}
