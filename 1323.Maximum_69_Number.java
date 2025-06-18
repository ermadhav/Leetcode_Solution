class Solution {
    public int maximum69Number(int num) {
        // Convert the number to a char array
        char[] digits = Integer.toString(num).toCharArray();

        // Change the first '6' to '9' to maximize the number
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break; // Only change one digit
            }
        }
        // Convert the updated char array back to an integer
        return Integer.parseInt(new String(digits));
    }
}