class Solution {
    public int minBitFlips(int start, int goal) {
        String num1 = Integer.toBinaryString(start);
        String num2 = Integer.toBinaryString(goal);
        
        // Pad the shorter string with leading zeros
        int length = Math.max(num1.length(), num2.length());
        num1 = String.format("%" + length + "s", num1).replace(' ', '0');
        num2 = String.format("%" + length + "s", num2).replace(' ', '0');

        int count = 0;
        for (int i = 0; i < length; i++) {
            if (num1.charAt(i) != num2.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}