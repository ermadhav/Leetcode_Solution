class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drank = 0; // total bottles drunk
        int empty = 0; // empty bottles
        
        while (numBottles > 0) {
            // Drink all available full bottles
            drank += numBottles;
            empty += numBottles;
            numBottles = 0;
            
            // Try to exchange
            if (empty >= numExchange) {
                empty -= numExchange; // spend empty bottles
                numBottles += 1;      // gain a full bottle
                numExchange++;        // exchange cost increases
            } else {
                break; // can't exchange anymore
            }
        }
        
        return drank;
    }
}
