import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        // Count each number's frequency
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int card : deck)
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        
        // Find GCD of all frequencies
        int gcd = 0;
        for (int count : countMap.values())
            gcd = computeGCD(gcd, count);

        // Valid if GCD > 1
        return gcd > 1;
    }

    // GCD function
    private int computeGCD(int a, int b) {
        return b == 0 ? a : computeGCD(b, a % b);
    }
}
