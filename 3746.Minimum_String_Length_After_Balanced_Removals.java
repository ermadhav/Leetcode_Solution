class Solution {
    public int minLengthAfterRemovals(String s) {
        int count = 0; // tracks difference between 'a' and other characters
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') count++; // increment for 'a'
            else count--; // decrement for non-'a'
        }
        return Math.abs(count); // remaining length after removals
    }
}
