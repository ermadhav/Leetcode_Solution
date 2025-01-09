class Solution {
    public int scoreOfString(String s) {
        int sum = 0;

        // Interating through the String
        for (int i = 1; i < s.length(); i++) {

            // Adding the absolute difference between the current character and the previous
            // character to the sum.
            sum += Math.abs(s.charAt(i - 1) - s.charAt(i));
        }
        return sum;
    }
}