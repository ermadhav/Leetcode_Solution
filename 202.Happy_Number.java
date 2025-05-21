import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        // Set to remember numbers we've already seen
        Set<Integer> seen = new HashSet<>();
        
        // Keep going until we reach 1 (happy) or repeat a number (not happy)
        while (n != 1 && !seen.contains(n)) {
            seen.add(n); // Mark number as seen

            String numStr = Integer.toString(n);
            int ans = 0;

            // Get each digit and add its square to ans
            for (int i = 0; i < numStr.length(); i++) {
                int digit = Character.getNumericValue(numStr.charAt(i));
                ans += digit * digit;
            }

            // Update n with the sum of squares
            n = ans;
        }

        // If we reached 1, it's a happy number
        return n == 1;
    }
}
