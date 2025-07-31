class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int total = 0;
        for (int num : nums) {
            String s = String.valueOf(num);
            char maxDigit = (char) s.chars().max().getAsInt();
            int encrypted = Integer.parseInt(String.valueOf((char) maxDigit).repeat(s.length()));
            total += encrypted;
        }
        return total;
    }
}