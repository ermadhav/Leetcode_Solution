class Solution {
    public int findComplement(int num) {
        // Convert the integer num to its binary string representation
        String s = Integer.toBinaryString(num);

        // Use StringBuilder to build the complement binary string
        StringBuilder sb = new StringBuilder();

        // Iterate through each character (bit) in the binary string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If the bit is '0', change it to '1'
            if (c == '0') {
                sb.append('1');
            }
            // If the bit is '1', change it to '0'
            else if (c == '1') {
                sb.append('0');
            }
        }

        // Convert the complemented binary string back to a decimal integer
        int decimal = Integer.parseInt(sb.toString(), 2);

        // Return the complement as an integer
        return decimal;
    }
}
