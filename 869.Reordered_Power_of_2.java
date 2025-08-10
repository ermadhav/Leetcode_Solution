import java.util.*;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        // Sort digits of n for comparison
        String s = sort(n);
        
        // Loop through all powers of 2 less than 1 billion
        for (int i = 1; i < 1_000_000_000; i <<= 1) {
            // If sorted digits match, then n can be rearranged to this power of 2
            if (s.equals(sort(i))) return true;
        }
        
        // No match found
        return false;
    }

    // Helper method to sort digits of a number
    String sort(int x) {
        char[] a = String.valueOf(x).toCharArray(); // convert number to char array
        Arrays.sort(a); // sort digits
        return new String(a); // return sorted digits as string
    }
}
