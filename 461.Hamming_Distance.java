class Solution {
    public int hammingDistance(int x, int y) {
        String num1 = Integer.toBinaryString(x);
        String num2 = Integer.toBinaryString(y);
        
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
