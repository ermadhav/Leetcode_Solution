class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for (char ch : n.toCharArray()) {
            int digit = ch - '0'; // Convert character to integer
            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }
        return maxDigit;
    }
}