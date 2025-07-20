class Solution {
    public String largestOddNumber(String num) {
        // Check digits from end to start
        for (int i = num.length() - 1; i >= 0; i--) {
            // If digit is odd, return substring up to here
            if ((num.charAt(i) - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        // No odd digit found
        return "";
    }
}
